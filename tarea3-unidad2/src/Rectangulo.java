public class Rectangulo {
    int base;
    int altura;

    public Rectangulo(int b, int h){
        base = b;
        altura = h;
    }

    private int area(){
        return base*altura;
    }

    private int perimetro(){
        return 2*base+2*altura;
    }

    public void imprimir(){
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Área: "+area());
        System.out.println("Perímetro: "+perimetro());
        System.out.println();
    }
}