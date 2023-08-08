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
    printf("\nAltura: %.2fm\n", Pessoas[p].Altura);
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

  printf("\n======= MEDIAS ========");
  printf("\nMédia das Idades: %.2f", somaIdades / tamanho);
  printf("\nMédia das Alturas: %.2f", somaAlturas / tamanho);
};

void funcaoPessoa() {
  int size;

  printf("Diga o numero de pessoas: ");
  scanf("%d", &size);

  struct Pessoa Pessoas[size];

  listaPessoas(Pessoas, size);
  mediaDados(Pessoas, size);
}

// Questão 05
struct endereco {
  char rua[50];
  int numero;
  char cidade[50];
  char cep[8];
};

struct cliente {
  char nome[50];
  int idade;
  struct endereco endereco;
};

struct cliente lerCliente(struct cliente cliente) {
  printf("Nome: ");
  scanf("%s", &cliente.nome);
  printf("Idade: ");
  scanf("%d", &cliente.idade);
  printf("Endereço:\n  Rua: ");
  scanf("%s", &cliente.endereco.rua);
  printf("  Numero: ");
  scanf("%d", &cliente.endereco.numero);
  printf("  Cidade: ");
  scanf("%s", &cliente.endereco.cidade);
  printf("  CEP: ");
  scanf("%s", &cliente.endereco.cep);

  return cliente;
};

void funcaoCliente() {
  struct cliente cl = lerCliente(cl);
  printf("\n\nDados do Cliente: \n%s", cl.nome);
  printf("\n%d anos", cl.idade);
  printf("\n%s, %d \n%s - %s", cl.endereco.rua, cl.endereco.numero,
         cl.endereco.cidade, cl.endereco.cep);
}

int main() {
  //funcaoPessoa();
  //funcaoCadastro();
  //funcaoCliente();
}
