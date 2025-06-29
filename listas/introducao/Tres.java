package listas.introducao;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        double graus, radianos;
        double sin, cos, tg, cossec,sec, cotg;
        Scanner ent = new Scanner(System.in);
        System.out.print("insira o grau: ");
        graus = ent.nextDouble();
        radianos = Math.toRadians(graus);
        sin = Math.sin(radianos);
        cos = Math.cos(radianos);
        tg =  Math.tan(radianos);
        cossec = Math.cosh(radianos);
        sec = Math.sinh(radianos);
        cotg = Math.tanh(radianos);
        
        System.out.println("Grau: " + graus);
        System.out.println("radianos: " + radianos);
        System.out.println("sin: " + sin);
        System.out.println("cos: " + cos);
        System.out.println("tg: " + tg);
        System.out.println("cossec: " + cossec);
        System.out.println("sec: " + sec);
        System.out.println("cotg: " + cotg);

        ent.close();    
    }
}
