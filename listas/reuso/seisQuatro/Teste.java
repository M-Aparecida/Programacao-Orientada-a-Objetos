package listas.reuso.seisQuatro;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("gustavo", "123.456.789-00");
        Politico politico = new Politico("iasmilly", "123.456.789-69", "pt");
        Prefeito prefeito = new Prefeito("italo", "123.456.789-68", "pt", "Sm");
        Governador governador = new Governador("eduarda", "123.456.789-11", "pt", "oitero");

        System.out.println(pessoa);
        System.out.println("-------------------------------------");
        System.out.println(politico);
        System.out.println("-------------------------------------");
        System.out.println(prefeito);
        System.out.println("-------------------------------------");
        System.out.println(governador);
        System.out.println("-------------------------------------");
    }
}
