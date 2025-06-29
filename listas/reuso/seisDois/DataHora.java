package listas.reuso.seisDois;

import java.text.DecimalFormat;

public class DataHora {
    private int dia, mes, ano;
    private int hora, min, seg;
    DecimalFormat frmt = new DecimalFormat("00");
    public DataHora(int dia, int mes, int ano, int hora, int min, int seg) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public String toString(){
        return frmt.format(dia) + "/" + frmt.format(mes) + "/" + ano + "  " + frmt.format(hora) + ":" + frmt.format(min) + ":" + frmt.format(seg);
    }
}
