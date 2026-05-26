package bootcamp.doc.dois.interfaces.funcional;

/**
 * Demonstra Interface Funcional com Lambda.
 * Em vez de criar classes que implementam a interface,
 * usamos lambdas para definir o comportamento inline.
 */
public class TesteInterfaceFuncional {

    public static void main(String[] args) {
        // Lambda implementando a interface funcional: (parâmetros) -> corpo
        ContaInterfaceFuncional conta = valor -> System.out.println("Saldo: " + valor);

        conta.exibeSaldo(100.00);

        // Outra implementação lambda com lógica diferente (desconta tarifa)
        ContaInterfaceFuncional contaTarifa = valor -> System.out.println("Saldo - Tarifa: " + (valor - 0.50));

        contaTarifa.exibeSaldo(255.15);

    }

}
