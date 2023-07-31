#include <stdio.h>

int main(){
  int vetor[10];
  int soma = 0;
  double media;

  printf("Digite 10 números e obtenha a soma deles.\n\n");
  for(int i = 0; i < 10; i++){
    printf("%dº número: ", i+1);
    scanf("%d", &vetor[i]);
    soma += vetor[i];
  }

  media = soma / 10.0;
  
  printf("\nA média aritmética dos valores fornecidos é igual a %.2f", media);

  return 0;
}
