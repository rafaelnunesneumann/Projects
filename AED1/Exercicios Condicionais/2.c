#include <stdio.h>

/*
  Lista de Exercicios- EX 2
  Autor - Rafael Nunes Neumann
  Data: 23/03/2022
  */

int main(void) {

  //DECLARAÇÃO DE VARIÁVEL
  int num1,num2,soma;

  //IMPRESSÃO NA TELA E SCANNER
  printf("Digite dois números: ");
  scanf("%d %d", &num1, &num2);

  //CALCULO DA SOMA
  soma = num1 + num2;

  //CONDICIONAL SOBRE A SOMA
  if (soma >= 10) {
    soma += 5;
  } else {
    soma += 7;
  }

  //IMPRESSÃO FINAL NA TELA
  printf("Resultado: %d\n", soma);
  return 0;
}