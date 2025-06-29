package listas.reuso.seisCinco;

public class Administrativo extends Assistente{
    private String turno;
    private float adicionalNoturno;

    public Administrativo(String nome, float salario, int matricula, String turno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = 00F;
    }

    public Administrativo(String nome, float salario, int matricula, String turno, float adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public float ganhoAnual(){
        float decimoTerceiro;
        if(turno.equals("diurno")){
            decimoTerceiro = (super.salario/12) * 12;
            return (super.salario * 12) + decimoTerceiro;
        }else{
            decimoTerceiro = (super.salario/12) * 12;
            return ((super.salario + adicionalNoturno) * 12) + decimoTerceiro;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", turno: " + turno + ", adicional noturno: " + adicionalNoturno;
    }
    
}
