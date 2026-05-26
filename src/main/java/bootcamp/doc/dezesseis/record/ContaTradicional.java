package bootcamp.doc.dezesseis.record;

import java.util.Objects;

/**
 * Classe TRADICIONAL equivalente ao ContaRecord.
 * Compare a quantidade de código necessário:
 * - Record: ~5 linhas
 * - Classe tradicional: ~50+ linhas (construtor, getters, equals, hashCode, toString)
 *
 * Esta classe existe apenas para comparação didática.
 */
public class ContaTradicional {

    private final String tipoConta;
    private final Double saldo;
    private final Double taxaOperacao;

    // Construtor manual
    public ContaTradicional(String tipoConta, Double saldo, Double taxaOperacao) {
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.taxaOperacao = taxaOperacao;
    }

    // Getters manuais (Record gera automaticamente sem prefixo "get")
    public String getTipoConta() {
        return tipoConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getTaxaOperacao() {
        return taxaOperacao;
    }

    // equals() manual (Record gera automaticamente)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaTradicional that = (ContaTradicional) o;
        return Objects.equals(tipoConta, that.tipoConta)
                && Objects.equals(saldo, that.saldo)
                && Objects.equals(taxaOperacao, that.taxaOperacao);
    }

    // hashCode() manual (Record gera automaticamente)
    @Override
    public int hashCode() {
        return Objects.hash(tipoConta, saldo, taxaOperacao);
    }

    // toString() manual (Record gera automaticamente)
    @Override
    public String toString() {
        return "ContaTradicional[tipoConta=" + tipoConta
                + ", saldo=" + saldo
                + ", taxaOperacao=" + taxaOperacao + "]";
    }
}
