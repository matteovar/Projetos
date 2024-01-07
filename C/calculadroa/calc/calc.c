#include <stdio.h>
#include <stdlib.h>

int main() {
    int valor1, valor2, escolha, quantidadeOperacoes;
    int historico[100];  // Pode ajustar o tamanho do histórico conforme necessário
    int contadorHistorico = 0;

    printf("Digite a quantidade de operacoes desejadas: ");
    scanf("%d", &quantidadeOperacoes);

    for (int i = 0; i < quantidadeOperacoes; i++) {
        printf("\n-------------Bem vindo a calculadora-------------\n");
        printf("Qual operacao deseja fazer?\n");
        printf("1 - Somar\n");
        printf("2 - Subtrair\n");
        printf("3 - Dividir\n");
        printf("4 - Multiplicar\n");
        printf("5 - Sair\n");
        printf("Escolha: ");
        scanf("%d", &escolha);

        if (escolha == 5) {
            printf("Saindo da calculadora.\n");
            break;
        }

        printf("Digite os valores desejados: ");
        scanf("%d %d", &valor1, &valor2);

        switch (escolha) {
            case 1:
                historico[contadorHistorico++] = valor1 + valor2;
                printf("A soma de %d + %d = %d\n", valor1, valor2, historico[contadorHistorico - 1]);
                break;
            case 2:
                historico[contadorHistorico++] = valor1 - valor2;
                printf("A subtracao de %d - %d = %d\n", valor1, valor2, historico[contadorHistorico - 1]);
                break;
            case 3:
                if (valor2 != 0) {
                    historico[contadorHistorico++] = valor1 / valor2;
                    printf("A divisao de %d / %d = %d\n", valor1, valor2, historico[contadorHistorico - 1]);
                } else {
                    printf("Erro: Divisao por zero.\n");
                }
                break;
            case 4:
                historico[contadorHistorico++] = valor1 * valor2;
                printf("A multiplicacao de %d * %d = %d\n", valor1, valor2, historico[contadorHistorico - 1]);
                break;
            default:
                printf("Você digitou uma operacao invalida.\n");
                break;
        }
    }

    printf("\nHistorico das operacoes realizadas:\n");
    for (int i = 0; i < contadorHistorico; i++) {
        printf("%d ", historico[i]);
    }

    return 0;
}
