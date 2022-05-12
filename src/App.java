public class App {
    public static void main(String[] args) throws Exception {
        Cliente Leandro= new Cliente();
        Leandro.setNome("Leandro");
        
        Conta cc = new ContaCorrente(Leandro);
        cc.Depositar(100);

        Conta cp = new ContaPoupanca(Leandro);

        System.out.println();
        cc.Transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        

    }
}
