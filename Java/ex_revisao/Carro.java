package ex_revisao;


class automovel {
  private String placa;
  private String marca;
  private int ano;
  private float preco;
  
  public automovel(String placa, String marca, int ano, float preco) {
    this.placa = placa;
    this.marca = marca;
    this.ano = ano;
    this.preco = preco;
  }

  public String getplaca(){
    return placa;
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

  public void setplaca(String placa){
    this.placa = placa;
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
    return "Placa: " + this.placa + ", Marca: " + this.marca + ", Ano: " + this.ano + ", Preco: " + this.preco ;
  }
    
}

