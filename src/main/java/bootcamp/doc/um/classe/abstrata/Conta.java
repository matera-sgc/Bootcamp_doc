package bootcamp.doc.um.classe.abstrata;

/**
 * Classe Abstrata - Não pode ser instanciada diretamente.
 * Define um contrato: subclasses DEVEM implementar o método abstrato imprimeExtrato().
 * Contém atributos e métodos concretos (getSaldo, setSaldo) que são herdados.
 */
public abstract class Conta {

    private Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // Método abstrato: obriga cada subclasse a fornecer sua própria implementação
    public abstract void imprimeExtrato();
}
