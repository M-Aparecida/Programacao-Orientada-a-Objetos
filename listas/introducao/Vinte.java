package listas.introducao;

public class Vinte {
    public static void main(String[] args) {
        int m=40 , n = 4, r;
        r =mdc(m, n);
        System.out.println(r);
    }

    public static int mdc(int m, int n){
        if (n>m) {
            return mdc(n, m);
        }else if(n==0){
            return m;
        }else{
            return mdc(n, m%n);
        }
    }
}
