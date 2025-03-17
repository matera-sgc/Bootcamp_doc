package bootcamp.doc.dois.interfaces;

public class ContaPoupanca implements Conta {

    private Double saldo = 100.00;



    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    @Override
    public Double getSaldo() {
        return this.saldo;
    }
}
