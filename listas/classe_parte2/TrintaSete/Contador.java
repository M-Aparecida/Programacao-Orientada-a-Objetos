package listas.classe_parte2.TrintaSete;

public class Contador {
    private int cont;

    public Contador() {
        this.cont = 0;
    }

    public void imprimeContador() {
        System.out.print(cont);
    }

    public void zera(){
        cont = 0;
    }
    
    public void incrementa(){
        cont++;
    }
}
