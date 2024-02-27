public class Producto {
    private String nombre;
    private float precio;
    private int stock;

    public Producto(String nombre, float precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre==null){
            System.out.println("ERROR, el nombre no puede ser nulo, vuelva a intentarlo.");
            System.out.println("Nombre actual: " + this.nombre);
        }
        else {
            this.nombre = nombre;
        }
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void aumentarStock(int cantidad){
        if (cantidad<1){
            System.out.println("La cantidad ingresada debe ser mayor a 0.");
            System.out.println("Stock actual: " + stock);
        }
        else{
            stock += cantidad;
            System.out.println("Stock actualizado: " + stock);
        }
    }

    public void reducirStock(int cantidad){
        if (cantidad<1 || cantidad>stock){
            System.out.println("La cantidad ingresada debería ser mayor a 0 y menor o igual al stock.");
            System.out.println("Stock actual: " + stock);
        }
        else{
            stock -= cantidad;
            System.out.println("Stock actualizado: " + stock);
        }
    }
}