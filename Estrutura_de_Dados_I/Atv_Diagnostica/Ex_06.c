#include <stdio.h>

int main(){
  int vetor[10];

  printf("Digite 10 números e obtenha a soma deles.\n\n");
  for(int i = 0; i < 10; i++){
    printf("%dº valor: ", i+1);
    scanf("%d", &vetor[i]);
  }

  for(int i = 0; i < 5; i++){
    int var1 = vetor[i];
    int var2 = vetor[9-i];
    vetor[i] = var2;
    vetor[9-i] = var1;
  }

  printf("Vetor com ordem invertida:\n\n[");
  for(int i = 0; i < 10; i++){
    if(i < 9) printf("%d, ", vetor[i]);
    else printf("%d]", vetor[i]);
  }

  return 0;
}
