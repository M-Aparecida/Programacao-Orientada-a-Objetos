package listas.reuso.seisQuatro;

public class Pessoa {
    private String nome, cpf;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString(){
        return "nome: " + nome + ", cpf: " + cpf;
    }
}
