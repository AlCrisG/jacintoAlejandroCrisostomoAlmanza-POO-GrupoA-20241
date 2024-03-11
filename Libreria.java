import java.util.ArrayList;

public class Libreria {
    ArrayList<Libro> books = new ArrayList<>();
    ArrayList<Usuario> users = new ArrayList<>();

    public void addUser(Usuario user){
        users.add(user);
    }

    public void addBook(Libro book){
        books.add(book);
    }

    public void rent(int userID, int bookID){
        boolean userFound = false;
        for (Usuario user : users){
            if (user.getId() == userID){
                userFound = true;
                boolean bookFound = false;
                for (Libro book : books){
                    if (book.getId() == bookID){
                        bookFound = true;
                        if (!book.isRented()) {
                            book.setRented(true);
                            user.rentBook(book);
                            System.out.println("Libro rentado con éxito.");
                        }
                        else{
                            System.out.println("Este libro ya está siendo rentado.");
                        }
                    }
                }
                if(!bookFound){
                    System.out.println("Libro no encontrado.");
                }
            }
        }
        if(!userFound){
            System.out.println("Usuario no encontrado.");
        }
    }

    public void listUsers(){
        System.out.println("============= USUARIOS REGISTRADOS =============");
        if (users.isEmpty()){
            System.out.println("================================================");
            System.out.println("No hay ningún usuario registrado");
            System.out.println("================================================");
        }
        else {
            for (Usuario user : users) {
                System.out.println("================================================");
                System.out.printf("ID del usuario: %s%n", user.getId());
                System.out.printf("Nombre de usuario: %s %s%n", user.getName(), user.getLastName());
                System.out.println("================================================");
            }
        }
    }

    public void listBooks(){
        System.out.println("============== LIBROS REGISTRADOS ==============");
        if (books.isEmpty()){
            System.out.println("================================================");
            System.out.println("No hay ningún libro registrado");
            System.out.println("================================================");
        }
        else {
            for (Libro book : books) {
                System.out.println("================================================");
                System.out.printf("ID del libro: %s%n", book.getId());
                System.out.printf("Titulo del libro: %s%n", book.getTitle());
                System.out.printf("Autor del libro: %s%n", book.getAuthor());
                System.out.println("================================================");
            }
        }
    }

    public void listUsersWithBooks(){
        System.out.println("=========== USUARIOS RENTANDO LIBROS ===========");
        boolean rentando = false;
        for(Usuario user : users){
            if (user.hasRentedBooks()) {
                rentando = true;
                System.out.println("================================================");
                System.out.printf("ID del usuario: %s%n", user.getId());
                System.out.printf("Nombre de usuario: %s %s%n", user.getName(), user.getLastName());
                System.out.println("Cantidad de libros rentados: " + user.booksQuantity());
                System.out.println("================================================");
            }
        }
        if (!rentando){
            System.out.println("================================================");
            System.out.println("Ningún usuario está rentando libros");
            System.out.println("================================================");
        }
    }

    public void rentedBooks(){
        System.out.println("================ LIBROS RENTADOS ================");
        boolean rentado = false;
        for(Libro book : books){
            if (book.isRented()) {
                rentado = true;
                System.out.println("=================================================");
                System.out.printf("ID del libro: %s%n", book.getId());
                System.out.printf("Titulo del libro: %s%n", book.getTitle());
                System.out.printf("Autor del libro: %s%n", book.getAuthor());
                System.out.println("=================================================");
            }
        }
        if (!rentado){
            System.out.println("=================================================");
            System.out.println("Ningún libro ha sido rentado");
            System.out.println("=================================================");
        }
    }

    public void notRentedBooks(){
        System.out.println("============== LIBROS NO RENTADOS ==============");
        boolean rentado = true;
        for(Libro book : books){
            if (!book.isRented()) {
                rentado = false;
                System.out.println("================================================");
                System.out.printf("ID del libro: %s%n", book.getId());
                System.out.printf("Titulo del libro: %s%n", book.getTitle());
                System.out.printf("Autor del libro: %s%n", book.getAuthor());
                System.out.println("================================================");
            }
        }
        if (rentado){
            System.out.println("================================================");
            System.out.println("Todos los libros han sido rentados");
            System.out.println("================================================");
        }
    }
}
