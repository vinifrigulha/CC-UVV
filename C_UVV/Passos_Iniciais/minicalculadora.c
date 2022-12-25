#include <stdio.h>

int main() {

  int A, B;
  printf("Número 1: ");
  scanf("%i", &A);

  printf("Número 2: ");
  scanf("%i", &B);

  printf("\n=-=-= MINI CALCULADORA =-=-=\n");

  printf("SOMA: %i + %i = %i\n", A, B, A + B);
  printf("SUBTRAÇÃO: %i - %i = %i\n", A, B, A - B);
  printf("MULTIPLICAÇÃO: %i * %i = %i\n", A, B, A * B);
  printf("DIVISÃO: %i / %i = %.2f\n", A, B, 1.0 * A / B);
  printf("MÓDULO: %i %% %i = %i\n", A, B, A / B);
  printf("DIV: %i DIV %i = %i\n", A, B, A % B);

  return 0;
}
