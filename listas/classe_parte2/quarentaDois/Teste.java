package listas.classe_parte2.quarentaDois;

public class Teste {
    public static void main(String[] args) {
        Generica<Integer> inteiros = new Generica<>(2, 2, 2);
        Generica<Double> doubles = new Generica<>(2.5, 2.0, 2.0);
        System.out.println(inteiros);         
        System.out.println(inteiros.qtdIgual());
        System.out.println(doubles);         
        System.out.println(doubles.qtdIgual());
    }
}
