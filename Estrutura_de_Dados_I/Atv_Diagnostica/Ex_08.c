#include <stdio.h>

int main(){
  int vetor[10];

  printf("Digite 10 números quaiquer.\n\n");
  for(int i = 0; i < 10; i++){
    printf("%dº número: ", i+1);
    scanf("%d", &vetor[i]);
    if(vetor[i] < 0) vetor[i] = 0;
  }

  printf("\nO vetor final é: \n[");
  for(int i = 0; i < 10; i++){
    if(i < 9) printf("%d, ", vetor[i]);
    else printf("%d]", vetor[i]);
  }

  return 0;
}
