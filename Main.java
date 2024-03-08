import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Bank banco = new Bank();

        Employee empleado1 = new Employee("Jose", "Chavez", 165732489, 'C');
        empleado1.addAccount(123456789, 'A');
        empleado1.addAccount(987654321, 'B');
        banco.agregarCuenta(empleado1.getAccounts().get(0));
        banco.agregarCuenta(empleado1.getAccounts().get(1));
        banco.agregarCuenta(empleado1.getAccounts().get(2));

        Employee empleado2 = new Employee("Juan", "Perez", 843612798, 'B');
        empleado2.addAccount(456789123, 'C');
        banco.agregarCuenta(empleado2.getAccounts().get(0));
        banco.agregarCuenta(empleado2.getAccounts().get(1));

        int op;
        do {
            System.out.print("""
                Seleccione una opción:
                1. Listar todos los usuarios con su información
                2. Mostrar información de un número de cuenta
                3. Mostrar todas las cuentas de un usuario
                4. Salir
                
                Su elección:\s""");


            op = read.nextInt();

            switch (op) {
                case 1:
                    banco.listarCuentas();
                    break;
                case 2:
                    System.out.println("Ingrese el número de cuenta del usuario:");
                    long numeroCuenta = read.nextLong();
                    banco.mostrarCuenta(numeroCuenta);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del usuario:");
                    String nombreUsuario = read.next();
                    System.out.println("Ingrese el apellido del usuario:");
                    String apellidoUsuario = read.next();
                    banco.mostrarCuentasUsuario(nombreUsuario, apellidoUsuario);
                    break;
                case 4:
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        } while (op != 4);
    }
}