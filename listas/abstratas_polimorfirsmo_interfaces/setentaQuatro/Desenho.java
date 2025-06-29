package listas.abstratas_polimorfirsmo_interfaces.setentaQuatro;

import listas.abstratas_polimorfirsmo_interfaces.setentaTres.FiguraGeometrica;

public class Desenho {
    private FiguraGeometrica f1;
    private FiguraGeometrica f2;
    private float x1, y1, x2, y2;
    public Desenho(FiguraGeometrica f1, FiguraGeometrica f2, float x1, float y1, float x2, float y2) {
        this.f1 = f1;
        this.f2 = f2;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    public void apresenta(){
        System.out.println("(" + x1 + "," + y1 + ")");
        f1.descricao();

        System.out.println("(" + x2 + "," + y2 + ")");
        f2.descricao();
    }
}
