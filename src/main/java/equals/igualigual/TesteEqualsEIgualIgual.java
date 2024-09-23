package equals.igualigual;

public class TesteEqualsEIgualIgual {

    public static void main(String[] args) {
        String tipoConta1 = "Poupanca";
        String tipoConta2 = "Poupanca";
        String tipoConta3 = new String("Poupanca");

        System.out.println("(tipoConta1 == tipoConta2) ->" + (tipoConta1 == tipoConta2));
        System.out.println("(tipoConta1 == tipoConta3) ->" + (tipoConta1 == tipoConta3));
        System.out.println("tipoConta1.equals(tipoConta2) ->" + tipoConta1.equals(tipoConta2));
        System.out.println("tipoConta1.equals(tipoConta3) ->" + tipoConta1.equals(tipoConta3));
    }

}
