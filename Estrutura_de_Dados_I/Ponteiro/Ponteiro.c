#include <stdio.h>

void menorMaior(int v[], int *men, int *mai){
  *men = v[0];
  *mai = v[0];

  for (int i = 1; i < sizeof(v); i++){
    if (*men > v[i]){
      *men = v[i];
    }
    if (*mai < v[i]){
      *mai = v[i];
    }
  };
}

int main(){
  int num[5] = {12, 54, 90, 10, 87};
  int menor, maior;

  menorMaior(num, &menor, &maior);
  printf("O menor valor é: %d", menor);
  printf("\nO maior valor é: %d", maior);
  
  return 0;
}
