package bootcamp.doc.quinze.testes_automaticos;

/**
 * Classe Conta usada para demonstrar Testes Unitários com JUnit.
 * Contém lógica de negócio (depositar/sacar) que será validada
 * automaticamente pelos testes em ContaTest.java.
 */
public class Conta {

    private Double saldo;
    private Double taxaOperacao;

    public Conta(Double saldo, Double taxaOperacao) {
        this.saldo = saldo;
        this.taxaOperacao = taxaOperacao;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getTaxaOperacao() {
        return taxaOperacao;
    }

    public void setTaxaOperacao(Double taxaOperacao) {
        this.taxaOperacao = taxaOperacao;
    }

    // Deposita valor descontando taxa de operação
    public void depositar(Double valor) {
        this.saldo += valor - taxaOperacao;
    }

    // Saca valor acrescido da taxa de operação
    public void sacar(Double valor) {
        this.saldo -= valor + taxaOperacao;
    }
}
