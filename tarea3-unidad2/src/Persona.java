public class Persona {
    String nombre;
    int edad;
    String genero;

    public Persona (String n, int e, String g){
        nombre = n;
        edad = e;
        genero = g;
    }

    public void imprimir(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nGénero: "+genero+"\n");
    }
}