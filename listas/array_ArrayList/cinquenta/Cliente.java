package listas.array_ArrayList.cinquenta;

public class Cliente {
    private int id, idade, telefone;
    private String nome;

    public Cliente(int id, int idade, int telefone, String nome) {
        this.id = id;
        this.idade = idade;
        this.telefone = telefone;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", idade=" + idade + ", telefone=" + telefone + ", nome=" + nome + "]";
    }   

    
}
