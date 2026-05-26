package bootcamp.doc.treze.sobrescrita_sobrecarga;

/**
 * Testa sobrescrita e sobrecarga na prática.
 * - Conta.depositar() desconta taxa (0.45)
 * - ContaPoupanca.depositar() NÃO desconta taxa (sobrescrita)
 * - ContaPoupanca.sacar() tem 2 versões: com e sem taxa (sobrecarga)
 */
public class TesteSobrescritaSobrecarga {

    public static void main(String[] args) {
        // Conta comum: depositar desconta taxa
        Conta contaComum = new Conta(9000.00);
        contaComum.depositar(900.45); // 9000 + 900.45 - 0.45 = 9900.00

        // Poupança: depositar NÃO desconta taxa (sobrescrita)
        ContaPoupanca contaPoupanca = new ContaPoupanca(6000.00);
        contaPoupanca.depositar(500.00); // 6000 + 500 = 6500.00

        System.out.println("Conta Comum");
        System.out.println(contaComum.getSaldo());

        System.out.println("Poupança");
        System.out.println(contaPoupanca.getSaldo());

        // Sobrecarga: sacar sem taxa
        contaPoupanca.sacar(500.00);

        System.out.println("Poupança Sem Taxa");
        System.out.println(contaPoupanca.getSaldo());

        // Sobrecarga: sacar COM taxa customizada
        contaPoupanca.sacar(500.00, 0.99);

        System.out.println("Poupança Com Taxa");
        System.out.println(contaPoupanca.getSaldo());
    }

}
