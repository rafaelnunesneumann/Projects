#include <stdio.h>

/*
  Lista de Repetição - Exercicio 6
  Autor: Rafael Nunes Neumann
  Data: 02/04/2022
    */

int main(void) {
  int num, base;
  double soma;
  printf("Digite um número inteiro positivo: ");
  scanf("%d", &num);
  while (num < 0) {
    printf("Digite um número inteiro positivo: ");
    scanf("%d", &num);
  }
  soma = 1;
  for (base = 2; base <= num; base++) {
    printf("\n%.2lf + 1/%d = ", soma, base);
    soma += (double) 1/base;
    printf("%.2lf", soma);
  }
  printf("\nValor total: %.2lf", soma);
  return 0;
}