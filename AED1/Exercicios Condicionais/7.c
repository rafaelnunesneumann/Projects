#include <stdio.h>

/*
  Lista de Exercicios- EX 7
  Autor - Rafael Nunes Neumann
  Data: 23/03/2022
  */

int main(void) {

  //DECLARAÇÃO DE VARIAVEIS
  double x,y;

  //IMPRESSÕES E SCANNERS
  printf("Digite o valor de x: ");
  scanf("%lf", &x);

  //CONDICIONAL
  if (x > 3) {
    y = (pow(x, 3));
  } else if (x > 2 && x <= 3) {
      y = (pow(x,2));
  } else if (x > 1 && x <= 2) {
      y = 2;
  } else if (x <= 1) {
      y = 1;
  }
  printf("y = %.2lf", y);
}