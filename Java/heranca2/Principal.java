package heranca2;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main (String[] args){
        List<VeiculoTerrestre> veiculos = new ArrayList<>();

        CarroDePasseio cp = new CarroDePasseio(1990, "Azul", 5);
        CarroDePasseio cp2 = new CarroDePasseio(2004, "Cinza", 4);
        Caminhao c = new Caminhao(1999, "Verde", 4);
        CarroDePasseio cp3 = new CarroDePasseio(2010, "Preta", 5);
        CarroDePasseio cp4 = new CarroDePasseio(2009, "Preta", 7);
        Caminhao c2 = new Caminhao(2011, "Verde", 4);
        Caminhao c3 = new Caminhao(2000, "Azul", 4);
        Caminhao c4 = new Caminhao(2005, "Preta", 3);
    
        veiculos.add(cp);
        veiculos.add(cp2);
        veiculos.add(c);
        veiculos.add(cp3);
        veiculos.add(cp4);
        veiculos.add(c2);
        veiculos.add(c3);
        veiculos.add(c4);

        System.out.println("Lista de veiculos: ");
        for (VeiculoTerrestre veiculo : veiculos) {
            System.out.println(veiculo);
        }
        
        System.out.println("\n################### -#- ###################");
        
        System.out.println("\nVeiculos com 5 passageiros e mais antigo que 2010: ");

        for (VeiculoTerrestre veiculo : veiculos) {
            if (veiculo instanceof CarroDePasseio) {
                CarroDePasseio carro = (CarroDePasseio) veiculo;
                if (carro.gettotalDePassageiros() == 5 && carro.getano() < 2010) {
                    System.out.println(carro);
                }
            }
        }

        System.out.println("\n################### -#- ###################");

        int somacaminhoes = 0;

        for (VeiculoTerrestre veiculo : veiculos) {
            if (veiculo instanceof Caminhao) {
                Caminhao caminhao = (Caminhao) veiculo;
                if (caminhao.getcor().equals("Verde") && caminhao.gettotalDeEixos() == 4) {
                    somacaminhoes++;
                }
            }
        }
        
        System.out.println("\nTotal de caminhões verdes com quatro eixos: " + somacaminhoes);
    }
}
