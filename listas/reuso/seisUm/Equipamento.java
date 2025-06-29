package listas.reuso.seisUm;

public class Equipamento {
    private String fabricante;
    private int voltagem;

    public Equipamento(){
        
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setVoltagem(int voltagem){
        this.voltagem =  voltagem;
    }

    public String getFabricante(){
        return fabricante;
    }

    public int getVoltagem(){
        return voltagem;
    }

    public String toString(){
        return "Voltagem: " + voltagem + " Fabricante: " + fabricante;
    }
}
