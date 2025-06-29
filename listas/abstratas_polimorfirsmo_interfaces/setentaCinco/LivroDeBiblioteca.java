package listas.abstratas_polimorfirsmo_interfaces.setentaCinco;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean taEmprestado;
    private String localDoItem, descricao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, String localDoItem, String descricao){
        super(titulo,autor, numeroDePaginas, anoDaEdicao);
        taEmprestado = false;
        this.localDoItem = localDoItem;
        this.descricao = descricao;
    }

    public boolean estaEmprestado(){
        return taEmprestado;
    }
    public void empresta(){
        if(!taEmprestado) taEmprestado = true;
    }
    public void devolve(){
        if(taEmprestado) taEmprestado = false;
    }

    public String localizacao(){
        return localDoItem;
    }

    public String descricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return super.toString() + "taEmprestado= " + taEmprestado + ", localDoItem= " + localDoItem + ", descricao= "
                + descricao;
    }

    
}
