package listas.introducao;

import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        int minEnt;
        int dias, horas, minutos;
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite a quantidade de minutos: ");
        minEnt = ent.nextInt();


        dias = minEnt / (60*24);
        horas = (minEnt % (60*24)) / 60;
        minutos = minEnt % 60;

        System.out.println(minEnt + " minutos  = " + dias + " dias, " + horas + " horas e " + minutos + " minutos");
        ent.close();
    }
}
