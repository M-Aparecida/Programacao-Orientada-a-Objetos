package listas.introducao;

import java.text.DecimalFormat;

public class Quinze {
    public static void main(String[] args) {
        // 2^(n-1)*((2^n)-1)
        double p, numPerfeito, i = 1;
        int cont = 0;
        boolean validador = true;
        DecimalFormat frmt = new DecimalFormat("0");
        do {
            p = (Math.pow(2, i))-1;
            if (ehPrimo(p)) {
                numPerfeito = p * Math.pow(2, (i-1));
                System.out.print(" " + frmt.format(numPerfeito));
                cont++;
                if (cont == 4) {
                    validador = false;
                }
            }
            i++;

        } while (validador);
    }

    public static boolean ehPrimo(double n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
