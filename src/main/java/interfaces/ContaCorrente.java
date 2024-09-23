package interfaces;

public class ContaCorrente implements Conta {

    private Double saldo = 100.00;
    private final Double taxaOperacao = 0.60;

    @Override
    public void depositar(Double valor) {
        this.saldo += valor - taxaOperacao;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor - taxaOperacao;
    }

    @Override
    public Double getSaldo() {
        return this.saldo;
    }
}
