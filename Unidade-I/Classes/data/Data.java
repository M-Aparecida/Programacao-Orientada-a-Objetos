package Classes.data;

public class Data {
    int dia;
    int mes;
    int ano;
        
    boolean dataEhValida(){
        return (dia >0 && dia<=30 && mes>0 && mes <=12 && ano>=0);
    }

    void inicializaData(int d, int m, int a){
        dia =d;
        mes = m;
        ano =a;
    }

    void mostraData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
