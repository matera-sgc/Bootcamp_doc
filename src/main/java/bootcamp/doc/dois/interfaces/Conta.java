package bootcamp.doc.dois.interfaces;

/**
 * Interface: define um contrato que classes devem seguir.
 * Todos os métodos são implicitamente públicos e abstratos.
 * Uma classe pode implementar múltiplas interfaces (diferente de herança).
 */
public interface Conta {

    // Métodos que toda conta DEVE implementar
    void depositar(Double valor);

    void sacar(Double valor);

    Double getSaldo();
}
