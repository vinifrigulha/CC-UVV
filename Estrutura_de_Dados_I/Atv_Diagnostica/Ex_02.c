#include <stdio.h>

int main(){
  int vetor[10];

  printf("Digite 10 números em qualquer ordem. Ao final, direi se eles estão na ordem crescente ou não.\n\n");

  for(int i = 0; i < 10; i++){
    printf("%dº número: ", i+1);
    scanf("%d", &vetor[i]);
  }
  
  for(int i = 0; i < 9; i++){
    if(vetor[i+1] - vetor[i] <= 0){
      printf("A sua ordem não estava em ordem crescente");
      break;
    }
    else if(i+1 == 9 && vetor[i+1] - vetor[i] > 0){
      printf("A sua ordem estava em ordem crescente.");
    }
  }

  return 0;
}
