package lombok;

@Getter
@Setter
@AllArgsConstructor
public class Conta {

    protected Double saldo;
    private String tipoConta;
    protected Double taxaOperacao;
}
