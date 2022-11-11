#include <stdio.h>

/* Lista de Exercicios Modularização - Ex 2
  Autor: Rafael Nunes Neumann
  Data: 14/04/2022
    */

void pesquisa() {
  double salario;
  int filhos;
  double mediasalario, mediafilhos;
  printf("Digite seu salário (Digite 0 para parar): R$");
  scanf("%lf", &salario);
  printf("Quantos filhos você tem: ");
  scanf("%d", &filhos);
  mediasalario = salario;
  mediafilhos = filhos;
  for (int i = 0; salario > 0; i++) {
    printf("\nDigite seu salário (Digite 0 para parar): R$");
    scanf("%lf", &salario);
    printf("Quantos filhos você tem: ");
    scanf("%d", &filhos);
    mediasalario = (mediasalario + salario)/2;
    mediafilhos = (mediafilhos + filhos)/2;
    printf("\nMedia salário: R$%.2lf\nMedia filhos: %.2lf\n", mediasalario, mediafilhos);
  }
}

int main(void) {
  pesquisa();
  return 0;
}