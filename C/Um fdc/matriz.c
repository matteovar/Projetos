#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main() {
    int row1, col1, row2, col2;

    printf("Digite o número de linhas da matriz 1: ");
    scanf("%d", &row1);

    printf("Digite o número de colunas da matriz 1: ");
    scanf("%d", &col1);

    printf("Digite o número de linhas da matriz 2: ");
    scanf("%d", &row2);

    printf("Digite o número de colunas da matriz 2: ");
    scanf("%d", &col2);

    if (col1 != row2) {
        printf("Multiplicação de matrizes não é possível. O número de colunas da matriz 1 deve ser igual ao número de linhas da matriz 2.\n");
        return 1;
    }

    int matriz[row1][col1];
    int matriz2[col1][col2];
    int matriz3[row1][col2];

    srand(time(NULL));

    // Preencha as matrizes com números aleatórios
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col1; j++) {
            matriz[i][j] = 1 + rand() % 20;
        }
    }

    for (int i = 0; i < col1; i++) {
        for (int j = 0; j < col2; j++) {
            matriz2[i][j] = 1 + rand() % 20;
        }
    }

    // Inicialize a matriz3 com zeros
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col2; j++) {
            matriz3[i][j] = 0;
        }
    }

    // Realize a multiplicação de matrizes
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col2; j++) {
            for (int k = 0; k < col1; k++) {
                matriz3[i][j] += matriz[i][k] * matriz2[k][j];
            }
        }
    }

    printf("Matriz 1:\n");
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col1; j++) {
            printf("%d ", matriz[i][j]);
        }
        printf("\n");
    }

    printf("Matriz 2:\n");
    for (int i = 0; i < col1; i++) {
        for (int j = 0; j < col2; j++) {
            printf("%d ", matriz2[i][j]);
        }
        printf("\n");
    }

    printf("Produto das matrizes 1 e 2:\n");
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col2; j++) {
            printf("%d ", matriz3[i][j]);
        }
        printf("\n");
    }

    return 0;
}
