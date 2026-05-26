package bootcamp.doc.dois.interfaces;

/**
 * Demonstra o uso prático de interfaces.
 * ContaCorrente e ContaPoupanca implementam a mesma interface (Conta),
 * mas cada uma com suas próprias regras de negócio.
 */
public class TesteInterface {

    public static void main(String[] args) {
        System.out.println("Conta Corrente");
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(5000.00);
        Extrato.geraExtrato(contaCorrente); // Polimorfismo via interface
        contaCorrente.sacar(1000.00);
        Extrato.geraExtrato(contaCorrente);

        System.out.println("\nConta Poupanca");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(15000.00);
        Extrato.geraExtrato(contaPoupanca); // Mesmo método, tipo diferente
        contaPoupanca.sacar(800.00);
        Extrato.geraExtrato(contaPoupanca);
    }

}
