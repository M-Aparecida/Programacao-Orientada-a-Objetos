package listas.introducao;

import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) {
        float celsius, fahrenheit;
        Scanner ent = new Scanner(System.in);

        System.out.print("grau celsius: ");
        celsius = ent.nextFloat();
        fahrenheit = celsius * 9 / 5 + 32;

        System.out.print("celsius "+ celsius + " fahreheint: " + fahrenheit);
        ent.close();
    }
}
