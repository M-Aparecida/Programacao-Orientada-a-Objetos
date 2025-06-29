package listas.classe_parte2.trintaOito;

public class Teste {
    public static void main(String[] args) {
        Lampada l = new Lampada();
        System.out.println(l.estaLigada());
        l.acende();
        l.acende();
        System.out.println(l.estaLigada());
        System.out.println(l.mostraEstado());
        l.getVezesLigada();
        l.apaga();
        System.out.println(l.estaLigada());
        System.out.println(l.mostraEstado());
        l.getVezesLigada();
    }
}
