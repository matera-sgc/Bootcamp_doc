package tratamento.exececoes;

public class TesteExcecao {

    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setSaldo(100.00);
        conta.setTaxaOperacao(0.5);

        try {
            conta.sacar(0.00);
        } catch (ExcecaoValorParaSaqueZerado e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bloqueia Conta");
        }
    }

}
