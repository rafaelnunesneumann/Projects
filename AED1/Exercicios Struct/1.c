#include <stdio.h>

typedef struct Niver
{
  char nome[30];
  int dia;
  int mes;
} Niver;

int main(void) {
  Niver niver[40];
  int N;
  printf("Quantas pessoas a serem analisadas? (Max 40)\n");
  scanf("%d", &N);
  while (N > 40) {
    printf("Quantas pessoas a serem analisadas? (Max 40)\n");
    scanf("%d", &N);
  }
  for (int i = 0; i < N; i++) {
    printf("\nNome: ");
    scanf(" %[^\n]",niver[i].nome);
    printf("Dia de aniversario: ");
    scanf("%d", &niver[i].dia);
    printf("Mes de aniversario: ");
    scanf("%d", &niver[i].mes);
  }
  for (int mes = 1; mes <= 12; mes++) {
    printf("\nMes %d: ", mes);
    for (int i = 0; i < N; i++) {
      if (niver[i].mes == mes) {
        printf("%s - %d/%d, ", niver[i].nome, niver[i].dia, niver[i].mes);
      }
    }
  }
  return 0;
}