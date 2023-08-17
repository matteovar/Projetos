import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Avaliacao[] avaliacoes = new Avaliacao[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome da avaliação " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o tipo de avaliação:");
            String tipo = scanner.nextLine();

            System.out.println("Digite a nota da avaliação:");
            float nota = Float.parseFloat(scanner.nextLine());

            avaliacoes[i] = new Avaliacao(nome, tipo, nota);
        }

        scanner.close();

        System.out.println("Dados das avaliações:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Avaliação " + (i + 1) + ": " + avaliacoes[i].toString());
        }

    }
}
