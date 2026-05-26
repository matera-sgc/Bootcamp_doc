package bootcamp.doc.quartoze.tratamento_exececoes;

/**
 * Exceção customizada (checked exception).
 * - Estende Exception: obriga o chamador a tratar (try-catch ou throws)
 * - getMessage() sobrescrito: define mensagem específica para o erro
 * - Boas práticas: nome descritivo indicando o problema
 */
public class ExcecaoValorParaSaqueZerado extends Exception {

    @Override
    public String getMessage() {
        return "Valor para saque não pode ser zero.";
    }
}
