package bootcamp.doc.dezesseis.record;

/**
 * Demonstra Records com Switch Expression.
 * Combinação poderosa de duas features modernas do Java:
 * - Record: dados imutáveis e concisos
 * - Switch Expression: lógica condicional retornando valor
 */
public class TesteRecordComSwitch {

    public static void main(String[] args) {
        ContaRecord contaCorrente = new ContaRecord("Conta Corrente", 5000.00, 0.50);
        ContaRecord contaPoupanca = new ContaRecord("Conta Poupança", 3000.00, 0.25);
        ContaRecord contaComum = new ContaRecord("Conta Comum", 1000.00, 0.10);

        // Combina Record + Switch Expression
        System.out.println(descricaoConta(contaCorrente));
        System.out.println(descricaoConta(contaPoupanca));
        System.out.println(descricaoConta(contaComum));

        System.out.println();

        // Calcula taxa baseada no tipo usando switch
        System.out.println("Taxa corrente: " + calculaTaxaMensal(contaCorrente));
        System.out.println("Taxa poupança: " + calculaTaxaMensal(contaPoupanca));
        System.out.println("Taxa comum: " + calculaTaxaMensal(contaComum));
    }

    // Switch Expression com Record
    private static String descricaoConta(ContaRecord conta) {
        return switch (conta.tipoConta()) {
            case "Conta Corrente" -> "Corrente: saldo R$ " + conta.saldo() + " (taxa diária)";
            case "Conta Poupança" -> "Poupança: saldo R$ " + conta.saldo() + " (rendimento mensal)";
            case "Conta Comum" -> "Comum: saldo R$ " + conta.saldo() + " (sem benefícios)";
            default -> "Tipo desconhecido";
        };
    }

    // Cálculo usando switch + dados do record
    private static Double calculaTaxaMensal(ContaRecord conta) {
        Double multiplicador = switch (conta.tipoConta()) {
            case "Conta Corrente" -> 30.0;   // Taxa diária × 30
            case "Conta Poupança" -> 1.0;    // Taxa única mensal
            case "Conta Comum" -> 15.0;      // Taxa quinzenal × 2
            default -> 0.0;
        };

        return conta.taxaOperacao() * multiplicador;
    }

}
