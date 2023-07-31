#include <stdio.h>

int main(){
  int vetor[10];
  int count = 0;

  printf("Digite 10 números quaisquer.\n\n");
  for(int i = 0; i < 10; i++){
    printf("%dº número: ", i+1);
    scanf("%d", &vetor[i]);
    if(vetor[i] % 2 == 0) count++;
  }

  if(count == 0) printf("\nNenhum número par foi digitado.");
  else{
    int pares[count];
    int j = 0;
    
    printf("\nForam digitados %d números pares. São eles:\n[", count);
    for(int i = 0; i < 10; i++){
      if(vetor[i] % 2 == 0){
        pares[j] = vetor[i];
        j++;
      }
    }
    for(int i = 0; i < count; i++){
      if(i < count - 1) printf("%d, ", pares[i]);
      else printf("%d]", pares[i]);
    }
  }

  return 0;
}
