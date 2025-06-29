package listas.classe_parte1.trintaDois;

import java.text.DecimalFormat;

public class DemoAluno {
    public static void main(String[] args) {
        DecimalFormat frmt = new DecimalFormat("00.00");
        Aluno a = new Aluno(455, "Gustavo", 1.8F, 1.5F, 1);
        System.out.println("a media parcial eh: " +frmt.format(a.mediaParcial()));
        System.out.println("a nota para prova final eh: " + frmt.format(a.provaFinal()));
    }
}
