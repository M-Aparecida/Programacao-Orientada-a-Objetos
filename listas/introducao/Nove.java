package listas.introducao;

import java.util.Scanner;

public class Nove {
    public static void main(String[] args) {
        String[] valorCarta = {"as", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "valente", "dama", "rei"};
        String[] naipes = {"ouros" , "paus", "copas", "espada"};
        Scanner ent = new Scanner(System.in);
        int numCarta, numNaipe;
        Boolean validador;
        
        System.out.print("Escolha o numero da carta de 1 (as) a 13 (rei):");
        numCarta = ent.nextInt();
        do {
            validador = (numCarta > 13 || numCarta < 1) ? true : false;
            if (validador) {
                System.out.print("Valor invalido, escolha entre uma carta de 1 a 13: ");
                numCarta = ent.nextInt();
            }
        } while (validador);
        --numCarta;

        System.out.println("---- NAIPES ----");
        for(int i = 0; i < 4; i++){
            System.out.println((i+1) + " - " + naipes[i]);
        }
        System.err.print("Escolha um naipe: ");
        numNaipe = ent.nextInt();
        do {
            validador = (numNaipe > 4 || numNaipe < 1) ? true : false;
            if (validador) {
                System.out.print("Valor invalido, escolha um naipe de 1 a 4: ");
                numNaipe = ent.nextInt();
            }
        } while (validador);
        --numNaipe;

        System.out.println("A carta escolhida foi " + valorCarta[numCarta] + " de " + naipes[numNaipe]);
        ent.close();
    }
}
