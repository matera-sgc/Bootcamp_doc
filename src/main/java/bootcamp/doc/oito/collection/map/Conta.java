package bootcamp.doc.oito.collection.map;

/**
 * Classe Conta com toString() sobrescrito.
 * toString() define a representação textual do objeto quando impresso.
 * Sem toString(), imprimiria o endereço de memória (ex: Conta@1a2b3c).
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

    // Representação textual customizada do objeto
    @Override
    public String toString() {
        return this.tipoConta + " | " + this.saldo;
    }
}
