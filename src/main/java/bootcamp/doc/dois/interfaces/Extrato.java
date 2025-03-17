package bootcamp.doc.dois.interfaces;

public class Extrato {

    public static void geraExtrato(Conta conta) {
        System.out.println("Saldo Atual");
        System.out.println(conta.getSaldo());
    }

}
