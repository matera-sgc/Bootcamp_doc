package bootcamp.doc.onze.lambdas;

/**
 * Demonstra lambda inline (mais simplificado).
 * O lambda é passado diretamente como argumento do construtor de Thread,
 * sem criar variável intermediária.
 */
public class TesteThreadLambdaSimplificado {

    public static void main(String[] args) {
        // Lambda diretamente no argumento (máxima simplificação)
        new Thread(
                () -> System.out.println("Thread Lambda Simplificado")
        ).start();
    }

}
