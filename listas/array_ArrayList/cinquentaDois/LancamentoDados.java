package listas.array_ArrayList.cinquentaDois;

import java.util.Random;  //lembrar de colocar

public class LancamentoDados {
    public static void main(String[] args) {
        Random lancamento = new Random();
        int dado1 = 0; 
        int dado2 = 0;
        int soma = 0;
        int frequencia[] = new int[11];

        for (int i = 0; i < 36000000; i++) {
            dado1 = lancamento.nextInt(6) + 1; // o lancamento vai de 0-5, precisa +1 para ir de 1-6
            dado2 = lancamento.nextInt(6) + 1;
            soma = dado1 + dado2;
            frequencia[soma-2]++;
        }

        System.out.println("Resultado:");
        for (int i = 0; i < frequencia.length; i++) {
            System.out.println((i+2) + ": " + frequencia[i]);            
        }
    }
}
