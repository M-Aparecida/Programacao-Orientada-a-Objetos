package listas.abstratas_polimorfirsmo_interfaces.setentaTres;

public class Principal {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();

        c.descricao();
        q.descricao();
        t.descricao();
    }
}
