#include <stdio.h>

#define N 9

// Função para imprimir a grade do Sudoku
void printGrid(int grid[N][N]) {
    for (int row = 0; row < N; row++) {
        for (int col = 0; col < N; col++) {
            printf("%2d ", grid[row][col]);
        }
        printf("\n");
    }
}

// Função para verificar se um número pode ser colocado em uma célula específica
int isSafe(int grid[N][N], int row, int col, int num) {
    // Verifique a linha e a coluna
    for (int x = 0; x < N; x++) {
        if (grid[row][x] == num || grid[x][col] == num) {
            return 0;
        }
    }

    // Verifique o quadrado 3x3
    int startRow = row - row % 3;
    int startCol = col - col % 3;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (grid[i + startRow][j + startCol] == num) {
                return 0;
            }
        }
    }

    return 1;
}

// Função principal de resolução do Sudoku usando backtracking
int solveSudoku(int grid[N][N]) {
    int row, col;

    // Verifique se há uma célula vazia na grade
    int isEmpty = 1;
    for (row = 0; row < N && isEmpty; row++) {
        for (col = 0; col < N; col++) {
            if (grid[row][col] == 0) {
                isEmpty = 0;
                break;
            }
        }
    }

    // Se não houver células vazias, o Sudoku está resolvido
    if (isEmpty) {
        return 1;
    }

    // Tente colocar números de 1 a 9 na célula vazia
    for (int num = 1; num <= 9; num++) {
        if (isSafe(grid, row, col, num)) {
            grid[row][col] = num;

            // Recursivamente tente preencher o resto da grade
            if (solveSudoku(grid)) {
                return 1;
            }

            // Se não levar a uma solução, volte e tente outro número
            grid[row][col] = 0;
        }
    }

    // Não há solução para esta configuração
    return 0;
}

int main() {
    int grid[N][N] = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    if (solveSudoku(grid)) {
        printf("Solução do Sudoku:\n");
        printGrid(grid);
    } else {
        printf("Não há solução para o Sudoku.\n");
    }

    return 0;
}
