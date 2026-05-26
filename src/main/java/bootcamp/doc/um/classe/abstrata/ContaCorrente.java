package bootcamp.doc.um.classe.abstrata;

/**
 * Classe concreta que herda de Conta (abstrata).
 * Obrigatoriamente implementa o método abstrato imprimeExtrato().
 */
public class ContaCorrente extends Conta {

    // Implementação específica para Conta Corrente
    @Override
    public void imprimeExtrato() {
        System.out.println("Extrato da Conta Corrente");
        System.out.println(this.getSaldo());
    }

}
