package listas.reuso.seisQuatro;

public class Governador extends Politico {
    private String estadoQueGoverna;

    public Governador(String nome, String cpf, String partido, String estadoQueGoverna){
        super(nome, cpf, partido);
        this.estadoQueGoverna = estadoQueGoverna;
    }

    public String toString(){
        return super.toString()  + ", estado que governa: " + estadoQueGoverna;
    }

}
