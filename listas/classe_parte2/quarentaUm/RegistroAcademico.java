package listas.classe_parte2.quarentaUm;

public class RegistroAcademico {
    private static int numeroMatriculas = 2025011100;
    private int matricula;
    String nome;
    int codigCurso;
    double percentualDeCobranca;

    

    public RegistroAcademico(String nome, int codigCurso, double percentualDeCobranca) {
        this.nome = nome;
        this.codigCurso = codigCurso;
        this.percentualDeCobranca = percentualDeCobranca;   
        this.matricula = numeroMatriculas;
        numeroMatriculas++;
    }
    public int getMatricula() {
        return matricula;
    }

    double calculaMensalidade(){
        return 100.0*codigCurso*(percentualDeCobranca);
    }


}
