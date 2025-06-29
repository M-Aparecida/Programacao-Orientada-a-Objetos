package listas.classe_parte2.quarenta;

public class Quarenta {
    public static int maiorDois(int n1, int n2){
        if(n1 > n2) return n1;
        return n2;
    }

    public static double maiorDois(double n1, double n2){
        if(n1 > n2) return n1;
        return n2;
    }

    public static int maiorTres(int n1, int n2, int n3){
        if(n1>n2 && n1>n3) return n1;
        if(n2>n1 && n2>n3) return n2;
        return n3;
    }

    public static double maiorTres(double n1, double n2, double n3){
        if(n1>n2 && n1>n3) return n1;
        if(n2>n1 && n2>n3) return n2;
        return n3;
    }

    public static int maiorQuatro(int n1, int n2, int n3, int n4){
        if(n1>n2 && n1>n3 && n1>n4) return n1;
        if(n2>n1 && n2>n3 && n2>n4) return n2;
        if(n3>n1 && n3>n2 && n3>n4) return n3;
        return n4;
    }

    public static double maiorQuatro(double n1, double n2, double n3, double n4){
        if(n1>n2 && n1>n3 && n1>n4) return n1;
        if(n2>n1 && n2>n3 && n2>n4) return n2;
        if(n3>n1 && n3>n2 && n3>n4) return n3;
        return n4;
    }

    public static int maiorCinco(int n1, int n2, int n3, int n4, int n5){
        if(n1>n2 && n1>n3 && n1>n4 && n1>n5) return n1;
        if(n2>n1 && n2>n3 && n2>n4 && n2>n5) return n2;
        if(n3>n1 && n3>n2 && n3>n4 && n3>n5) return n3;
        if(n4>n1 && n4>n2 && n4>n3 && n4>n5) return n4;
        return n5;
    }

    public static double maiorCinco(double n1, double n2, double n3, double n4, double n5){
        if(n1>n2 && n1>n3 && n1>n4 && n1>n5) return n1;
        if(n2>n1 && n2>n3 && n2>n4 && n2>n5) return n2;
        if(n3>n1 && n3>n2 && n3>n4 && n3>n5) return n3;
        if(n4>n1 && n4>n2 && n4>n3 && n4>n5) return n4;
        return n5;
    }
}
