package bootcamp.doc.doze.funcswitch;

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
