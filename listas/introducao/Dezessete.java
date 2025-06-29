package listas.introducao;

public class Dezessete {
    public static void main(String[] args) {
        double a = 7000, b = 20000; 
        int anos = 0;
        while (b > a){
            a += (a * 0.035);
            b += (b * 0.01);
            anos++;
        }
        System.out.println(anos);
    }
}
