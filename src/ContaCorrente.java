public class ContaCorrente extends Conta{


    public ContaCorrente(Client client) {
        super(client);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("---- Extrato conta corrente ----");
        super.imprimirInfosComuns();
    }
}
