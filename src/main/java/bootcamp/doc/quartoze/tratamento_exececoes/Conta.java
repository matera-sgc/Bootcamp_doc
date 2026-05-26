package bootcamp.doc.quartoze.tratamento_exececoes;

import lombok.Data;

/**
 * Classe Conta com tratamento de exceções no método sacar().
 * - @Data (Lombok): gera getters, setters, toString, equals, hashCode
 * - throws Exception: declara que o método pode lançar exceção
 * - throw: lança a exceção efetivamente
 */
@Data
public class Conta {

    protected Double saldo;
    private String tipoConta;
    protected Double taxaOperacao;

    public void sacar(Double valor) throws Exception {
        // Validação 1: valor zerado lança exceção customizada
        if (valor == 0) {
            throw new ExcecaoValorParaSaqueZerado();
        }

        Double valorADescontar = valor + this.taxaOperacao;

        // Validação 2: saldo insuficiente lança exceção genérica
        if (this.saldo <= 0 || this.saldo < valorADescontar) {
            throw new Exception("Saldo insuficente");
        }

        this.saldo -= valorADescontar;
    }
}
