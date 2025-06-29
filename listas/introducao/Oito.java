package listas.introducao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Oito {
    public static void main(String[] args) {
        String codigo = new String();
        boolean validador = true;
        float valor, valorF;
        DecimalFormat frmt = new DecimalFormat("00.00");
        Scanner ent = new Scanner(System.in);
        System.out.println("Escolha um setor, os disponiveis sao:\n111-Caman mesa e banho\n222-Eletro");
        System.out.print("Digite o codigo: ");
        codigo = ent.nextLine();

        do {
            validador = codigo.equals("111") || codigo.equals("222");
            if (!validador){
                System.out.println("Setor invalido, os diponiveis sao: \n111-Cama, mesa e banho\n222-Eletro");
                System.out.print("tente novamente: ");
                codigo = ent.nextLine();
            }
        } while (!validador);

        System.out.print("Digite o valor: ");
        valor = ent.nextFloat();

        if(codigo.equals("111")){
            valorF = cmb(valor);
        }else{
            valorF = eletro(valor);
        }

        System.out.println("O produto do setor " + codigo + " fica de R$" + frmt.format(valor) + " por R$" + frmt.format(valorF));
        ent.close();
    }
    
    public static float cmb(float valor){
        if(valor > 100){
            return valor - (valor * 40)/100;
        }else if(valor >=50  && valor <=100){
            return valor - (valor * 20)/100;
        }else{
            return valor - (valor * 10)/100;
        }
    }
    public static float eletro(float valor){
        if(valor > 500){
            return valor - (valor * 10)/100;
        }else{
            return valor;
        }
    }
}
