package lambdas;

public class TesteThreadComum {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Comum Teste");
            }
        };

        new Thread(r).start();
    }

}
