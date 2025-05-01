package introjava;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dia, mes, ano, diasdomes;

        System.out.print("Dia: ");
        dia = leitor.nextInt();
        System.out.print("Mes: ");
        mes = leitor.nextInt();
        System.out.print("Ano: ");
        ano = leitor.nextInt();

        System.out.print(dia + " de ");
        if (mes == 1) {
            System.out.print("Janeiro");
        } else if (mes == 2) {
            System.out.print("Fevereiro");
        } else if (mes == 3) {
            System.out.print("Março");
        } else if (mes == 4) {
            System.out.print("Abril");
        } else if (mes == 5) {
            System.out.print("Maio");
        } else if (mes == 6) {
            System.out.print("Junho");
        } else if (mes == 7) {
            System.out.print("Julho");
        } else if (mes == 8) {
            System.out.print("Agosto");
        } else if (mes == 9) {
            System.out.print("Setembro");
        } else if (mes == 10) {
            System.out.print("Outubro");
        } else if (mes == 11) {
            System.out.print("Novembro");
        } else if (mes == 12) {
            System.out.print("Dezembro");
        } else {
            System.out.println(" (mês inválido)");
        }

        System.out.println(" de " + ano);

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasdomes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasdomes = 30;
                break;
            case 2:
                diasdomes = 28;
                break;
            default:
                diasdomes = 0;
        }

        System.out.println("Esse mês tem " + diasdomes + " dias.");
        leitor.close();
    }
}
