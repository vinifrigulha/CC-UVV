#include <stdio.h>

int main(){
  int vetor[10];
  int count = 0;

  printf("Digite 10 números quaisquer.\n\n");

  for(int i = 0; i < 10; i++){
    printf("%dº número: ", i+1);
    scanf("%d", &vetor[i]);
    if(vetor[i] > 50) count++;
  }

  printf("\nExistem %d números maiores que 50 nesse vetor.", count);
  
  return 0;
}
