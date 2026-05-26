package bootcamp.doc.doze.funcswitch;

/**
 * Implementação de Conta para tipo "Conta Corrente".
 * Atributo final: tipoConta é imutável após construção.
 */
public class ContaCorrente implements Conta {

    private final String tipoConta;

    public ContaCorrente() {
        this.tipoConta = "Conta Corrente";
    }

    @Override
    public String getTipoConta() {
        return this.tipoConta;
    }
}
