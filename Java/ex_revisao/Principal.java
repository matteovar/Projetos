package ex_revisao;

import java.util.Scanner;

class Principal {
    public static final int MAX_CARROS = 100;

    public static void main(String[] args) {
        automovel[] carros = new automovel[MAX_CARROS];
        Scanner scanner = new Scanner(System.in);

        int quantidadeCarros = 0;
        float somapreco = 0;

        System.out.print("Quantos carros deseja adicionar? ");
        int numCarros = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCarros; i++) {
            System.out.println("Digite os dados do carro " + (i + 1) + ":");

            System.out.print("Placa: ");
            String placa = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Ano: ");
            int ano = scanner.nextInt();

            System.out.print("Preço: ");
            float preco = scanner.nextFloat();
            scanner.nextLine();

            System.out.println();

            carros[quantidadeCarros] = new automovel(placa, marca, ano, preco);
            quantidadeCarros++;

            somapreco += preco;
        }

        System.out.println("Dado dos Carros");
        for (int i = 0; i < quantidadeCarros; i++) {
            System.out.println(carros[i].toString());
        }

        System.out.print("\nDigite a marca de carros que deseja ver os modelos: ");
        String filtro = scanner.nextLine();

        System.out.println("\nCarros da marca " + filtro + ":");
        boolean encontrouCarro = false;
        for (int p = 0; p < quantidadeCarros; p++) {
            if (carros[p].getmarca().equalsIgnoreCase(filtro)) {
                System.out.println(carros[p].toString());
                encontrouCarro = true;
            }
        }
        if (!encontrouCarro) {
            System.out.println("Nenhum carro dessa marca encontrado.");
        }

        if (quantidadeCarros > 0) {
            float media = somapreco / quantidadeCarros;
            System.out.println("\nMedia dos precos: " + media);
        } else {
            System.out.println("\nNenhum carro para calcular a media");
        }

        System.out.print("\nDigite a partir de qual ano gostaria de ver os carros: ");
        int filtro_ano = scanner.nextInt();
        int apos_o_ano = 0;
        for (int l = 0; l < quantidadeCarros; l++) {
            if (carros[l].getano() >= filtro_ano) {
                apos_o_ano++;
            }
        }

        System.out.println("\nQuantidade de carros depois de " + filtro_ano + ": " + apos_o_ano + "\n");

        int soma_depois_do_ano = 0;
        for (int j = 0; j < quantidadeCarros; j++) {
            if (carros[j].getano() >= filtro_ano) {
                soma_depois_do_ano += carros[j].getpreco();
            }
        }

        if (apos_o_ano > 0) {
            float media_pos_ano = soma_depois_do_ano / apos_o_ano;
            System.out.println("Média de preços dos carros a partir de " + filtro_ano + ": " + media_pos_ano);
        } else {
            System.out.println("Nenhum carro a partir do ano especificado para calcular a média.");
        }

        System.out.print("\nDigite o ano inicial do intervalo: ");
        int anoInicial = scanner.nextInt();

        System.out.print("Digite o ano final do intervalo: ");
        int anoFinal = scanner.nextInt();

        int quantidade_dentro_do_intervalo = 0;
        int soma_dentro_do_intervalo = 0;

        for (int k = 0; k < quantidadeCarros; k++) {
            int anoCarro = carros[k].getano();
            if (anoCarro >= anoInicial && anoCarro <= anoFinal) {
                quantidade_dentro_do_intervalo++;
                soma_dentro_do_intervalo += carros[k].getpreco();
            }
        }

        if (quantidade_dentro_do_intervalo > 0) {
            float media_intervalo = (float) soma_dentro_do_intervalo / quantidade_dentro_do_intervalo;
            System.out.println("Média de preços dos carros do ano " + anoInicial + " ao ano " + anoFinal + ": " + media_intervalo);
        } else {
            System.out.println("Nenhum carro dentro do intervalo de anos especificado para calcular a média.");
        }

        scanner.close();
    }
}