package listas.classe_parte2.TrintaSete;

public class Teste {
    public static void main(String[] args) {
        Contador c = new Contador();
        c.imprimeContador();

        c.incrementa();
        c.incrementa();
        c.incrementa();
        c.incrementa();

        c.imprimeContador();

        c.zera();
        c.imprimeContador();
    }
}
