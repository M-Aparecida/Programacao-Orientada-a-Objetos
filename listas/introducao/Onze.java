package listas.introducao;

import java.util.Scanner;

public class Onze {
    public static void main(String[] args) {
        float x1, y1,x2,y2;
        Scanner ent = new Scanner(System.in);

        System.out.print("insira x1: ");
        x1 = ent.nextFloat();
        System.out.print("insira y1: ");
        y1 = ent.nextFloat();
        System.out.println("ponto 1: (" +x1 + " , "+ y1 + ")");

        System.out.print("insira x2: ");
        x2 = ent.nextFloat();
        System.out.print("insira y2: ");
        y2 = ent.nextFloat();
        System.out.println("ponto 2: (" +x2 + " , "+ y2 + ")");

        if((x1 == x2) && (y1 == y2)){
            System.out.println("Os pontos estão na mesma posição.");
            ent.close();
            return;
        }

        float x3 = x2 - x1;
        float y3 = y2 - y1;

        System.out.println("o ponto 2 esta: ");
        if(y3 != 0){
            if (y3 > 0) {
                System.out.print("1 - acima");
            }else if(y3 < 0){
                System.out.print("1 - abaixo");
            }
            System.out.println(" do ponto 1;");
        }
        
        if (x3 != 0) {
            if (x3 > 0) {
                System.out.print("2 - a direita");
            }else if(x3 < 0){
                System.out.print("2 - a esquerda");
            }
            System.out.println(" do ponto 1;");
        }
        ent.close();
    }
}
