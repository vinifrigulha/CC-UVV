#include <stdio.h>

int main() {

  float cint, quad, rcq;

  printf("Medida da sua CINTURA (em centímetros): ");
  scanf("%f", &cint);
  printf("Medida do seu QUADRIL (em centímetros): ");
  scanf("%f", &quad);

  rcq = cint / quad * 100;

  printf("\nA sua Relação Cintura-Quadril é: %.2f%%", rcq);

  return 0;
}
