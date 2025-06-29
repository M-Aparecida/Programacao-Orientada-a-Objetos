package listas.reuso.seisQuatro;

public class Politico extends Pessoa{
    private String partido;

    public Politico(String nome, String cpf, String partido){
        super(nome, cpf);
        this.partido = partido;
    }

    public String toString(){
        return super.toString() + ", partido: " + partido;
    }
}
