#include <stdio.h>
#include <string.h>

// Structure
struct Pessoa {
  char Nome[50];
  int Idade;
  float Altura;
};

// Menu de opções
int menu() {
  // Variável local
  int opcao;

  // Menu Inicial
  printf("\n\n=-=-=-=-= MENU INICIAL =-=-=-=-=");
  printf("\n\nEscolha uma opção:");
  printf("\n  [1] Adicionar novo cadastro");
  printf("\n  [2] Exibir lista de cadastros");
  printf("\n  [3] Buscar informações de um cadastro");
  printf("\n  [4] Calcular média das idades");
  printf("\n\n  [0] Sair do Programa");
  printf("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

  printf("\n\nDigite sua resposta aqui: ");
  scanf("%d", &opcao);

  return opcao;
};

// Função que cadastra pessoas
void cadastroCliente(struct Pessoa p[], int tamanho) {
  int count = 0;

  for (int i = 0; i < tamanho; i++) {
    if (p[i].Idade != 0) {
      continue;
    } else if (count == 0) {
      printf("\nCadastro nº %d", i + 1);
      printf("\nNome: ");
      scanf("%s", &p[i].Nome);
      printf("Idade (em anos): ");
      scanf("%d", &p[i].Idade);
      printf("Altura (em metros): ");
      scanf("%f", &p[i].Altura);
      count++;
    }
  }
}

// Função que calcula as médias
void mediaDados(struct Pessoa p[]) {
  int count = 0;
  float somaIdades = 0;
  float somaAlturas = 0;

  for (int i = 0; i < 10; i++) {
    if (p[i].Idade == 0) {
      break;
    }
    somaIdades += p[i].Idade;
    somaAlturas += p[i].Altura;
    count++;
  }

  printf("\n======= MEDIAS ========");
  printf("\nMédia das Idades: %.2f", somaIdades / count * 1.0);
  printf("\nMédia das Alturas: %.2f", somaAlturas / count * 1.0);
};

// Função que executa alguma dasa opções do Menu
int programa(struct Pessoa p[], int o) {
  switch (o) {
  // Cadastrar cliente
  case 1:
    if (sizeof(p) == 10) {
      printf("\nTamanho limite alcançado.");
    } else {
      if (p[0].Idade == 0) {
        cadastroCliente(p, 1);
      } else {
        cadastroCliente(p, sizeof(p));
      }
      printf("\nCadastro feito com sucesso!");
    }
    break;
  // Exibir clientes
  case 2:
    if (p[0].Idade == 0) {
      printf("\nNenhum cliente foi cadastrado no momento.");
    } else {
      for (int i = 0; i < 10; i++) {
        if (p[i].Idade == 0) {
          break;
        }
        printf("\nCliente %d: ", i + 1);
        printf("%s", p[i].Nome);
      }
    }

    break;
  // Buscar cliente
  case 3:
    if (p[0].Idade == 0) {
      printf("\nNenhum cliente foi cadastrado no momento.");
    } else {
      char nome[50];
      int count = 0;

      printf("\nDigite o nome do cliente: ");
      scanf("%s", &nome);

      for (int i = 0; i < 10; i++) {
        if (strcmp(nome, p[i].Nome) == 0) {
          printf("\nNome: %s", p[i].Nome);
          printf("\nIdade: %d", p[i].Idade);
          printf("\nAltura: %.2fm", p[i].Altura);
          break;
        } else {
          count++;
        }
      }

      if (count != 0) {
        printf("\nNão foi encontrado nenhum usuário com este nome.");
      }
    }

    break;
  // Calcular média da altura e idade
  case 4:
    if (p[0].Idade == 0) {
      printf("\nNenhum cliente foi cadastrado no momento.");
    } else {
      mediaDados(p);
    }
    break;
  // Sair do programa
  case 0:
    break;

  default:
    printf("\nOpção inválida. Tente novamente.");
    break;
  }

  return o;
}

int main() {
  // Variável global
  int controle;
  struct Pessoa pessoas[10];

  // Enchendo o array com idades iguais a 0
  for (int i = 0; i < 10; i++) {
    pessoas[i].Idade = 0;
  }

  while (controle != 0) {
    controle = programa(pessoas, menu());
  }

  printf("\nOk. Te vejo depois! Até mais!");
  return 0;
}
