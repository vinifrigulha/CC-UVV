#include <stdio.h>

int main(){
  int vetor[10];

  printf("Digite 10 números quaisquer.\n\n");
  for(int i = 0; i < 10; i++){
    printf("%dº número: ", i+1);
    scanf("%d", &vetor[i]);
  }

  for(int i = 0; i < 10; i++){
    for(int j = 0; j < 9; j++){
      if(vetor[j] > vetor[j+1]){
        int temp = vetor[j];
        vetor[j] = vetor[j+1];
        vetor[j+1] = temp;
      } 
    }
  }

  printf("\nO vetor ordenado é dado por: \n[");
  for(int i = 0; i < 10; i++){
    if(i < 9) printf("%d, ", vetor[i]);
    else printf("%d]", vetor[i]);
  }

  return 0;
}
