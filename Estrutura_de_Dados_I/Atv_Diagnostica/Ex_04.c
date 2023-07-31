#include <stdio.h>

void preencherVetor(int vetor[]){
  for(int i = 0; i < 10; i++){
    printf("%dº número: ", i+1);
    scanf("%d", &vetor[i]);
  }
}

int main(){
  int vetorA[10];
  int vetorB[10];
  int vetorC[10];

  printf("Digite 10 números quaisquer para o vetor A.\n\n");
  preencherVetor(vetorA);

  printf("\nDigite 10 números quaisquer para o vetor B.\n\n");
  preencherVetor(vetorB);

  for(int i = 0; i < 10; i++){
    vetorC[i] = vetorA[i] + vetorB[i];
  }

  printf("\nO vetor C tem os seguintes valores:\n\n [");
  for(int i = 0; i < 10; i++){
    if(i < 9){ 
      printf("%d, ", vetorC[i]);
    }
    else{ 
      printf("%d]", vetorC[i]);
    }
  }
  
  return 0;
}
