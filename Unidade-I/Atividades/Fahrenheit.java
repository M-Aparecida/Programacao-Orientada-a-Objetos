package Atividades;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float centigrados, fahrenheit;

        System.out.print("Digite a temperatura em Celsius:");
        centigrados = leitor.nextFloat();

        fahrenheit = centigrados * 9/5 + 32; 

        System.out.printf("A temperatura de %" + centigrados + "em Fahrenheit é " + fahrenheit);


        leitor.close();
    }
}
