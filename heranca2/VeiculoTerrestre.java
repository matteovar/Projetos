package heranca2;

public class VeiculoTerrestre{
    private int ano;
    private String cor;

    public VeiculoTerrestre(int ano, String cor){
        this.ano = ano;
        this.cor = cor;

    }

    public int getano(){
        return ano;
    }

    public void setano(int ano){
        this.ano = ano;
    }

    public String getcor(){
        return cor;
    }

    public void setcor(String cor){
        this.cor = cor;
    }
    
    @Override
    public String toString(){
        return "Ano: " + this.ano + ", Cor: " + this.cor;
    } 


}
    
