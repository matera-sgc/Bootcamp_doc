package modificador.acesso;

public class TesteFinal {

    final static Conta conta = new Conta(900.00);

    public static void main(String[] args) {
        System.out.println(conta.getSaldo());
        conta.setSaldo(800.00);
        System.out.println("Conta com saldo alterado");
        System.out.println(conta.getSaldo());
    }

}
