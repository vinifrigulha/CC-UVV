#include <stdio.h>

// Questão 01
struct Pessoa {
  char Nome[50];
  int Idade;
  float Altura;
};

// Questão 02
void listaPessoas(struct Pessoa Pessoas[], int tamanho) {
  for (int i = 0; i < tamanho; i++) {
    printf("\nPessoa %d:", i + 1);
    printf("\nNome: ");
    scanf("%s", &Pessoas[i].Nome);
    printf("Idade (em anos): ");
    scanf("%d", &Pessoas[i].Idade);
    printf("Altura (em metros): ");
    scanf("%f", &Pessoas[i].Altura);
  }

  printf("\n======= PESSOAS ========");
  for (int p = 0; p < tamanho; p++) {
    printf("\nPessoa %d", p + 1);
    printf("\nNome: %s", Pessoas[p].Nome);
    printf("\nIdade: %d anos", Pessoas[p].Idade);
    printf("\nAltura: %.2fm", Pessoas[p].Altura);
  }
};

// Questão 03
void mediaDados(struct Pessoa Pessoas[], int tamanho) {
  float somaIdades;
  float somaAlturas;

  for (int i = 0; i < tamanho; i++) {
    somaIdades += Pessoas[i].Idade;
    somaAlturas += Pessoas[i].Altura;
  }
  
  printf("\n\n======= MEDIAS ========");
  printf("\nMédia das Idades: %.2f", somaIdades / tamanho);
  printf("\nMédia das Alturas: %.2f", somaAlturas / tamanho);
};

int main() {
  int size;

  printf("Me de o numero de pessoas: ");
  scanf("%d", &size);

  struct Pessoa Pessoas[size];
  listaPessoas(Pessoas, size);

  mediaDados(Pessoas, size);
}
