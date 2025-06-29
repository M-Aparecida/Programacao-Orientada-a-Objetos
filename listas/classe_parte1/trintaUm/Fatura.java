package listas.classe_parte1.trintaUm;

public class Fatura {
    int id;
    String descricao;
    int qtdComprada;
    float preco;

    Fatura(int id, String descricao, int qtdComprada, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtdComprada = (qtdComprada < 0 ? 0 : qtdComprada);
        this.preco = (preco < 0 ? 0 : preco);
    }

    float total(){
        return (this.preco * this.qtdComprada);
    }

}
