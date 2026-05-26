package bootcamp.doc.quatro.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Demonstra o uso do Lombok para eliminar código boilerplate.
 * - @Getter: gera automaticamente os métodos get para todos os atributos
 * - @Setter: gera automaticamente os métodos set para todos os atributos
 * - @AllArgsConstructor: gera construtor com todos os atributos como parâmetros
 * O código compilado terá getters, setters e construtor, sem precisar escrevê-los.
 */
@Getter
@Setter
@AllArgsConstructor
public class Conta {

    protected Double saldo;
    private String tipoConta;
    protected Double taxaOperacao;
}
