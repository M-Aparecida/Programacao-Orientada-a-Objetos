package listas.introducao;

import java.util.Scanner;

public class VinteDois {
    public static void main(String[] args) {
        int n;
        float x;
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite n (grau): ");
        n = ent.nextInt();

        System.out.print("Digite x: ");
        x = ent.nextFloat();

        float[] a = new float[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print("Digite a" + i + ": ");
            a[i] = ent.nextFloat();
        }

        double resul = p(n, a, x);
        System.out.println("Resultado: " + resul);
        ent.close();
    }

    public static double p(int n, float[] a, float x) {
        if (n == 0) return a[0];
        return x * p(n - 1, a, x) + a[n];
    }
}