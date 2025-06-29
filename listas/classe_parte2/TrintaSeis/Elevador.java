package listas.classe_parte2.TrintaSeis;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int qtdPresente;

    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.andarAtual = 0;
        this.qtdPresente = 0;
    }

    public void entra(){
        if(!(qtdPresente == capacidade)){
            qtdPresente++;
        }
    }

    public void sai(){
        if(!(qtdPresente == 0)){
            qtdPresente--;
        }
    }

    public void sobe(){
        if (!(andarAtual == totalAndares)) {
            andarAtual++;
        }
    }

    public void desce(){
        if (!(andarAtual == 0)) {
            andarAtual--;
        }
    }
    

}
