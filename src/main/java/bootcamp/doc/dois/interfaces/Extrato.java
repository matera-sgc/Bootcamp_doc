package bootcamp.doc.dois.interfaces;

/**
 * Classe utilitária que gera extrato para QUALQUER tipo de Conta.
 * Aceita a interface Conta como parâmetro = polimorfismo via interface.
 */
public class Extrato {

    // Método estático: pode ser chamado sem instanciar a classe
    public static void geraExtrato(Conta conta) {
        System.out.println("Saldo Atual");
        System.out.println(conta.getSaldo());
    }

}
