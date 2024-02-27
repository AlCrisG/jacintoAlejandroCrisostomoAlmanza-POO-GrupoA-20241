public class Empleado {

    double calcularSalario(double sueldoBase){
        return sueldoBase;
    }

    double calcularSalario(double sueldoBase, double bonificacion){
        return sueldoBase + bonificacion;
    }

    double calcularSalario(double sueldoBase, double bonificacion, double hrsExtra){
        return sueldoBase + bonificacion + (hrsExtra * 20);
    }
}