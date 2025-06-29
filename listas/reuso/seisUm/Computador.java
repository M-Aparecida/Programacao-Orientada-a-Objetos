package listas.reuso.seisUm;

public class Computador extends Equipamento {
    private String modelo;
    private String processador;

    public Computador(){

    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setProcessador(String processador){
        this.processador = processador;
    }

    public String getModelo(){
        return modelo;
    }

    public String getProcessador(){
        return processador;
    }

    @Override
    public String toString(){
        return "Fabricante: " + getFabricante() + " Voltagem: " + getVoltagem() + " Modelo: " + modelo + " Processador: " + processador;
        //return super.toString + " Modelo: " + modelo + " Processador: " + processador;
     }
}
