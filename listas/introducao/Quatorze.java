package listas.introducao;

import java.util.Scanner;

public class Quatorze {
    public static void main(String[] args) {
        int n;
        Scanner ent = new Scanner(System.in);
        System.out.print("digite n: ");
        n = ent.nextInt();
        ent.close();
        for(int i = 0; i < n; i++){
            System.out.print(fib(i) + "  ");
        }
    }
    public static int fib(int n){
        if(n < 2){
            return n;
        }else{
            return fib(n-1) + fib(n-2); 
        }
    }
}
