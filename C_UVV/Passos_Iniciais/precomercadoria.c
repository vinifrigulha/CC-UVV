#include <stdio.h>

int main() {

  float preco, reaj;
  int quant;

  float valorSD, valorCD;

  printf("Digite o preço da mercadoria: R$ ");
  scanf("%f", &preco);
  printf("Digite a quantidade de unidades da mercadoria: ");
  scanf("%i", &quant);
  printf("Digite o reajuste (em %%): ");
  scanf("%f", &reaj);

  valorSD = preco * quant;
  valorCD = preco * quant * (1 - reaj / 100);

  printf("\nValor Total (SEM DESCONTO): R$ %.2f", valorSD);
  printf("\nValor Total (COM DESCONTO): R$ %.2f", valorCD);

  return 0;
}
