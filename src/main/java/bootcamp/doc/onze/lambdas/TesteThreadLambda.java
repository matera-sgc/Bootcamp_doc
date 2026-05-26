package bootcamp.doc.onze.lambdas;

/**
 * Demonstra criação de Thread COM lambda.
 * Lambda substitui a classe anônima de forma mais concisa.
 * () -> corpo: sem parâmetros, executa o corpo.
 */
public class TesteThreadLambda {

    public static void main(String[] args) {
        // Lambda: substitui new Runnable() { run() {...} }
        Runnable runLambda = () -> System.out.println("Thread Lambda Teste");

        new Thread(runLambda).start();
    }

}
