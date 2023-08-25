package heranca;
public class Contas {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("Cliente Comum", 1,50000);
        ContaPoupanca cp = new ContaPoupanca("Cliente poupanca", 2, 150000 ,31 );
        ContaEspecial ce = new ContaEspecial("Cliente Especial", 3, 1050000,300000);

        System.out.println("Saldo inicial: ");

        System.out.println("\n-------Cliente Comum--------\nSaldo = " + cb.saldo);
        System.out.println("-------Cliente Poupanca--------\nSaldo = " + cp.saldo);
        System.out.println("-------Cliente Especial--------\nSaldo = " + ce.saldo);

        System.out.println("\n############ -#- ################");
     
        cb.sacar(500000);
        cp.sacar(300);
        ce.sacar(300000);


        System.out.println("\n############ -#- ################");

        System.out.println("Saque: ");  
        
        System.out.println("\n-------Cliente Comum--------\nSaldo  = " + cb.saldo);
        System.out.println("-------Cliente Poupanca--------\nSaldo = " + cp.saldo);
        System.out.println("-------Cliente Especial--------\nSaldo = " + ce.saldo);


        System.out.println("\n############ -#- ################");

        cb.depositar(50000);
        cp.depositar(85000);
        ce.depositar(987520);

        System.out.println("Deposito:  " );

        System.out.println("\n-------Cliente Comum--------\nSaldo = " + cb.saldo);
        System.out.println("-------Cliente Poupanca--------\nSaldo = " + cp.saldo);
        System.out.println("-------Cliente Especial--------\nSaldo = " + ce.saldo);


        float taxaRendimento = 0.72f; 
        float rendimentoPoupanca = cp.getsaldo() * (taxaRendimento / 100);
        cp.depositar(rendimentoPoupanca); 


        System.out.println("\n############ -#- ################");

        System.out.println("Rendimento da poupança: " + rendimentoPoupanca + " ao mes");
        System.out.println("Saldo de novo mes: " + cp.saldo);

        
        System.out.println("\n############ -#- ################");

        System.out.println("Saldo Final: ");

        System.out.println("\n-------Cliente Comum--------" + cb.toString());
        System.out.println("\n-------Cliente Poupanca--------" + cp.toString());
        System.out.println("\n-------Cliente Especial--------" + ce.toString());
    }
}
