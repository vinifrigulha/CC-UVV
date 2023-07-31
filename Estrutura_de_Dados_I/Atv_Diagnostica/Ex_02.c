#include <stdio.h>

int main() {
    int vetor[10];

    printf("Digite 10 números quaisquer.\n\n");
    for (int i = 0; i < 10; i++) {
        printf("%dº número: ", i + 1);
        scanf("%d", &vetor[i]);
    }

    int ordem_crescente = 1;
    for (int i = 0; i < 9; i++) {
        if (vetor[i + 1] <= vetor[i]) {
            ordem_crescente = 0; // '0' em C significa False - qualquer coisa diferente de '0' é True
            break;
        }
    }

    if (ordem_crescente) {
        printf("A ordem digitada estava em ordem crescente.\n");
    } else {
        printf("A ordem digitada não estava em ordem crescente.\n");
    }

    return 0;
}
