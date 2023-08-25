package heranca;
    public class ContaBancaria{
        private String cliente;
        private int nroConta;
        protected float saldo;

        
        public ContaBancaria(String cliente, int nroConta, float saldo){
            this.cliente = cliente;
            this.nroConta = nroConta;
            this.saldo = saldo;

        }

        public String getcliente(){
            return cliente;
        }

        public void setcliente(String cliente){
            this.cliente = cliente;
        }

        public int getnroConta(){
            return nroConta;
        }

        public void setnroConta(int nroConta){
            
            this.nroConta = nroConta;
        }

        public float getsaldo(){
            return saldo;
        }

        public void setsaldo(float saldo){
            this.saldo = saldo;
        }


        public void sacar(float valor) {
            if (valor<saldo)
                this.saldo -= valor;
            else 
            System.out.println("\nSaque de " + valor + " não é possível pois valor muito alto para o saldo. Tente outro valor ");
        }
            


        public void depositar(float valor){
            this.saldo += valor;
        }

        @Override
        public String toString(){
                return "\nNome do Cliente: " + this.cliente + "\nNumero da conta: " + this.nroConta + "\nSaldo:" + saldo;
        }

    }