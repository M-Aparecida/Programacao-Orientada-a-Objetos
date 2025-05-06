package Classes.faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();

        michael.inicializaRegistroAcademico("michael", "091278364", 2, 60);
        double valor = michael.calculeMensalidade();
        System.out.println("Mensalidade de micahel " + valor);

        RegistroAcademico roberto = new RegistroAcademico();
        double valor2 = roberto.calculeMensalidade();
        System.out.println("Mensalidade de roberto " + valor2);
    }
}
