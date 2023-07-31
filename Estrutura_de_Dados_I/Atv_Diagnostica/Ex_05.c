#include <stdio.h>

int main(){
  int vetor[10];
  int menor;
  int maior;

  printf("Digite 10 números quaisquer para o seu vetor.\n\n");
  for(int i = 0; i < 10; i++){
    printf("%dº número: ", i+1);
    scanf("%d", &vetor[i]);
  }

  menor = maior = vetor[0];
  for(int i = 0; i < 10; i++){
    if(menor > vetor[i]) menor = vetor[i];
    if(maior < vetor[i]) maior = vetor[i];
  }

  printf("\nMenor valor do vetor: %d", menor);
  printf("\nMaior valor do vetor: %d", maior);

  return 0;
}
