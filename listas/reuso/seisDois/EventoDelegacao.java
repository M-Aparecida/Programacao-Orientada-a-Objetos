package listas.reuso.seisDois;

public class EventoDelegacao {
    private DataHora dataHora; 
    private String descricao;

    public EventoDelegacao(int dia, int mes, int ano, int hora, int min, int seg, String descricao){
        dataHora = new DataHora(dia, mes, ano, hora, min, seg);
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return dataHora.toString() + "\n" + descricao;
    }
}
