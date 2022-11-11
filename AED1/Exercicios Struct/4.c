#include <stdio.h>

typedef struct Endereco
{
  char logradouro[30];
  int numero;
  char complemento[20];
} Endereco;

typedef struct Cliente
{
  char nome[30];
  Endereco end;
  double telefone;
} Cliente;

int main(void) {
  Cliente cliente[100];
  int N;
  printf("Digite o número de clientes: ");
  scanf("%d", &N);
  for (int i = 0; i < N; i++) {
    printf("\nDigite o nome do cliente: ");
    scanf(" %[^\n]", cliente[i].nome);
    printf("Digite o logradouro: ");
    scanf(" %[^\n]", cliente[i].end.logradouro);
    printf("Digite o número: ");
    scanf("%d", &cliente[i].end.numero);
    printf("Digite o complemento: ");
    scanf(" %[^\n]", cliente[i].end.complemento);
    printf("Digite o telefone: ");
    scanf("%lf", &cliente[i].telefone);
  }
  return 0;
}