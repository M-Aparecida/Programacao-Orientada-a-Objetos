package Atividades;

import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    float m, n1,n2,n3; 

    System.out.print("Digite a nota 1: ");
    n1 = leitor.nextFloat();
    System.out.print("Digite a nota 2: ");
    n2 = leitor.nextFloat();
    System.out.print("Digite a nota 3: ");
    n3 = leitor.nextFloat();

    m = (n1+n2+n3)/3;
   

    System.out.println("A média aritmética é " + m);

    leitor.close();
    }

}
