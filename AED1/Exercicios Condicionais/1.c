#include <stdio.h>


/*
  Lista de Exercicios- EX 1
  Autor - Rafael Nunes Neumann
  Data: 23/03/2022
  */

int main(void) {

  //DECLARAÇÃO DE VARIAVEL
  int num1,num2;

  //IMPRESSÕES NA TELA E SCANNER
  printf("Digite dois números: ");
  scanf("%d %d", &num1, &num2);
  printf("O maior entre esses números é: ");

  //CONDICIONAL E IMPRESSÃO FINAL NA TELA
  if (num1 >= num2) {
    printf("%d", num1);
  } else {
    printf("%d", num2);
  }
  return 0;
}