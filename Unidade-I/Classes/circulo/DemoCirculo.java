package Classes.circulo;

public class DemoCirculo {
    public static void main(String[] args) {
        System.out.println(Circulo.pi);
        System.out.println(Math.PI);

        Circulo c1 = new Circulo(1.0);
        System.out.println("Perimentro de c1: " + c1.perimetro());
        Circulo c2 = new Circulo(2.0);
        System.out.println("Perimentro de c2: " + c2.perimetro());
    }
}