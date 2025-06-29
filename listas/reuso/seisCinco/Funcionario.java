package listas.reuso.seisCinco;

public class Funcionario {
    private String nome;
    protected float salario;

    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(float aumento){
        salario += aumento;
    }

    public float ganhoAnual(){
        float decimoTerceiro = (salario/12) * 12;
        return (salario * 12) + decimoTerceiro;
    }

    public String toString() {
        return "nome: " + nome + ", salario: " + salario;
    }
}
