package listas.array_ArrayList.cinquenta;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        int id, idade, telefone;
        String nome;
        ArrayList<Cliente> clientes =  new ArrayList<>();

        Scanner ent = new Scanner(System.in);
        do {
            System.out.print("Digite o ID: ");
            id = ent.nextInt();
            ent.nextLine();
            if (id<0) {
                continue;
            }
            System.out.print("Digite o nome: ");
            nome = ent.nextLine();
            System.out.print("Digite a idade: ");
            idade = ent.nextInt();
            System.out.print("Digite o telefone: ");
            telefone = ent.nextInt();
            
            Cliente cliente = new Cliente(id, idade, telefone, nome);
            clientes.add(cliente);
        } while (id >= 0);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        ent.close();
    }
}
