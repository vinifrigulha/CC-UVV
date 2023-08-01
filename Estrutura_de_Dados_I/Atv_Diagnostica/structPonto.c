#include <math.h>
#include <stdio.h>

/* Definindo a estrutura de um ponto */
struct Ponto {
  float x;
  float y;
};

/* Função para setar o ponto */
struct Ponto setPonto(struct Ponto p){
  printf("\nX: ");
  scanf("%f", &p.x); // Salvando a coordenada x do ponto
  printf("Y: ");
  scanf("%f", &p.y); // Salvando a coordenada y do ponto

  return p;
}

/* Função para calcular a distância entre dois pontos */
double calculaDistancia(struct Ponto a, struct Ponto b) {
  float subX = pow((a.x - b.x), 2); // (x' - x")^2
  float subY = pow((a.y - b.y), 2); // (y' - y")^2

  return sqrt(subX + subY); // (subX + subY)^(1/2)
};

int main() {
  printf("\nDigite as coordenadas do ponto A:");
  struct Ponto a = setPonto(a);

  printf("\nDigite as coordenadas do ponto B:");
  struct Ponto b = setPonto(b);

  printf("\nA distância entre A(%.2f, %.2f) e B (%.2f, %.2f) é %.2f", a.x, a.y, b.x, b.y, calculaDistancia(a, b));

  return 0;
}
