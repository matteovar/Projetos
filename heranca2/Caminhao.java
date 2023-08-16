package heranca2;

public class Caminhao extends VeiculoTerrestre{

    int totalDeEixos;

    public Caminhao(int ano, String cor, int totalDeEixos){
        super(ano, cor);
        this.totalDeEixos = totalDeEixos;

    }

    public int gettotalDeEixos(){
        return totalDeEixos;
    }

    public void settotalDeEixos(int totalDeEixos){
        this.totalDeEixos = totalDeEixos;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Totalde eixos: " + totalDeEixos;
    }
}
