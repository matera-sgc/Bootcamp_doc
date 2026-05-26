package bootcamp.doc.oito.collection.set;

/**
 * Classe que implementa Comparable para ordenação natural.
 * - Comparable<Conta>: define a ordenação padrão (por tipoConta)
 * - equals(): define quando dois objetos são "iguais" (mesmo tipoConta)
 * Importante para Set: equals() define se elemento já existe no conjunto.
 * NOTA: deveria sobrescrever hashCode() junto com equals() (contrato Java).
 */
public class Conta implements Comparable<Conta>{

    private String tipoConta;
    private Double saldo;

    public Conta(String tipoConta, Double saldo) {
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    // Ordenação natural: compara por tipoConta (alfabético)
    @Override
    public int compareTo(Conta conta) {
        return this.tipoConta.compareTo(conta.getTipoConta());
    }

    // Define igualdade: contas com mesmo tipoConta são consideradas iguais
    @Override
    public boolean equals(Object o) {
        Conta conta = (Conta) o;
        return this.tipoConta.equals(conta.getTipoConta());
    }

    //getters e setters

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
