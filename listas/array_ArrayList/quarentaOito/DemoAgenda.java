package listas.array_ArrayList.quarentaOito;

public class DemoAgenda {
    public static void main(String[] args) {
        Agenda a = new Agenda();

        a.adicionarCompromisso(11, 5, 2025, "00:00", "meu aniversário!");

        a.adicionarCompromisso(15, 3, 2025, "06:36", "scat day!");

        a.listaDia(11, 5, 2025);
        a.listaDia(15, 3, 2025);
    }
}
