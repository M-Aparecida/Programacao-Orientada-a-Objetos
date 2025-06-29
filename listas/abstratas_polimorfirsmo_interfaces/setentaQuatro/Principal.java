package listas.abstratas_polimorfirsmo_interfaces.setentaQuatro;

import listas.abstratas_polimorfirsmo_interfaces.setentaTres.Circulo;
import listas.abstratas_polimorfirsmo_interfaces.setentaTres.Quadrado;
import listas.abstratas_polimorfirsmo_interfaces.setentaTres.Triangulo;

public class Principal {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();
        
        Desenho d1 = new Desenho(c, q, 1, 4, 2, 4);
        d1.apresenta();
        Desenho d2 = new Desenho(q, t, 1, 1, 2, 1);
        d2.apresenta();
    }
}
