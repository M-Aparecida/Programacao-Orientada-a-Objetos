package listas.classe_parte2.trintaNove;

public class Complexo {
    private double real;
    private double imaginario;

    public Complexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complexo(double real) {
        this.real = real;
        this.imaginario = 0.0;
    }


    public Complexo() {
        this.real = 0.0;
        this.imaginario = 0.0;
    }

    @Override
    public String toString() {
        return real + " + " + imaginario + " i";
    }
}
