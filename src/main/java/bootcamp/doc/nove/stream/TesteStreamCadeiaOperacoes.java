package bootcamp.doc.nove.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstra cadeia de operações com Stream (pipeline):
 * 1. filter(): filtra elementos por condição
 * 2. mapToDouble(): transforma objetos em valores double
 * 3. average(): calcula a média (operação terminal)
 * 4. getAsDouble(): extrai o valor do OptionalDouble
 */
public class TesteStreamCadeiaOperacoes {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        contas.add(new Conta("Conta Corrente", 100.00));
        contas.add(new Conta("Conta Poupança", 200.00));
        contas.add(new Conta("Conta Comum", 300.00));
        contas.add(new Conta("Conta Comum", 400.00));

        // Pipeline: filtra -> mapeia para double -> calcula média
        Double saldo = contas.stream()
                .filter(conta -> conta.getTipoConta().equals("Conta Comum"))
                .mapToDouble(conta -> conta.getSaldo())
                .average()
                .getAsDouble();

        System.out.println(saldo); // Média: (300 + 400) / 2 = 350.0
    }

}
