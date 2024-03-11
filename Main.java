import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        Libreria libreria = new Libreria();
        int opcion, userID, bookID;
        String title;

        do{
            System.out.print("""
                    \n
                    ================================================
                    || Seleccione una opción:                     ||
                    || 1. Registrar usuario                       ||
                    || 2. Registrar libro                         ||
                    || 3. Rentar libro                            ||
                    || 4. Listar usuarios registrados             ||
                    || 5. Listar libros registrados               ||
                    || 6. Listar usuarios con libros rentados     ||
                    || 7. Listar libros rentados                  ||
                    || 8. Listar libros que no han sido rentados  ||
                    || 9. Cerrar programa                         ||
                    ================================================
                    
                    Su elección:\s""");
            opcion = read.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Nombre del usuario: ");
                    String name = leer.nextLine();
                    System.out.print("Apellido del usuario: ");
                    String lastName = leer.nextLine();
                    libreria.addUser(new Usuario(name, lastName));
                    break;

                case 2:
                    System.out.print("Titulo del libro: ");
                    title = leer.nextLine();
                    System.out.print("Autor del libro: ");
                    String author = leer.nextLine();
                    libreria.addBook(new Libro(title, author));
                    break;

                case 3:
                    System.out.print("Ingrese el ID del usuario que rentará: ");
                    userID = read.nextInt();
                    System.out.print("Ingrese el ID del libro a rentar: ");
                    bookID = read.nextInt();
                    libreria.rent(userID, bookID);
                    break;

                case 4:
                    System.out.println("================================================");
                    libreria.listUsers();
                    System.out.println("================================================");
                    break;

                case 5:
                    System.out.println("================================================");
                    libreria.listBooks();
                    System.out.println("================================================");
                    break;

                case 6:
                    System.out.println("================================================");
                    libreria.listUsersWithBooks();
                    System.out.println("================================================");
                    break;

                case 7:
                    System.out.println("=================================================");
                    libreria.rentedBooks();
                    System.out.println("=================================================");
                    break;

                case 8:
                    System.out.println("================================================");
                    libreria.notRentedBooks();
                    System.out.println("================================================");
                    break;

                case 9:
                    System.out.println("\nCerrando programa...");
                    break;

                default:
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
        }while(opcion!=9);
    }
}