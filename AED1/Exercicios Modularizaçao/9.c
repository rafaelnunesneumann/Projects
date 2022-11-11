#include <stdio.h>

/* Lista de Exercicios Modularização - Ex 9
  Autor: Rafael Nunes Neumann
  Data: 14/04/2022
    */

double calcular(int alunos) {
  double nota;
  double soma = 0;
  int aprovados = 0;
  printf("Digite a nota do 1 aluno: ");
  scanf("%lf", &nota);
  for (int i = 2; i <= alunos; i++) {
    if (nota >= 6) {
      soma += nota;
      aprovados++;
    }
    printf("Digite a nota do %d aluno: ", i);
    scanf("%lf", &nota);
  }
  return soma/aprovados;
}

int main(void) {
  int alunos;
  printf("Digite o número de alunos: ");
  scanf("%d", &alunos);
  printf("\nResultado da média dos aprovados: %.2lf", calcular(alunos));
  return 0;
}