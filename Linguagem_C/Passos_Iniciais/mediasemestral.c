#include <stdio.h>

int main(){
    
    float n1, n2, med;

    printf("Nota do 1º Bimestre: ");
    scanf("%f", &n1);
    printf("Nota do 2º Bimestre: ");
    scanf("%f", &n2);

    med = (n1 + n2) / 2;

    printf("Sua média semestral é: %.1f", med);

    return 0;
}
