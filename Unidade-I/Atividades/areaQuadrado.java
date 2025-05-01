package Atividades;

import java.util.Scanner;

public class areaQuadrado {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    float area, lado; 

    System.out.print("Digite o lado do quadrado: ");
    lado = leitor.nextFloat();

    area = lado*lado;
   

    System.out.println("A área do quadrado é " + area);

    leitor.close();
    }
    
}
