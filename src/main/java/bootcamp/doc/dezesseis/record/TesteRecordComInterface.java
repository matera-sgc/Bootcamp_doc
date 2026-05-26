package bootcamp.doc.dezesseis.record;

/**
 * Demonstra que Records PODEM implementar interfaces.
 * Records NÃO podem:
 * - Estender outras classes (já estendem java.lang.Record implicitamente)
 * - Ter atributos de instância adicionais
 * - Ser abstratos
 *
 * Records PODEM:
 * - Implementar interfaces
 * - Ter métodos estáticos
 * - Ter métodos de instância adicionais
 * - Ter construtores customizados (compacto ou canônico)
 */
public class TesteRecordComInterface {

    // Interface que o record vai implementar
    interface Extrato {
        String geraExtrato();
    }

    // Record implementando interface
    record ContaComExtrato(String tipoConta, Double saldo) implements Extrato {

        @Override
        public String geraExtrato() {
            return "Extrato - " + tipoConta + " | Saldo: R$ " + saldo;
        }

        // Método estático permitido em records
        public static ContaComExtrato contaVazia(String tipo) {
            return new ContaComExtrato(tipo, 0.0);
        }
    }

    public static void main(String[] args) {
        // Record implementando interface
        ContaComExtrato conta = new ContaComExtrato("Conta Corrente", 2500.00);
        System.out.println(conta.geraExtrato());

        // Polimorfismo: variável do tipo interface
        Extrato extrato = new ContaComExtrato("Conta Poupança", 8000.00);
        System.out.println(extrato.geraExtrato());

        // Método estático (factory method)
        ContaComExtrato contaVazia = ContaComExtrato.contaVazia("Conta Comum");
        System.out.println(contaVazia.geraExtrato());
    }

}
