package interfaces.funcional;

public class TesteInterfaceFuncional {

    public static void main(String[] args) {
        ContaInterfaceFuncional conta = valor -> System.out.println("Saldo: " + valor);

        conta.exibeSaldo(100.00);

        ContaInterfaceFuncional contaTarifa = valor -> System.out.println("Saldo - Tarifa: " + (valor - 0.50));

        contaTarifa.exibeSaldo(255.15);

    }

}
