package bootcamp.doc.dois.interfaces;

public class TesteInterface {

    public static void main(String[] args) {
        System.out.println("Conta Corrente");
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(5000.00);
        Extrato.geraExtrato(contaCorrente);
        contaCorrente.sacar(1000.00);
        Extrato.geraExtrato(contaCorrente);

        System.out.println("\nConta Poupanca");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(15000.00);
        Extrato.geraExtrato(contaPoupanca);
        contaPoupanca.sacar(800.00);
        Extrato.geraExtrato(contaPoupanca);
    }

}
