#include <stdio.h>

void parImpar(int v[], int size) {
  // Loop do array
  for (int i = 0; i < size; i++) {
    // Verifica se o número é igual a 2
    if (v[i] == 2) {
      printf("\n%d é primo", v[i]);
    } else {
      // Loop divisores
      for (int j = 2; j < v[i]; j++) {
        // Tenta achar divisores
        if (v[i] % j == 0) {
          printf("\n%d não é primo!", v[i]);
          break;
        } else {
          printf("\n%d é primo", v[i]);
          break;
        }
      }
    }
  }
}

int main() {
  int tamanho = 5;
  int num[] = {12, 2, 3, 5, 87};

  parImpar(num, tamanho);

  return 0;
}
