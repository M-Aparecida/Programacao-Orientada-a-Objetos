package listas.reuso.seisCinco;

public class Tecnico extends Assistente{
    private float bonusSalarial;

    public Tecnico(String nome, float salario, int matricula, float bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public float ganhoAnual(){
        float decimoTerceiro = ((super.salario + bonusSalarial)/12) * 12;
        return ((super.salario + bonusSalarial) * 12) + decimoTerceiro;
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus salarial: " + bonusSalarial;
    }
}
