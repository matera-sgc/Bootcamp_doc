package bootcamp.doc.dezesseis.record;

/**
 * Demonstra que Record gera equals() e hashCode() automaticamente.
 * Dois records com os mesmos valores são considerados IGUAIS (por conteúdo).
 * Diferente de classes normais, onde equals() padrão compara referências.
 */
public class TesteRecordEquals {

    public static void main(String[] args) {
        // Dois records com mesmos valores
        ContaRecord conta1 = new ContaRecord("Conta Poupança", 5000.00, 0.25);
        ContaRecord conta2 = new ContaRecord("Conta Poupança", 5000.00, 0.25);
        ContaRecord conta3 = new ContaRecord("Conta Corrente", 5000.00, 0.50);

        // equals() gerado automaticamente compara TODOS os campos
        System.out.println("conta1.equals(conta2): " + conta1.equals(conta2)); // true (mesmo conteúdo)
        System.out.println("conta1.equals(conta3): " + conta1.equals(conta3)); // false (tipo diferente)

        // == compara referências (como sempre)
        System.out.println("conta1 == conta2: " + (conta1 == conta2)); // false (objetos diferentes)

        // hashCode() consistente com equals()
        System.out.println("conta1.hashCode() == conta2.hashCode(): "
                + (conta1.hashCode() == conta2.hashCode())); // true
    }

}
