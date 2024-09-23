package lambdas;

public class TesteThreadLambda {

    public static void main(String[] args) {
        Runnable runLambda = () -> System.out.println("Thread Lambda Teste");

        new Thread(runLambda).start();
    }

}
