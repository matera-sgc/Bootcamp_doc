package funcswitch;

public class TesteSwitch {

    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        exibeTipoConta(contaCorrente);
        exibeTipoContaJava17(contaPoupanca);
    }

    private static void exibeTipoConta(Conta conta) {
        switch (conta.getTipoConta()){
            case "Conta Corrente":
                System.out.println("E uma conta corrente.");
                break;
            case "Conta Comum":
                System.out.println("E uma conta comum.");
                break;
            case "Conta Poupanca":
                System.out.println("E uma conta poupança.");
                break;
            default:
                System.out.println("Não identificado o tipo de conta");

        }
    }

    private static void exibeTipoContaJava17(Conta conta) {
        String mensagem = switch (conta.getTipoConta()){
            case "Conta Corrente" -> "E uma conta corrente.";
            case "Conta Comum" -> "E uma conta comum.";
            case "Conta Poupanca" -> "E uma conta poupança.";
            default -> "Não identificado o tipo de conta";
        };

        System.out.println(mensagem);
    }

}
