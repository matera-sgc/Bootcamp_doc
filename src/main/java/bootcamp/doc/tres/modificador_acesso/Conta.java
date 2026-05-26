package bootcamp.doc.tres.modificador_acesso;

/**
 * Demonstra Modificadores de Acesso:
 * - private: atributo só acessível dentro da própria classe
 * - public: métodos acessíveis de qualquer lugar
 * Encapsulamento: atributo private + getters/setters public
 */
public class Conta {

    private Double saldo; // private = acesso restrito à classe

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
