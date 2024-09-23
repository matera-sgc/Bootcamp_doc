package lambdas;

public class TesteThreadLambdaSimplificado {

    public static void main(String[] args) {
        new Thread(
                () -> System.out.println("Thread Lambda Simplificado")
        ).start();
    }

}
