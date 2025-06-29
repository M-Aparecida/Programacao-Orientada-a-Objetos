package listas.reuso.seisUm;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento eq = new Equipamento();
        eq.setFabricante("Lenovo");
        eq.setVoltagem(220);

        Computador pc = new Computador();
        pc.setFabricante("Acer");
        pc.setVoltagem(220);
        pc.setModelo("A515");
        pc.setProcessador("ryzen 7");

        System.out.println(eq);
        System.out.println(pc);
    }
}
