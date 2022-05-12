public class ContaPoupanca extends Conta
{

   

    public ContaPoupanca(Cliente leandro) {
    }

    @Override
    public void imprimirExtrato() 
    {
        System.out.println("### Extrato Conta Poupança ###");   
        super.imprimirInfosComuns();
       
        
    }
    
    

}