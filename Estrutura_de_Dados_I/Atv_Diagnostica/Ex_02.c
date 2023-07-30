#include <stdio.h>

int main(){
  int vetor[10];

  printf("Digite 10 números quaisquer.\n\n");

  for(int i = 0; i < 10; i++){
    printf("%dº número: ", i+1);
    scanf("%d", &vetor[i]);
  }
  
  for(int i = 0; i < 9; i++){
    if(vetor[i+1] - vetor[i] <= 0){
      printf("A ordem digitada não estava em ordem crescente");
      break;
    }
    else if(i+1 == 9 && vetor[i+1] - vetor[i] > 0){
      printf("A ordem digitada estava em ordem crescente.");
    }
  }

  return 0;
}
