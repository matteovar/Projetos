import java.util.Scanner;

class automovel {
    private String modelo;
    private String marca;
    private int ano;
    private float preco;

    public automovel() {
        modelo = "Nenhuma placa";
        marca = "Nenhuma marca";
        ano = 0;
        preco = 0;
    }

    public automovel(String modelo, String marca, int ano, float preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

     public String getmodelo(){
    return modelo;
  }

  public String getmarca(){
    return marca;
  }

  public int getano(){
    return ano;
  }

  public float getpreco(){
    return preco;
  }

  public void setmodelo(String modelo){
    this.modelo = modelo;
  }

  public void setmarca(String marca){
    this.marca = marca;
  }

  public void setano(int ano){
    this.ano = ano;
  }

  public void setpreco(float preco){
    this.preco = preco;
  }

  @Override
  public String toString(){
    return "Modelo: " + this.modelo + ", Marca: " + this.marca + ", Ano: " + this.ano + ", Preco: " + this.preco ;
  }
    
}

 class Principal {
    public static final int MAX_CARROS = 100;

    public static void main(String[] args) {
        automovel[] carros = new automovel[MAX_CARROS];
        Scanner scanner = new Scanner(System.in);

        int quantidadeCarros = 0;
        int somapreco = 0;
        

        System.out.print("Quantos carros deseja adicionar? ");
        int numCarros = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCarros; i++) {
            System.out.println("Digite os dados do carro " + (i + 1) + ":");

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Ano: ");
            int ano = scanner.nextInt();

            System.out.print("Preço: ");
            float preco = scanner.nextFloat();
            scanner.nextLine();

            carros[quantidadeCarros] = new automovel(modelo, marca, ano, preco);
            quantidadeCarros++;

           somapreco += preco;
        }

        for (int p = 0; p < quantidadeCarros; p++) {
            System.out.println("Carro " + (p + 1) + ":");
            System.out.println(carros[p].toString());
            System.out.println("-----------------------------");
        

        System.out.println("DIgite a marca de carros que deseja ver os modelos: ");
        String filtro = scanner.nextLine();
        
        System.out.println("Carros da marca " + filtro + ":");
        for (int i = 0; i < quantidadeCarros; i++) {
            if (carros[i].getmarca().equalsIgnoreCase(filtro)) {
                System.out.println(carros[i].toString());
                System.out.println("-----------------------------");
            }
        }

        if (quantidadeCarros > 0){
          float media = somapreco / quantidadeCarros;
          System.out.println("Media dos precos: " + media); 
        }else{
          System.out.println("Nenhum carro para calcular a media");
        }

        System.out.println("Digite a partir de qual gostaria de ver os carros: ");
        int filtro_ano = scanner.nextInt();
        int apos_o_ano = 0;
        System.out.println("Carros da marca " + filtro + ":");
        for (int l = 0; l < quantidadeCarros; l++) {
            if (carros[l].getano() >= filtro_ano) {
                apos_o_ano++;
            }
        }

        System.out.println("Quantidade de carros depois de" + filtro_ano + ":" + apos_o_ano++ );

        
        int soma_depois_do_ano = 0;
        for (int j = 0; j<quantidadeCarros;j++){
          if (carros[j].getano() >= filtro_ano){
            apos_o_ano++;
            soma_depois_do_ano += carros[j].getpreco();

          }
        }

        if (apos_o_ano>0){
          float media_pos_ano = soma_depois_do_ano/apos_o_ano;
          System.out.println("Média de preços dos carros a partir de " + filtro_ano + ": " + media_pos_ano);
        }else{
          System.out.println("Nenhum carro a partir do ano digitado");
        }
        

        scanner.close();
    }

        
  }
}

