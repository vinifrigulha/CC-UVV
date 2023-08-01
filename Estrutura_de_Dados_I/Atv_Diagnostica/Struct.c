#include <stdio.h>
#include <string.h>

struct tipo_endereco {
  char rua[50];
  int numero;
  char bairro[20];
  char cidade[30];
  char sigla_estado[3];
  long int CEP;
};

struct ficha_pessoal {
  char nome[50];
  long int telefone;
  struct tipo_endereco endereco;
};

int main(){
  struct ficha_pessoal ficha;

  strcpy(ficha.nome, "Luiz Osvaldo Silva");
  ficha.telefone = 4921234;
  strcpy(ficha.endereco.rua, "Rua das Flores");
  ficha.endereco.numero = 10;
  strcpy(ficha.endereco.bairro, "Cidade Velha");
  strcpy(ficha.endereco.cidade, "Belo Horizonte");
  strcpy(ficha.endereco.sigla_estado, "MG");
  ficha.endereco.CEP = 31340230;
  
  return 0;
}
