import java.util.ArrayList;
import java.util.Random;

public class Usuario {
    private String name, lastName;
    private int id;
    private ArrayList<Libro> rentedBooks = new ArrayList<>();
    Random ran = new Random();

    public Usuario(String name, String lastName){
        id = ran.nextInt(1,1000);
        this.name = name;
        this.lastName = lastName;
    }

    public boolean hasRentedBooks(){
        return !rentedBooks.isEmpty();
    }

    public int booksQuantity(){
        return rentedBooks.size();
    }

    public void rentBook(Libro book){
        rentedBooks.add(book);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }
}
