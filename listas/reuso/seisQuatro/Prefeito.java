package listas.reuso.seisQuatro;

public class Prefeito extends Politico{
    private String cidadeQueGoverna;

    public Prefeito(String nome, String cpf, String partido, String cidadeQueGoverna) {
        super(nome, cpf, partido);
        this.cidadeQueGoverna = cidadeQueGoverna;
    }

    public String toString(){
        return super.toString() + ", cidade que governa: " + cidadeQueGoverna;
    }
}
