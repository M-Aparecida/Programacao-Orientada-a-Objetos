package listas.array_ArrayList.quarentaOito;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> agenda = new ArrayList<>();

    public Agenda(){

    }

    public void adicionarCompromisso(int dia, int mes, int ano, String hora, String assunto){
        EntradaEmAgenda novoCompromisso = new EntradaEmAgenda(dia, mes, ano, hora,  assunto);

        agenda.add(novoCompromisso);
    }

    public void listaDia(int dia, int mes, int ano){
        for (EntradaEmAgenda compromisso : agenda) {
            if (compromisso.ehNoDia(dia, mes, ano)) {
                System.out.println(compromisso + "\n");
            }
        }
    }

}
