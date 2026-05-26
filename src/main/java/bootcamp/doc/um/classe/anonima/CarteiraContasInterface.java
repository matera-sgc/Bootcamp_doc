package bootcamp.doc.um.classe.anonima;

/**
 * Demonstra implementação de interface funcional usando Lambda.
 * Como InterfaceConta tem apenas 1 método abstrato, pode ser substituída por lambda.
 * Lambda = forma simplificada de uma classe anônima para interfaces funcionais.
 */
public class CarteiraContasInterface {

    public static void main(String[] args) {
        // Lambda substituindo classe anônima: () -> implementação do único método
        InterfaceConta conta = () -> System.out.println("Conta Corrente");

        contaCorrente(conta);
    }

    // Recebe a interface como parâmetro (inversão de controle)
    public static void contaCorrente(InterfaceConta interfaceConta) {
        interfaceConta.imprimeTipoConta();
    }

}
