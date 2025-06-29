package listas.classe_parte2.quarentaDois;

public class Generica <T>{
    private T a1;
    private T a2;
    private T a3;
    private int qtd;
    public Generica(T a1, T a2, T a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public int qtdIgual(){
        if(a1.equals(a2) && a1.equals(a3)){
            qtd = 3;
            return qtd;
        }
        if(a1.equals(a3) ||a1.equals(a2) || a2.equals(a3)){
             qtd=2;
        }
        return qtd;
    }

    public String toString() {
        return "a1=" + a1 + ", a2=" + a2 + ", a3=" + a3;
    }

    
}
