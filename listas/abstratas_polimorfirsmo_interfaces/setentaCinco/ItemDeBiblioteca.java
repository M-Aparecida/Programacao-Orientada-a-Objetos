package listas.abstratas_polimorfirsmo_interfaces.setentaCinco;

public interface ItemDeBiblioteca {
    public static final int maximoDiasParaEmprestimo = 14;
    public boolean estaEmprestado();
    public void empresta();
    public void devolve();
    public String localizacao();
    public String descricao();
    
}
