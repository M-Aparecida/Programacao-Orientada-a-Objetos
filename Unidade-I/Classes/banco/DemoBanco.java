package Classes.banco;

public class DemoBanco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Pedro", 3487.89F, true);
        ContaBancaria conta2 = new ContaBancaria("Maria");
        System.out.println(conta);
        System.out.println(conta2);


    }
}
