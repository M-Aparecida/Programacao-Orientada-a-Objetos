package listas.introducao;

import java.util.Scanner;

public class Dezenove {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite n: ");
        int n = ent.nextInt();
        calculaFatorial(n);
        ent.close();
    }

    public static int calculaFatorial(int n) {
        int resultado;
        if (n == 0) {
            resultado = 1;
        } else {
            resultado = n * calculaFatorial(n - 1);
        }
        String tab = "    ".repeat(n);
        System.out.println(tab + n + "! = " + resultado);

        return resultado;
    }
}
