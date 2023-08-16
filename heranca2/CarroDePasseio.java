package heranca2;

public class CarroDePasseio extends VeiculoTerrestre{

    int totalDePassageiros;

    public CarroDePasseio(int ano, String cor, int totalDePassageiros){
        super(ano,cor);
        this.totalDePassageiros = totalDePassageiros;
    }
    
    public int gettotalDePassageiros(){
        return totalDePassageiros;
    }

    public void settotalDePassageiros(int totalDePassageiros){
        this.totalDePassageiros = totalDePassageiros;
    }

    @Override
    public String toString(){
        return super.toString() + ", Total de passageiros: " + totalDePassageiros;
    }


}