package bootcamp.doc.treze.sobrescrita_sobrecarga;

/**
 * Classe base que demonstra herança e sobrescrita/sobrecarga.
 * - protected: atributos acessíveis nas subclasses
 * - Método depositar() pode ser SOBRESCRITO (Override) nas subclasses
 */
public class Conta {

    protected Double saldo;
    protected Double taxaOperacao;

    public Conta(Double saldo) {
        this.saldo = saldo;
        this.taxaOperacao = 0.45;
    }

    // Método que será sobrescrito (Override) na subclasse
    public void depositar(Double valor) {
        this.saldo += valor - taxaOperacao;
    }

    public Double getSaldo() {
        return this.saldo;
    }
}
