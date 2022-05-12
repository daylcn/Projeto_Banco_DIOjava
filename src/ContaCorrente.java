public class ContaCorrente extends Conta
{

    public ContaCorrente(Cliente leandro) {
    }

    @Override
    public void imprimirExtrato() 
    {
    System.out.println("### Extrato Conta Corrente ###");
    super.imprimirInfosComuns();
    }

    

   


}