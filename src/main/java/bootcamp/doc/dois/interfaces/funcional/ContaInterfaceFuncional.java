package bootcamp.doc.dois.interfaces.funcional;

/**
 * Interface Funcional: possui EXATAMENTE 1 método abstrato.
 * A anotação @FunctionalInterface garante que o compilador gere erro se mais métodos forem adicionados.
 * Pode ser implementada via expressão lambda.
 */
@FunctionalInterface
public interface ContaInterfaceFuncional {
    void exibeSaldo(Double valor);
}
