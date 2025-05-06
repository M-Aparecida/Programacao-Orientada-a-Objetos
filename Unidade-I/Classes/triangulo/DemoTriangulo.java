package Classes.triangulo;

public class DemoTriangulo {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        t1.inicializaTriangulo(2.3, 3.3, 4.5, "escaleno");
        Triangulo t2 = new Triangulo();
        t1.inicializaTriangulo(2.3, 3.3, 4.5, "escaleno");
        Triangulo t3;
        t3 = t1;
        System.out.println( t1 == t2);
        System.out.println( t1 == t3);
    }
    
}
