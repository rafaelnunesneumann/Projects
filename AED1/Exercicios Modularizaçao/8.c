#include <stdio.h>

/* Lista de Exercicios Modularização - Ex 8
  Autor: Rafael Nunes Neumann
  Data: 14/04/2022
    */

double calcular(int N) {
  double soma = 0;
  for (int i = 1; i <= N; i++) {
    double i2 = (double)i;
    soma += (i2*i2 + 1)/(i + 3);
  }
  return soma;
}

int main(void) {
  int num;
  printf("Digite um valor inteiro positivo: ");
  scanf("%d", &num);
  while (num < 0) {
    printf("Digite um valor inteiro positivo: ");
    scanf("%d", &num);
  }
  printf("\nResultado: %.6lf", calcular(num));
  return 0;
}