#include <stdio.h>

/* Lista de Exercicios Modularização - Ex 6
  Autor: Rafael Nunes Neumann
  Data: 14/04/2022
    */

double fat(int N) {
  int base, num; 
  double fat, soma; 
  soma = 0;
  base = 0;
  while (base <= N) {
      num = base;
      fat = 1;
      while (num > 1) {
        fat *= num;
        num--;
      }
      soma += 1/fat;
      base++;
  }
  return soma;
}

int main(void) {
  int N;
  printf("Digite um número inteiro positivo: ");
  scanf("%d", &N);
  while(N < 0) {
    printf("Digite um número inteiro positivo: ");
    scanf("%d", &N);
  }
  printf("Resultado: %.6lf", fat(N));
  return 0;
}