#include <stdio.h>

/*
  Lista de Repetição - Exercicio 5
  Autor: Rafael Nunes Neumann
  Data: 02/04/2022
    */

int main(void) {
  int filhos, cem, totalfilhos, mediafilhos, pessoas;
  double salario, maior, total, media, porcentagem;
  mediafilhos = 0;
  totalfilhos = 0;
  total = 0;
  maior = 0;
  cem = 0;
  filhos = 0;
  for (pessoas = 1; pessoas >= 1; pessoas++) {
    printf("Digite seu salário: R$");
    scanf("%lf", &salario);
    printf("Quantos filhos você tem: ");
    scanf("%d", &filhos);

    total += salario;
    media = total/pessoas;

    totalfilhos += filhos;
    mediafilhos = totalfilhos/pessoas;

    if (salario > maior) {
      maior = salario;
    }
    if (salario <= 100) {
      cem++;
    }
    porcentagem = (double) cem/pessoas * 100;
    printf("\nMédia de salário da população: R$%.2lf", media);
    printf("\nMédia do número de filhos: %d", mediafilhos);
    printf("\nMaior salário: R$%.2lf", maior);
    printf("\nPercentual das pessoas com salário até R$100: %.2lf%%\n\n", porcentagem);
  }
  return 0;
}