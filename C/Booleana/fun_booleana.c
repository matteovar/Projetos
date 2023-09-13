#include <stdbool.h>
#include <stdio.h>

int compare(int r[], int j, int s[], int k) {

  for (int i = 0; i < j && i < k; i++) {
    if (r[i] < s[i]) return 1;
    if (r[i] > s[i]) return -1; 
  }

  if (j < k) return 1;
  if (j > k) return -1;
  
  return 0;
}

int main() {
    int r[] = {1, 2, 3, 4};

    int j = 4;

    int s[] = {1, 3, 4, 5};

    int k = 4;

    int result = compare(r, j, s, k);

    if (result == 1) {
     printf("r é lexicograficamente menor que s\n");

    } else if (result == -1) {
     printf("r é lexicograficamente maior que s\n");

    } else {
      printf("r é lexicograficamente igual a s\n"); 
    }
}
