package interfaces;

public interface Conta {

    void depositar(Double valor);

    void sacar(Double valor);

    Double getSaldo();
}
