package listas.abstratas_polimorfirsmo_interfaces.setentaDois;

public class Funcionario {
    private String nome, cargo;
    private float salarioPorHora;
    private int horasTrabalhadas;

    public Funcionario(String nome){
        this.nome = nome;
        salarioPorHora = 2.0F;
        cargo = "nao definido";
        horasTrabalhadas = 0;
    }

    public Funcionario(String nome, String cargo, float salarioPorHora){
        this.nome = nome;
        this.cargo = cargo;
        this.salarioPorHora = salarioPorHora;
        horasTrabalhadas = 0;

    }

    public void setHorasTrabalhadas(int horas){
        this.horasTrabalhadas = horas;
    }

    public float salarioDia(){
        return horasTrabalhadas*salarioPorHora;
    }

    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salarioPorHora=" + salarioPorHora
                + ", horasTrabalhadas=" + horasTrabalhadas + "]";
    }
}
