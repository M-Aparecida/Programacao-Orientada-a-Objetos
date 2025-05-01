package introjava;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double num1, num2, num3, m;

        System.out.print("N1: ");
        num1= leitor.nextDouble();
        System.out.print("N2: ");
        num2= leitor.nextDouble();
        System.out.print("N3: ");
        num3= leitor.nextDouble();

        m = media(num1, num2, num3);

        System.out.println("Medida de " + num1 + ", " + num2 + " e " + num3 + " eh " + m);

        leitor.close();
    }

    public static double media(double n1, double n2, double n3){
        return(n1+n2+n3)/3;
    }
}
