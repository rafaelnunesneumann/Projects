#include <stdio.h>

/*
  Lista de Repetição - Exercicio 1
  Autor: Rafael Nunes Neumann
  Data: 02/04/2022
    */

int main(void) {
  int num, positivo, negativo, zero, i;
  printf("Digite um número: ");
  scanf("%d", &num);
  zero = 0;
  positivo = 0;
  negativo = 0;
  if (num > 0) {
    positivo++;
  } else if (num < 0) {
    negativo++;
  } else if (num == 0) {
    zero++;
  }
  i = 1;
  while (i < 10) {
    printf("Digite outro número: ");
    scanf("%d", &num);
    if (num > 0) {
      positivo++;
  } else if (num < 0) {
      negativo++;
  } else if (num == 0) {
      zero++;
  }
    i++;
  }
  printf("\nTotal de positivos: %d\nTotal de negativos: %d\nTotal de zeros: %d", positivo, negativo, zero);
  return 0;
}