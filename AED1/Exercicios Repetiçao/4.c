#include <stdio.h>

/*
  Lista de Repetição - Exercicio 4
  Autor: Rafael Nunes Neumann
  Data: 02/04/2022
    */

int main(void) {
  int N, base, num; 
  double fat, soma; 
  printf("Digite um valor inteiro e positivo: ");
  scanf("%d",&N);
  soma = 0;
  base = 0;
  while (N < 0) {
    printf("Digite um valor inteiro e positivo: ");
    scanf("%d",&N);
  }
  while (base <= N) {
      num = base;
      fat = 1;
      while (num > 1) {
        fat *= num;
        num--;
      }
      printf("\n%.2lf + 1/%.2lf", soma, fat);
      soma += 1/fat;
      base++;
  }
  printf("\nO valor da expressão é %.6lf", soma);
  return 0;
}