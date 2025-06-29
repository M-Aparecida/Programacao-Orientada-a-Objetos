package UnidadeII.colecoes.mapa;

import java.util.TreeMap;

public class ContaPalavras {
    public static void main(String[] args) {
        String texto = "Lorem ipsum is a placeholder text commonly used in publishing and graphic design. It is used to demonstrate the visual form of a document or a typeface without relying on meaningful content. It is essentially nonsense text that still gives an idea of what real words will look like in the final product. It is the standard placeholder text of the printing and publishing industries.";
        TreeMap<String,Integer> mapa = new TreeMap<>();
        String palavras[] = texto.split(" ");

    for (String palavra : palavras){
        String palavraMin = palavra.toLowerCase();
        if (mapa.containsKey(palavraMin)){
            int qtd = mapa.get(palavraMin);
            mapa.put(palavraMin, qtd+1);
        } else{
            mapa.put(palavraMin, 1);
        }
    }
        for (String palavra : mapa.keySet()){
        System.out.println(palavra + " " + mapa.get(palavra));
        }
    }
}
