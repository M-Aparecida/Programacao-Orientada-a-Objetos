package introjava;

import java.util.Calendar;
import java.util.Scanner;

public class ValidaCartao {
    public static void main(String[] args) {
        String nome, numero, codigo;
        int mes, ano;
        Scanner leitor = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        int mesAtual, anoAtual;
        boolean invalido;
        

        mesAtual = calendario.get(Calendar.MONTH) + 1;
        anoAtual = calendario.get(Calendar.YEAR);

        System.out.print("Nome: ");
        nome = leitor.nextLine();
        System.out.print("Numero: ");
        numero = leitor.nextLine();
        System.out.print("codigo: ");
        codigo = leitor.nextLine();

        System.out.println("Nome informado: " + nome);
        System.out.println("Número informado: " + numero);
        System.out.println("Código informado: " + codigo);

        do {
        System.out.print("mes: ");
        mes = leitor.nextInt();
        System.out.print("ano: ");
        ano = leitor.nextInt();
        invalido = ano < anoAtual || (ano==anoAtual && mes<mesAtual);
        if(invalido) System.err.println("Cartao invalido. insira dados novamente.");


        } while (invalido);

        System.out.println("Cartao validado");

       leitor.close();
    }
}
