package listas.reuso.seisDois;

public class Teste {
    public static void main(String[] args) {
        EventoDelegacao ev1 =  new EventoDelegacao(4, 7, 2025, 22, 0, 0, "Tio kalika - N1 bb!");
        System.out.println(ev1);

        EventoHeranca ev2 =  new EventoHeranca(5, 7, 2025, 22, 0, 0, "Tio kalika - N2 bb!");
        System.out.println(ev2);
    }
}
