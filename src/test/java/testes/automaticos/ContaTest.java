package testes.automaticos;

import bootcamp.doc.quinze.testes_automaticos.Conta;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testes Unitários com JUnit 4.
 * - @Test: marca método como teste
 * - assertEquals(esperado, atual): verifica se valores são iguais
 * - Cada teste deve ser independente e verificar UM comportamento
 * - Padrão AAA: Arrange (preparar), Act (executar), Assert (verificar)
 */
public class ContaTest {

    @Test
    public void testaSaque() {
        // Arrange: prepara dados
        Double saldoTeste = 100.00;
        Double taxaOperacaoTeste = 0.50;
        Double valorSaque = 50.00;
        Double valorRestante = saldoTeste - (valorSaque+taxaOperacaoTeste);

        // Act: executa operação
        Conta conta = new Conta(saldoTeste, taxaOperacaoTeste);
        conta.sacar(valorSaque);

        // Assert: verifica resultado
        assertEquals(valorRestante, conta.getSaldo());
    }

    @Test
    public void testaDeposito() {
        // Arrange
        Double saldoTeste = 100.00;
        Double taxaOperacaoTeste = 0.50;
        Double valorDeposito = 50.00;
        Double valorTotal = saldoTeste + (valorDeposito-taxaOperacaoTeste);

        // Act
        Conta conta = new Conta(saldoTeste, taxaOperacaoTeste);
        conta.depositar(valorDeposito);

        // Assert
        assertEquals(valorTotal, conta.getSaldo());
    }

}