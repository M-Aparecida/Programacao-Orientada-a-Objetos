package listas.colecoes;

import java.util.TreeMap;

public class noveQuatro {
    public static void main(String[] args) {
        String texto = "HELLO THERE";
        TreeMap<String,Integer> mapa = new TreeMap<>();
        String letras[] = texto.split("");

    for (String letra : letras){
        String letraMax = letra.toUpperCase();
        if (mapa.containsKey(letraMax)){
            int qtd = mapa.get(letraMax);
            mapa.put(letraMax, qtd+1);
        } else{
            mapa.put(letraMax, 1);
        }
    }
        for (String letra : mapa.keySet()){
        System.out.println(letra + " " + mapa.get(letra));
        }
    }
}
