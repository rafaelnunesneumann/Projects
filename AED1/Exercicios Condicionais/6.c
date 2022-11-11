#include <stdio.h>

/*
  Lista de Exercicios- EX 6
  Autor - Rafael Nunes Neumann
  Data: 23/03/2022
  */

int main(void) {
  //DECLARAÇÃO DE VARIAVEIS
  double a,x,b;

  //IMPRESSÕES E SCANNERS
  printf("Digite o valor de 'a' para a função ax + b = 0: ");
  scanf("%lf", &a);
  printf("Digite o valor de 'b' para a função %.1lfx + b = 0: ", a);
  scanf("%lf", &b);
  
  //CALCULO
  printf("\n%.1lfx + %.1lf = 0", a, b);
  b *= -1;
  printf("\n%.1lfx = %.1lf", a, b);
  x = b/a;
  printf("\nx = %.2lf", x);
  return 0;
}