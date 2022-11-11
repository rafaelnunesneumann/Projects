#include <stdio.h>

/*
  Lista de Exercicios- EX 9
  Autor - Rafael Nunes Neumann
  Data: 27/03/2022
  */

int main(void) {

  //DECLARAÇÃO DE VARIAVEL
  char sinal;

  //IMPRESSÕES E SCANNERS
  printf("Digite <, >, =, ou outra tecla: ");
  scanf("%s", &sinal);

  //CONDICIONAL E IMPRESSÕES
  switch(sinal) {
    case '<':
    printf("SINAL DE MENOR");
    break;
    case '>':
    printf("SINAL DE MAIOR");
    break;
    case '=':
    printf("SINAL DE IGUAL");
    break;
    default:
    printf("OUTRA TECLA");
    break;
  }
  return 0;
}