package listas.array_ArrayList.quarentaNove;

public class DemoMatriz {
    public static void main(String[] args) {
        Matriz m = new Matriz(1.99F, 4.88F, 6.00F, 45.88F);

        System.out.println(m.determinante());

        m.visualizarMatriz();
    }
}
