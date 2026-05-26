package bootcamp.doc.doze.funcswitch;

/**
 * Demonstra Switch Expression com múltiplos valores no mesmo case.
 * - case "valor1", "valor2" -> : agrupa vários valores na mesma ação
 * - Elimina duplicação de código quando vários cases têm o mesmo comportamento
 */
public class TesteSwitchMultiplosValoresCase {

    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();
        exibeContaComTarifa(contaCorrente);
        exibeContaComTarifa(contaPoupanca);
    }

    private static void exibeContaComTarifa(Conta conta) {
        switch (conta.getTipoConta()){
            // Múltiplos valores no mesmo case: Corrente E Comum têm mesma tarifa
            case "Conta Corrente", "Conta Comum" -> System.out.println("E uma conta corrente/comum com tarifa de R$ 1.25.");
            case "Conta Poupanca" -> System.out.println("E uma conta poupança com tarifa de R$ 0,25.");
            default -> System.out.println("Não identificado o tipo de conta");
        }
    }

}

