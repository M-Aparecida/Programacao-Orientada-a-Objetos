package listas.introducao;

public class VinteUm {
    public static void main(String[] args) {
        int n = 7;
        boolean primo = ehPrimo(n, Math.sqrt(n));
        System.out.println(primo);
    }

    public static boolean ehPrimo(int n, double i){
        if(n<=1) return false;
        if (n % i == 0) return false;
        if (i >= Math.sqrt(n)) return true; 
        return ehPrimo(n, i+1);
    }
}
