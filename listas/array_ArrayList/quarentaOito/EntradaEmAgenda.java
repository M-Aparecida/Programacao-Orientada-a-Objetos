package listas.array_ArrayList.quarentaOito;

public class EntradaEmAgenda {
    private int dia, mes, ano;
    private String hora, assunto;

    public EntradaEmAgenda(int dia, int mes, int ano, String hora, String assunto){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.assunto = assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano){
        if (this.dia == dia && this.mes == mes && this.ano == ano) return true;
        return false;
    }


    public String toString(){
        return "Data: " + dia + "/" + mes + "/" + ano + "\nHorario: " + hora + "\nAssunto: " + assunto;
    }
}
