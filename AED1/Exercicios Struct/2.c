#include <stdio.h>

typedef struct Loja
{
  char nome[30];
  int preco;
  double telefone;
} Loja;

int main(void) {
  Loja loja[15];
  int N;
  int media = 0;
  printf("Qual o número de lojas? (max 15) ");
  scanf("%d", &N);
  for (int i = 0; i < N; i ++) {
    printf("\nDigite o nome da loja %d: ", i);
    scanf(" %[^\n]", loja[i].nome);
    printf("Digite o telefone da loja: ");
    scanf("%lf", &loja[i].telefone);
    printf("Digite o preço: R$");
    scanf("%d", &loja[i].preco);
  }
  for (int i = 0; i < N; i++) {
    media += loja[i].preco;
  }
  media/=N;
  printf("\nMedia dos preços: R$%d", media);
  printf("\nLojas com os preços abaixo da media:\n");
  for (int i = 0; i < N; i++) {
    if (loja[i].preco < media) {
      printf("Nome: %s - Telefone: %.0lf - Preço: R$%d\n", loja[i].nome, loja[i].telefone, loja[i].preco);
    }
  }
  return 0;
}