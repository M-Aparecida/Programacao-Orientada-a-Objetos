package listas.introducao;

import java.text.DecimalFormat;

public class Treze {
    public static void main(String[] args) {
        DecimalFormat frmt = new DecimalFormat("00");
        for(int i = 1; i <= 60; i++){
            System.out.print(frmt.format(i) + "\t");
            if((i % 10 == 0) && (i != 0) && (i != 60)){
                System.out.println("\n");
            }
        }
    }
}
