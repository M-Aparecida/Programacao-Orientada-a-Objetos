package Atividades;

import java.util.Scanner;

public class anguloEmGraus {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double seno, cosseno, tangente, cossecante, secante, cotangente, angulo, radianos;

        System.out.print("Informe o angulo:");
        angulo = leitor.nextDouble();
        radianos = Math.toRadians(angulo);
        seno = Math.sin(radianos);
        cosseno = Math.cos(radianos);
        tangente = Math.tan(radianos);
        cossecante = 1/seno;
        secante = 1/cosseno;
        cotangente = 1/tangente;
        
        System.out.printf("O angulo %.1f em radiano: %.2f\n", angulo, radianos);
        System.out.printf("Seno: %.2f\n", seno);
        System.out.printf("cosseno: %.2f\n", cosseno);
        System.out.printf("tangente: %.2f\n", tangente);
        System.out.printf("cossecante: %.2f\n", cossecante);
        System.out.printf("secante: %.2f\n", secante);
        System.out.printf("cotangente: %.2f\n", cotangente);

        leitor.close();
    }

}
