package bootcamp.doc.dezesseis.record;

/**
 * Demonstra o Construtor Compacto de Records para validação.
 * O construtor compacto é executado ANTES da atribuição dos campos.
 * Ideal para validar dados na criação (fail-fast).
 */
public class TesteRecordValidacao {

    public static void main(String[] args) {
        // Criação válida
        ContaRecord contaValida = new ContaRecord("Conta Corrente", 1000.00, 0.50);
        System.out.println("Conta válida criada: " + contaValida);

        // Tentativa com saldo negativo → lança IllegalArgumentException
        System.out.println("\nTentando criar conta com saldo negativo...");
        try {
            ContaRecord contaInvalida = new ContaRecord("Conta Corrente", -100.00, 0.50);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        // Tentativa com tipo vazio → lança IllegalArgumentException
        System.out.println("\nTentando criar conta com tipo vazio...");
        try {
            ContaRecord contaSemTipo = new ContaRecord("", 500.00, 0.50);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        // Tentativa com saldo null → lança IllegalArgumentException
        System.out.println("\nTentando criar conta com saldo null...");
        try {
            ContaRecord contaNull = new ContaRecord("Conta Corrente", null, 0.50);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

}
