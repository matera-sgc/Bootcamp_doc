package bootcamp.doc.tres.modificador_acesso;

/**
 * Demonstra chamada de método static.
 * Não precisa de 'new StaticConta()' - chama direto pela classe.
 */
public class TesteStatic {

    public static void main(String[] args) {
        // Chamada direta sem instância: Classe.metodo()
        StaticConta.imprimeTipoConta();
    }

}
