package bootcamp.doc.um.classe.abstrata;

/**
 * Outra classe concreta que herda de Conta (abstrata).
 * Cada subclasse pode ter sua própria lógica no método imprimeExtrato().
 */
public class ContaPoupanca extends Conta {

    // Implementação específica para Conta Poupança
    @Override
    public void imprimeExtrato() {
        System.out.println("Extrato da Conta Poupança");
        System.out.println(this.getSaldo());
    }

}
