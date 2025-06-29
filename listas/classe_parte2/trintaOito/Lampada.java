package listas.classe_parte2.trintaOito;
import listas.classe_parte2.TrintaSete.Contador;

public class Lampada {
    private boolean estadoDaLampada;
    private Contador vezesLigada = new Contador();

    public Lampada() {
        this.estadoDaLampada = false;
    }

    public void acende(){
        if(!estadoDaLampada){
            estadoDaLampada = true;
            vezesLigada.incrementa();
        }
    }
    public void apaga(){
        if(estadoDaLampada){
            estadoDaLampada = false;
        }
    }

    public String mostraEstado(){
        return (estadoDaLampada ? "Esta acesa" : "Esta apagada");
    }

    public boolean estaLigada(){
        return estadoDaLampada;
    }

    public void getVezesLigada(){
        vezesLigada.imprimeContador();
    }
}
