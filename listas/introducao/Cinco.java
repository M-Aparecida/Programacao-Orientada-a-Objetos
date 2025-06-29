package listas.introducao;

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        boolean validador = true;
        int num;
        System.out.print("Digite um numero com tres digitos (CDU): ");
        num = ent.nextInt();
        do{
            if (num >= 1000 || num < 100) {
                System.out.println("numero invalido, o numero deve conter tres digitos (CDU)");
                System.out.print("tente novamente: ");
                num = ent.nextInt();
            }else{
                validador = false;
            }
        }while (validador);
        int[] digitos = separaNumeros(num);
        int[] digitosInv = inverte(digitos);

        int numInv = digitosInv[0]*100 + digitosInv[1]*10 + digitosInv[2];

        System.out.println("O numero " + num + " invertido eh " + numInv);
        ent.close();
    }

    public static int[] separaNumeros(int num){
        int c, d, u;
        c = num/100;
        d = (num - (c*100))/10;
        u = num - (c*100) - (d*10);
        //[0] = Centena; [1] = Dezena; [2] = Milhar 
        int[] digitos = {c,d,u};
        return digitos;
    }

    public static int[] inverte(int[] digitos){
        int[] digitosInv = new int[3];
        for(int i =0; i<3;i++){
            digitosInv[i] = digitos[2-i];
        }
        return digitosInv;
    }
}