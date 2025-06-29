package listas.abstratas_polimorfirsmo_interfaces.setentaCinco;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca l = new LivroDeBiblioteca("Os filhos de hurin", "tolkien", 480, 2023, "corredor 2, prateleira D", "livro de fantasia");

        System.out.println(l);
        System.out.println(l.qualTitulo());
        System.out.println(l.qualAutor());

        System.out.println("==================================");

        l.empresta();
        System.out.println(l);
    }
}
