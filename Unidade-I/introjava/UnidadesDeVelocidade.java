package introjava;

public class UnidadesDeVelocidade {
    public static void main(String[] args) {
        double kph = 0.0, mps, mph, pps;
      
        System.out.println("K/h\tMp/s\tMp/h\tPp/s");
        while(kph <= 50){
            mps = kph * 0.2778;
            mph = kph * 0.6214;
            pps = kph * 0.9113;
            if(kph < 10) System.out.print("0");
            System.out.printf("%.2f\t", kph);
            if(mps < 10) System.out.print("0");
            System.out.printf("%.2f\t", mps);
            if(mph < 10) System.out.print("0");
            System.out.printf("%.2f\t", mph);
            if(pps < 10) System.out.print("0");
            System.out.printf("%.2f\n", pps);
            kph += 0.5;
        }
    }
}























