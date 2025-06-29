package listas.reuso.seisDois;

public class EventoHeranca extends DataHora{
    private String descricao;

    public EventoHeranca(int dia, int mes, int ano, int hora, int min, int seg, String descricao){
        super(dia, mes, ano, hora, min, seg);
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + descricao;
    }
}
