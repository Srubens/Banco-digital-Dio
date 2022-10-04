public class Main {
    public static void main(String[] args){

        Client pessoa = new Client();
        pessoa.setName("Rubens");
        Conta cc = new ContaCorrente(pessoa);
        Conta cp = new ContaPoupanca(pessoa);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }

}
