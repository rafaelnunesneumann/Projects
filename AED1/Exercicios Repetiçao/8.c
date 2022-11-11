#include <stdio.h>

/*
  Lista de Repetição - Exercicio 8
  Autor: Rafael Nunes Neumann
  Data: 02/04/2022
    */

int main(void) {
  int N, num1, num2, soma, sequencia;
  printf("Digite um número: ");
  scanf("%d", &N);
  num1 = -1;
  num2 = 1;
  for (sequencia = 1; sequencia <= N; sequencia++) {
    soma = num1 + num2;
    num1 = num2;
    num2 = soma;
    if (soma <= N) {
      printf("\n%d",soma);
    }
  }
  return 0;
}