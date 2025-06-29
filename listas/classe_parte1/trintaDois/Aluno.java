package listas.classe_parte1.trintaDois;

public class Aluno{
    int matricula;
    String nome;
    float p1, p2, trabalho;

    Aluno(int matricula, String nome, float p1, float p2, float trabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.trabalho = trabalho;
    }

    float mediaParcial(){
        return ((2.5F*(this.p1 + this.p2) + 2.0F*this.trabalho)/7);
    }

    float provaFinal(){
        float mp = this.mediaParcial();
        if( mp < 3.0F || mp >=7.0F) return 0.0F;
        return ((50.0F - 6.0F *mp)/4.0F);
    }
    
}
