package bootcamp.doc.um.classe.anonima;

/**
 * Demonstra Classes Anônimas: instâncias criadas "inline" sobrescrevendo métodos.
 * Não é necessário criar arquivos separados como ContaCorrente.java, ContaPoupanca.java.
 * Útil para implementações simples e pontuais.
 */
public class CarteiraContas {

    // Classe anônima: cria uma subclasse de Conta sem nome, sobrescrevendo o método
    Conta contaCorrente = new Conta() {
        @Override
        public void imprimeTipoConta() {
            System.out.println("Conta Corrente");
        }
    };

    // Outra classe anônima com comportamento diferente
    Conta contaPoupanca = new Conta() {
        @Override
        public void imprimeTipoConta() {
            System.out.println("Conta Poupança");
        }
    };

}
