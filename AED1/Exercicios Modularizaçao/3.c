#include <stdio.h>

/* Lista de Exercicios Modularização - Ex 3
  Autor: Rafael Nunes Neumann
  Data: 14/04/2022
    */

void crescente(int num1, int num2, int num3) {
  if (num1 <= num2 && num1 <= num3) {
    printf("Ordem crescente: %d, ", num1);
    if (num2 <= num3) {
      printf("%d, %d", num2, num3);
    } else {
      printf("%d, %d", num3, num2);
    }
  } else if (num2 <= num1 && num2 <= num3) {
    printf("Ordem crescente: %d, ", num2);
    if (num1 <= num3) {
      printf("%d, %d", num1, num3);
    } else {
      printf("%d, %d", num3, num1);
    }
  } else if (num3 <= num1 && num3 <= num2) {
    printf("Ordem crescente: %d, ", num3);
    if (num1 <= num2) {
      printf("%d, %d", num1, num2);
    } else {
      printf("%d, %d", num2, num1);
    }
  }
}

int main(void) {
  int vezes, num1, num2, num3;
  printf("Digite a quantidade de vezes: ");
  scanf("%d", &vezes);
  for (int i = 1; i <= vezes; i++) {
    printf("\nDigite tres numeros: ");
    scanf("%d %d %d", &num1, &num2, &num3);
    crescente(num1, num2, num3);
  }
  return 0;
}