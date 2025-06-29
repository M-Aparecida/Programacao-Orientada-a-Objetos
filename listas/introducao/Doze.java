package listas.introducao;

import java.util.Scanner;

public class Doze {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String[] semana  = {"domingo" , "segunda", "terca", "quarta", "quinta", "sexta", "sabado"};
        int diaEscolhido, diaSemana;
        boolean validador;

        System.out.print("escolha um numero de 1-28: ");
        diaEscolhido = ent.nextInt();
        do {
            validador = ((diaEscolhido > 28) || (diaEscolhido < 1)) ? true : false;
            if (validador) {
                System.out.print("entrada invalida, escolha um numero de 1-28: ");
                diaEscolhido = ent.nextInt();
            }
        } while (validador);

        diaSemana = (diaEscolhido % 7) - 1;

        System.out.println("o dia " + (diaEscolhido) + " sera uma " + semana[diaSemana]);

        ent.close();
    }
}
