package bootcamp.doc.treze.sobrescrita_sobrecarga;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    public void sacar(Double valor, Double taxaOperacao) {
        this.saldo -= valor + taxaOperacao;
    }
}
