package testes.automaticos;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContaTest {

    @Test
    public void testaSaque() {
        Double saldoTeste = 100.00;
        Double taxaOperacaoTeste = 0.50;
        Double valorSaque = 50.00;
        Double valorRestante = saldoTeste - (valorSaque+taxaOperacaoTeste);

        Conta conta = new Conta(saldoTeste, taxaOperacaoTeste);
        conta.sacar(valorSaque);
        assertEquals(valorRestante, conta.getSaldo());
    }

    @Test
    public void testaDeposito() {
        Double saldoTeste = 100.00;
        Double taxaOperacaoTeste = 0.50;
        Double valorDeposito = 50.00;
        Double valorTotal = saldoTeste + (valorDeposito-taxaOperacaoTeste);

        Conta conta = new Conta(saldoTeste, taxaOperacaoTeste);
        conta.depositar(valorDeposito);
        assertEquals(valorTotal, conta.getSaldo());
    }

}