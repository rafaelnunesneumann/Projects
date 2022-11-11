#include <stdio.h>

/* Lista de Exercicios Modularização - Ex 5
  Autor: Rafael Nunes Neumann
  Data: 14/04/2022
    */

void nota(double medianota) {
  if (medianota <= 39) {
    printf("Conceito: F\n");
  } else if (medianota > 39 && medianota <= 59) {
    printf("Conceito: E\n");
  } else if (medianota > 59 && medianota <= 69) {
    printf("Conceito: D\n");
  } else if (medianota > 69 && medianota <= 79) {
    printf("Conceito: C\n");
  } else if (medianota > 79 && medianota <= 89) {
    printf("Conceito: B\n");
  } else if (medianota > 89) {
    printf("Conceito: A\n");
  }
}

int main(void) {
  int alunos;
  double medianota;
  printf("Digite a quantidade de alunos: ");
  scanf("%d", &alunos);
  for (int i = 1; i <= alunos; i++) {
    printf("Digite a media das notas do %d aluno: ", i);
    scanf("%lf", &medianota);
    nota(medianota);
  }
  return 0;
}