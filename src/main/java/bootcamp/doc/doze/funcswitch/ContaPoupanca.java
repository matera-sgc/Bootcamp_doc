package bootcamp.doc.doze.funcswitch;

/**
 * Implementação de Conta para tipo "Conta Poupanca".
 */
public class ContaPoupanca implements Conta {

    private final String tipoConta;

    public ContaPoupanca() {
        this.tipoConta = "Conta Poupanca";
    }

    @Override
    public String getTipoConta() {
        return this.tipoConta;
    }
}
