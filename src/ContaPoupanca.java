public class ContaPoupanca extends Conta{


    public ContaPoupanca(Client client) {
        super(client);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("---- Extrato conta poupança ----");
        super.imprimirInfosComuns();
    }
}
