import java.util.Random;

public class Libro {
    Random ran = new Random();
    private String title, author;
    private int id;
    private boolean rented = false;

    public Libro(String title, String author){
        this.id = ran.nextInt(1,1000);
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
