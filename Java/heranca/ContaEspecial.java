package heranca;
public class ContaEspecial extends ContaBancaria {
        float limite;

        public ContaEspecial(String cliente, int nroConta , float saldo,float limite){
            super(cliente, nroConta, saldo);
            this.limite = limite;
        }

        
        public void sacar(float valor) {
            if (valor > 0 && (saldo - valor) >= -limite) {
                this.saldo -= valor;
            } else {
                System.out.println("\nSaque de " + valor + " não é possível. Limite insuficiente.");
            }
        }

    @Override
    public String toString() {
        return super.toString() + "\nLimite: " + limite;
    }
}