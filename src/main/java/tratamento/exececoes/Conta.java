package tratamento.exececoes;

import lombok.Data;

@Data
public class Conta {

    protected Double saldo;
    private String tipoConta;
    protected Double taxaOperacao;

    public void sacar(Double valor) throws Exception {
        if (valor == 0) {
            throw new ExcecaoValorParaSaqueZerado();
        }

        Double valorADescontar = valor + this.taxaOperacao;

        if (this.saldo <= 0 || this.saldo < valorADescontar) {
            throw new Exception("Saldo insuficente");
        }

        this.saldo -= valorADescontar;
    }
}
