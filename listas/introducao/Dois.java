package listas.introducao;

import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        float n1, n2, n3;
        Scanner ent = new Scanner(System.in);
        System.out.print("insira N1: ");
        n1 = ent.nextFloat();
        System.out.print("insira N2: ");
        n2 = ent.nextFloat();
        System.out.print("insira N3: ");
        n3 = ent.nextFloat();
        float soma  = n1+n2+n3;
        float media = soma/3;

        System.out.println("soma: " + soma + "\nmedia: " + media);

        ent.close();
    }
}
