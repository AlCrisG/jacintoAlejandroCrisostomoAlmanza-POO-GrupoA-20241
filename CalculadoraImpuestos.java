public class CalculadoraImpuestos {
    
    double calcularImpuestos(int ingresos){
        return ingresos + 0.15;
    }

    double calcularImpuestos(int ingresos, double porcentajeImpuesto){
        return ingresos * (porcentajeImpuesto / 100);
    }

    double calcularImpuestos(double dividendos, double porcentajeImpuesto, double exencion){
        double impuestos = dividendos * (porcentajeImpuesto / 100);
        if (impuestos>exencion){
            return impuestos - exencion;
        }
        else{
            return 0;
        }
    }
}
