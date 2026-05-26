package bootcamp.doc.quartoze.tratamento_exececoes;

/**
 * Demonstra try-catch-finally para tratamento de exceções:
 * - try: bloco que pode lançar exceção
 * - catch: captura e trata a exceção (pode ter múltiplos catches)
 * - finally: SEMPRE executa, independente de exceção (limpeza de recursos)
 * - throws na assinatura: propaga exceção para o chamador
 */
public class TesteExcecao {

    public static void main(String[] args) throws ExcecaoValorParaSaqueZerado {
        Conta conta = new Conta();

        conta.setSaldo(100.00);
        conta.setTaxaOperacao(0.5);

        try {
            conta.sacar(0.00); // Vai lançar ExcecaoValorParaSaqueZerado
        } catch (ExcecaoValorParaSaqueZerado e) {
            // Catch específico: trata exceção customizada
            System.out.println(e.getMessage());
            throw e; // Re-lança a exceção após tratar
        } catch (Exception e) {
            // Catch genérico: trata qualquer outra exceção
            System.out.println(e.getMessage());
        } finally {
            // Sempre executa: ideal para liberar recursos
            System.out.println("Bloqueia Conta");
        }
    }

}
