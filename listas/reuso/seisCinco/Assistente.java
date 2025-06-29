package listas.reuso.seisCinco;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(String nome, float salario, int matricula){
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
    return this.matricula;
}

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }   
    @Override
    public String toString() {
        return super.toString() + ", matricula: " + matricula;
    }
    
}
