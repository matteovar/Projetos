package heranca;
public class ContaPoupanca extends ContaBancaria{
    int diaDeVencimento;

    public ContaPoupanca(String cliente, int nroConta, float saldo ,int diaDeVencimento){
        super(cliente,nroConta, saldo);
        this.diaDeVencimento = diaDeVencimento;
    }

    public void calclularNovoSaldo(float saldo,float taxaRendimento){
        float juros = saldo * taxaRendimento/100;
        saldo += juros;
    }
     
    @Override
    public String toString(){
        return super.toString() + "\nDia do vencimento: " + diaDeVencimento;
    }
}


