import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int selec;

        //Selector de programa
        do {
            System.out.println("""
                    **********************************
                    | ¿Qué ejercicio desea ejecutar? |
                    | 1. Clase Persona               |
                    | 2. Clase Libro                 |
                    | 3. Clase Rectángulo            |
                    **********************************""");
            System.out.print("Su elección: ");
            selec = read.nextInt();
        }while(selec>3 || selec<1);

        switch(selec){
            case 1:                                                                     //Clase Persona
                Persona p1 = new Persona("Juan", 15, "masculino");            //Primera instancia
                Persona p2 = new Persona("Pedro", 24, "masculino");           //Segunda instancia
                Persona p3 = new Persona("Marcela", 74, "femenino");          //Tercera instancia
                Persona p4 = new Persona("Ximena", 4, "femenino");            //Cuarta instancia
                p1.imprimir();
                p2.imprimir();
                p3.imprimir();
                p4.imprimir();
                break;

            case 2:                                                                     //Clase Libro
                Libro l1 = new Libro();                                                 //Primera instancia
                l1.imprimir();

                Libro l2 = new Libro();                                                 //Segunda instancia
                l2.titulo = "El laberinto de la soledad";
                l2.autor = "Octavio Paz";
                l2.year = 1950;
                l2.imprimir();

                Libro l3 = new Libro();                                                 //Tercera instancia
                l3.titulo = "1984";
                l3.autor = "George Orwell";
                l3.year = 1949;
                l3.imprimir();

                Libro l4 = new Libro();                                                 //Cuarta instancia
                l4.titulo = "El periquillo sarniento";
                l4.autor = "José Joaquín Fernández de Lizardi";
                l4.year = 1814;
                l4.imprimir();
                break;

            case 3:                                                                     //Clase Rectángulo
                Rectangulo r1 = new Rectangulo(5,8);                             //Primera instancia
                Rectangulo r2 = new Rectangulo(4,3);                             //Segunda instancia
                Rectangulo r3 = new Rectangulo(15,5);                            //Tercera instancia
                Rectangulo r4 = new Rectangulo(12,7);                            //Cuarta instancia
                r1.imprimir();
                r2.imprimir();
                r3.imprimir();
                r4.imprimir();
                break;
        }
    }
}