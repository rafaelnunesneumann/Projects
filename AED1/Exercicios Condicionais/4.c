#include <stdio.h>

/*
  Lista de Exercicios- EX 4
  Autor - Rafael Nunes Neumann
  Data: 23/03/2022
  */

int main(void) {

  //DECLARAÇÃO DE VARIÁVEL
  int nota;

  //IMPRESSÃO NA TELA E SCANNER
  printf("Digite a sua nota (0-10): ");
  scanf("%d", &nota);

  //METODO PARA NAO CONSEGUIR COLOCAR NOTA ABAIXO OU ACIMA
  while(nota < 0 || nota > 10) {
    printf("Digite a sua nota (0-10): ");
    scanf("%d", &nota);
  }
  printf("Sua nota está ");

  //CONDICIONAL
  if (nota >= 8 && nota <= 10) {
    printf("Ótima! :)");
  } else if (nota >= 7 && nota < 8) {
    printf("Boa! :)");
  } else if (nota >= 5 && nota < 7) {
    printf("Regular! :|");
  } else if (nota < 5) {
    printf("Insatisfatória! :(");
  }
  return 0;
}