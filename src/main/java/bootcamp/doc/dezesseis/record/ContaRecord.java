package bootcamp.doc.dezesseis.record;

/**
 * Record: classe imutável e concisa introduzida no Java 16.
 * Gera automaticamente:
 * - Construtor com todos os parâmetros
 * - Métodos acessores (sem prefixo "get"): saldo(), tipoConta(), taxaOperacao()
 * - equals() e hashCode() baseados em todos os campos
 * - toString() com todos os campos
 *
 * IMPORTANTE:
 * - Todos os campos são final (imutáveis após criação)
 * - Não possui setters (não pode alterar valores após construção)
 * - Ideal para DTOs, Value Objects e dados imutáveis
 */
public record ContaRecord(String tipoConta, Double saldo, Double taxaOperacao) {

    // Construtor compacto: validação sem repetir atribuições
    public ContaRecord {
        if (saldo == null || saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser nulo ou negativo");
        }
        if (tipoConta == null || tipoConta.isBlank()) {
            throw new IllegalArgumentException("Tipo de conta não pode ser vazio");
        }
    }

    // Métodos customizados podem ser adicionados normalmente
    public Double saldoComTaxa() {
        return saldo - taxaOperacao;
    }
}
