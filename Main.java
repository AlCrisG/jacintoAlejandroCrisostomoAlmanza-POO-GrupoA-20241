import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Producto producto = new Producto("Coca-cola", 15, 75);
        int op;

        do {
            System.out.print("""
                    ***********************************
                    | Seleccione la tarea a ejecutar: |
                    | 1. Ver nombre                   |
                    | 2. Cambiar nombre               |
                    | 3. Ver precio                   |
                    | 4. Cambiar precio               |
                    | 5. Ver stock                    |
                    | 6. Aumentar stock               |
                    | 7. Reducir stock                |
                    | 8. Cerrar programa              |
                    ***********************************
                    Su elección:\s""");

            op = read.nextInt();

            switch (op) {
                case 1:
                    System.out.println(producto.getNombre());
                    break;
                case 2:
                    System.out.print("Nombre nuevo: ");
                    read.nextLine();
                    producto.setNombre(read.nextLine());
                    break;
                case 3:
                    System.out.println(producto.getPrecio());
                    break;
                case 4:
                    System.out.print("Precio nuevo: ");
                    producto.setPrecio(read.nextInt());
                    break;
                case 5:
                    System.out.println(producto.getStock());
                    break;
                case 6:
                    System.out.print("Cantidad a aumentar: ");
                    producto.aumentarStock(read.nextInt());
                    break;
                case 7:
                    System.out.print("Cantidad a reducir: ");
                    producto.reducirStock(read.nextInt());
                    break;
                case 8:
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
            System.out.println(); //Salto de línea
        } while(op!=8);
    }
}