public class Main{
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        Empleado intendente = new Empleado();
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos();

        System.out.println("Área enteros: "+rectangulo.calcularArea(3, 2));
        System.out.println("Perímetro enteros: "+rectangulo.calcularPerimetro(3, 2));
        System.out.println("Área dobles: "+rectangulo.calcularArea(2.5, 4.5));
        System.out.println("Perímetro dobles: "+rectangulo.calcularPerimetro(2.5, 4.5));


        System.out.println("Solo sueldo base: "+intendente.calcularSalario(1500));
        System.out.println("Sueldo base y bonificación: "+intendente.calcularSalario(1500, 100));
        System.out.println("Sueldo base, bonificación y horas extra: "+intendente.calcularSalario(1500, 100, 5));

        System.out.println("Solo ingresos: "+calculadora.calcularImpuestos(26000));
        System.out.println("Ventas y porcentaje: "+calculadora.calcularImpuestos(26000, 16));
        System.out.println("Dividendos, porcentaje y exención (R=0): "+calculadora.calcularImpuestos(1000, 16, 2000));
        System.out.println("Dividendos, porcentaje y exención: "+calculadora.calcularImpuestos(1000, 16, 0));
    }
}