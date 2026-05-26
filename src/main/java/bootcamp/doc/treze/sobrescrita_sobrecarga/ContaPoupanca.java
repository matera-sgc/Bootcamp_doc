package bootcamp.doc.treze.sobrescrita_sobrecarga;

/**
 * Demonstra Sobrescrita (@Override) e Sobrecarga (Overload):
 *
 * SOBRESCRITA: mesmo método da classe pai com implementação diferente.
 * - depositar(Double): sobrescreve o da classe Conta (sem taxa)
 *
 * SOBRECARGA: mesmo nome de método com parâmetros diferentes.
 * - sacar(Double): saque simples
 * - sacar(Double, Double): saque com taxa customizada
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Double saldo) {
        super(saldo); // Chama construtor da classe pai
    }

    // SOBRESCRITA: mesma assinatura, comportamento diferente (sem taxa)
    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    // SOBRECARGA: sacar com 1 parâmetro
    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    // SOBRECARGA: sacar com 2 parâmetros (valor + taxa)
    public void sacar(Double valor, Double taxaOperacao) {
        this.saldo -= valor + taxaOperacao;
    }
}
