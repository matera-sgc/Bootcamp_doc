package bootcamp.doc.dois.interfaces;

/**
 * Implementa a interface Conta com regras específicas de Conta Corrente.
 * Aplica taxa de operação tanto no depósito quanto no saque.
 */
public class ContaCorrente implements Conta {

    private Double saldo = 100.00;
    private final Double taxaOperacao = 0.60; // Taxa cobrada em cada operação

    @Override
    public void depositar(Double valor) {
        this.saldo += valor - taxaOperacao; // Desconta taxa no depósito
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor - taxaOperacao; // Desconta taxa no saque
    }

    @Override
    public Double getSaldo() {
        return this.saldo;
    }
}
