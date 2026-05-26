package bootcamp.doc.tres.modificador_acesso;

/**
 * Demonstra o modificador 'final' em atributos.
 * - final em atributo: valor só pode ser atribuído UMA vez (constante após inicialização).
 * - Pode ser inicializado na declaração OU no construtor.
 */
public class ContaCorrente {

    public final String tipoConta = "Corrente"; // final na declaração
    public final Double taxaOperacao; // final inicializado no construtor

    public ContaCorrente() {
        this.taxaOperacao = 0.45;
    }
}
