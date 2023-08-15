#include <stdio.h>
#define max(a, b) (a > b) ? a : b

int primeiro(int a, int b) {
  if (b == 1)
    return a;
  else
    return primeiro(a, b - 1) + a;
}

int impares(int n) {
  if (n == 1)
    return 1;
  else
    return (2 * n - 1) + impares(n - 1);
}

int potencia(int x, int n) {
  if (n == 0)
    return 1;
  else
    return x * potencia(x, n - 1);
}

int fatorial(int n) {
  if (n == 0)
    return 1;
  else
    return n * fatorial(n - 1);
}

int somatorio(int x, int n) {
  if (n == 0)
    return 1;
  else
    return potencia(x, n) / fatorial(n) + somatorio(x, n - 1);
}

int trocar(int vetor[], int ini, int fim) {
  int aux;
  if (ini < fim) {
    aux = vetor[ini];
    vetor[ini] = vetor[fim];
    vetor[fim] = aux;
    trocar(vetor, ini + 1, fim - 1);
  }
}

int imprimir(int vetor[], int tam) {
  if (tam == 1)
    printf("%d ", vetor[tam - 1]);
  else {
    imprimir(vetor, tam - 1);
    printf("%d ", vetor[tam - 1]);
  }
}

int maior(int vetor[], int n) {
  if (n == 1)
    return vetor[0];
  else
    return max(vetor[n - 1], maior(vetor, n - 1));
}

int achar_repetrido(int n, int k){
  if (n==0)
    return 0;
  else 
    return achar_repetrido(n/10,k)+(n%10 == k);
}

int horner(int x, int n, int c[]){
  if (n==0)
    return c[n];
  else
    return horner(x,n-1,c)*x+c[n];
}

int main(void) {

  printf("4x6 = %d\n", primeiro(4, 6));

  printf("5x6 = %d\n", primeiro(5, 6));

  printf("A soma dos 3 primeiros impares = %d\n", impares(3));

  printf("usando a potencia de em 3 em 4 : %d\n", potencia(3, 4));

  printf("Somatoria = %d\n", somatorio(2, 1));

  int vetor[7] = {1, 5, 2, 7, 6, 4, 10};
  int n = 7;
  int h = 291120267;
  int k = 2;


  imprimir(vetor, 7);
  printf("\n");
  trocar(vetor, 0, 6);
  imprimir(vetor, 7);
  printf("\n");

  printf("Maior numero é: %d\n", maior(vetor, n));

  printf("# de ocorrencias: %d vezes\n",achar_repetrido(h,k));

  int c[4] = {3,4,5,1};
  int x = 10;
  int y = 3;

printf("%d\n", horner(x,y,c));

  return 0;
}