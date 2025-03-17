package bootcamp.doc.quatro.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Conta {

    protected Double saldo;
    private String tipoConta;
    protected Double taxaOperacao;
}
