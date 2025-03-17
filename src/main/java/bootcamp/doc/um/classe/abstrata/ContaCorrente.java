package bootcamp.doc.um.classe.abstrata;

public class ContaCorrente extends Conta {

    @Override
    public void imprimeExtrato() {
        System.out.println("Extrato da Conta Corrente");
        System.out.println(this.getSaldo());
    }

}
