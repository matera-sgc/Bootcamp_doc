package bootcamp.doc.dezesseis.record;

/**
 * Demonstra o uso básico de Record vs Classe Tradicional.
 * - Record: acessa campos via metodo sem "get" → saldo(), tipoConta()
 * - Classe: acessa via getSaldo(), getTipoConta()
 * - Record gera toString() automático formatado
 */
public class TesteRecordBasico {

    public static void main(String[] args) {
        // Criação do Record (imutável)
        ContaRecord contaRecord = new ContaRecord("Conta Corrente", 1500.00, 0.50);

        // Acessores do Record: sem prefixo "get"
        System.out.println("=== Record ===");
        System.out.println("Tipo: " + contaRecord.tipoConta());
        System.out.println("Saldo: " + contaRecord.saldo());
        System.out.println("Taxa: " + contaRecord.taxaOperacao());
        System.out.println("Saldo com taxa: " + contaRecord.saldoComTaxa());
        System.out.println("toString(): " + contaRecord);

        System.out.println();

        // Classe Tradicional equivalente
        ContaTradicional contaTradicional = new ContaTradicional("Conta Corrente", 1500.00, 0.50);

        System.out.println("=== Classe Tradicional ===");
        System.out.println("Tipo: " + contaTradicional.getTipoConta());
        System.out.println("Saldo: " + contaTradicional.getSaldo());
        System.out.println("Taxa: " + contaTradicional.getTaxaOperacao());
        System.out.println("toString(): " + contaTradicional);
    }

}
