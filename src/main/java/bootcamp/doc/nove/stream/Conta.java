package bootcamp.doc.nove.stream;

/**
 * Classe modelo usada nos exemplos de Stream.
 * Representa uma conta bancária com tipo e saldo.
 */
public class Conta {

    private String tipoConta;
    private Double saldo;

    public Conta(String tipoConta, Double saldo) {
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
