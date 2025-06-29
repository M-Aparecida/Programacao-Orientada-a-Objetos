package listas.introducao;

import java.util.Scanner;

public class Dezoito {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int base, expoente;
        System.out.print("Digite a base: ");
        base = ent.nextInt();
        System.out.print("Digite o expoente (diferente de zero): ");
        expoente = ent.nextInt();
        
        int result = potencia(base, expoente);
        System.out.println("o resultado eh: " + result);
        ent.close();
    }

    public static int potencia(int base, int expoente){
        if (expoente == 1) return base;
        return base  * potencia(base, expoente - 1);
    }
}
