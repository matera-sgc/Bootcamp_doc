package bootcamp.doc.tres.modificador_acesso;

/**
 * Demonstra os modificadores 'static' e 'final' em classe:
 * - final class: NÃO pode ser herdada (estendida) por outras classes.
 * - static method: pertence à CLASSE, não a uma instância. Chamado via NomeClasse.metodo().
 */
public final class StaticConta {

    // Método static: não precisa instanciar a classe para chamar
    public static void imprimeTipoConta() {
        System.out.println("Conta Static");
    }

}
