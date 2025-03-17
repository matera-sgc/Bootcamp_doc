package bootcamp.doc.um.classe.abstrata;

public class TesteClasseAbstrata {

    public static void main(String[] args) {
        Conta poupanca = new ContaPoupanca();
        poupanca.setSaldo(123.45);
        poupanca.imprimeExtrato();

        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(678.90);
        contaCorrente.imprimeExtrato();
    }

}
