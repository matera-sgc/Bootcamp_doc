package bootcamp.doc.seis.optional;

import bootcamp.doc.treze.sobrescrita_sobrecarga.Conta;

import java.util.Optional;

/**
 * Demonstra Optional para evitar NullPointerException.
 * - Optional.ofNullable(): encapsula um valor que PODE ser null
 * - isPresent(): verifica se há valor presente (não é null)
 * - Outras operações: orElse(), orElseThrow(), ifPresent(), map()
 */
public class ExemploOptional {

    public static void main(String[] args) {
        Conta conta = null; // Simula ausência de valor
        Optional<Conta> contaOptional = Optional.ofNullable(conta);

        // Retorna false porque conta é null
        System.out.println("Conta existe: " + contaOptional.isPresent());
    }

}
