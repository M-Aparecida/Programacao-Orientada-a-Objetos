package listas.introducao;

import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("insira a area: ");
        float l  = ent.nextFloat();
        float area = l*l;

        System.out.println("lado: " + l + "\narea: " + area);
        ent.close();
    }
}
