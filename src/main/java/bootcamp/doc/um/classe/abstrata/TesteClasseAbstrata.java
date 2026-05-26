package bootcamp.doc.um.classe.abstrata;

/**
 * Demonstra o uso de classes abstratas com polimorfismo.
 * A variável é do tipo Conta (abstrata), mas instancia subclasses concretas.
 * Cada chamada a imprimeExtrato() executa a versão da subclasse correspondente.
 */
public class TesteClasseAbstrata {

    public static void main(String[] args) {
        // Polimorfismo: tipo Conta, instância ContaPoupanca
        Conta poupanca = new ContaPoupanca();
        poupanca.setSaldo(123.45);
        poupanca.imprimeExtrato();

        // Polimorfismo: tipo Conta, instância ContaCorrente
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(678.90);
        contaCorrente.imprimeExtrato();
    }

}
