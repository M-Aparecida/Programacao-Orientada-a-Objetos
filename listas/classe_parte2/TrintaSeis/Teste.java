package listas.classe_parte2.TrintaSeis;

public class Teste {
    public static void main(String[] args) {
        Elevador e1 = new Elevador(5, 4);

        e1.entra();
        e1.entra();
        e1.entra();
        e1.entra();
        //n entra mais
        e1.entra();
        e1.sai();

        e1.sobe();
        e1.sobe();
        e1.sobe();
        e1.sobe();
        e1.sobe();
        //n sobe mais
        e1.sobe();
        e1.desce();
    }
}
