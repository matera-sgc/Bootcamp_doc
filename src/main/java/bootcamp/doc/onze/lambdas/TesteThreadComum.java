package bootcamp.doc.onze.lambdas;

/**
 * Demonstra criação de Thread SEM lambda (forma tradicional).
 * Usa classe anônima para implementar Runnable.
 * Compare com TesteThreadLambda para ver a simplificação.
 */
public class TesteThreadComum {

    public static void main(String[] args) {
        // Classe anônima implementando Runnable
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Comum Teste");
            }
        };

        new Thread(r).start();
    }

}
