package listas.introducao;

public class Dezesseis {
    public static void main(String[] args) {
        int c,d,u;
        double somaCubos;
        for(int i = 100; i < 1000; i++) {
            c = (i/100);
            d = ((i - (c * 100)) / 10);
            u = i - (((c*100) + (d*10)));
            somaCubos = Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3);
            if((somaCubos) == i){
                System.out.print(i + "  ");
            }
        }
    }

}
