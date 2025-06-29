package listas.array_ArrayList.cinquentaUm;

public class ProdutoInteiros {
    public ProdutoInteiros(){

    }

    public int produto(int... numeros){
        int resultado = 1;
        for (int i = 0; i < numeros.length; i++) {
            resultado *= numeros[i];
        }
        return resultado;
    }
}
