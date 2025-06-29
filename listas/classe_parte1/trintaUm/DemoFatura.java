package listas.classe_parte1.trintaUm;

import java.text.DecimalFormat;

public class DemoFatura {
    public static void main(String[] args) {
        int id = 546;
        String descricao = "cropedi (vermelho) aghathar nunes 3X5";
        int qtdComprada = 1;
        float preco = 15;
        DecimalFormat frmt = new DecimalFormat("00.00");
        Fatura f = new Fatura(id, descricao, qtdComprada, preco);


        System.out.println(id + " - descricao: " + f.descricao);
        System.out.println("Quantidade comprada: " + f.qtdComprada);
        System.out.println("Preco: unitario " + f.preco);
        System.out.println("Valor total: R$" + frmt.format(f.total()));
    }

}
