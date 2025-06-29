package listas.classe_parte1.trinta;

public class Time {
    String lider, tecnico, nomeTime;

    Time(String lider, String tecnico, String nomeTime){
        this.lider = lider;
        this.tecnico = tecnico;
        this.nomeTime = nomeTime;
    }
    void mostrarDados(){
        System.out.println("nome do Time: " + nomeTime);
        System.out.println("lider: " + lider);
        System.out.println("tecnico: " + tecnico);
    }
    
}
