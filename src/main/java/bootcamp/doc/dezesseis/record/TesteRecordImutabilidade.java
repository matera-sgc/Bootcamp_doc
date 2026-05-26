package bootcamp.doc.dezesseis.record;

/**
 * Demonstra a IMUTABILIDADE dos Records.
 * - Não existe setter: após criação, valores não podem ser alterados.
 * - Para "modificar", cria-se um NOVO record com os valores desejados.
 * - Padrão "with" (criação de cópia modificada).
 */
public class TesteRecordImutabilidade {

    public static void main(String[] args) {
        ContaRecord conta = new ContaRecord("Conta Corrente", 1000.00, 0.50);

        System.out.println("Original: " + conta);

        // NÃO É POSSÍVEL: conta.setSaldo(2000.00) → não existe setter!

        // Para "alterar", cria-se novo record com valores atualizados
        ContaRecord contaAtualizada = new ContaRecord(
                conta.tipoConta(),       // mantém tipo
                conta.saldo() + 500.00,  // "deposita" 500
                conta.taxaOperacao()     // mantém taxa
        );

        System.out.println("Nova (após depósito): " + contaAtualizada);

        // Record original permanece inalterado (imutável)
        System.out.println("Original inalterado: " + conta);
    }

}
