package bootcamp.doc.tres.modificador_acesso;

/**
 * Demonstra que 'final' em referência de objeto:
 * - A REFERÊNCIA não pode mudar (não pode apontar para outro objeto)
 * - Mas o CONTEÚDO do objeto (atributos) pode ser alterado!
 * Ou seja: 'conta' sempre aponta para o mesmo objeto, mas saldo pode mudar.
 */
public class TesteFinal {

    // referência final: não pode fazer 'conta = new Conta(...)' novamente
    final static Conta conta = new Conta(900.00);

    public static void main(String[] args) {
        System.out.println(conta.getSaldo()); // 900.00
        conta.setSaldo(800.00); // OK! Altera o conteúdo, não a referência
        System.out.println("Conta com saldo alterado");
        System.out.println(conta.getSaldo()); // 800.00
    }

}
