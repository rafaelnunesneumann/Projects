#include <stdio.h>

/*
  Lista de Repetição - Exercicio 3
  Autor: Rafael Nunes Neumann
  Data: 02/04/2022
    */

int main(void) {
  int num1, conta, total1, total2;
  total1 = 0;
  total2 = 0;
  for (conta = 0; conta <= 10; conta++) {
    printf("\nDigite um número: ");
    scanf("%d", &num1);
    if (num1 % 3 == 0 && num1 % 9 == 0) {
      printf("O número %d é divisivel por 3 e por 9\n");
      total1++;
    } else if (num1 % 2 == 0 && num1 % 5 == 0) {
      printf("O número %d é divisivel por 2 e por 5\n");
      total2++;
    } else {
      printf("Número não é divisivel pelos valores\n");
    }
  }
  printf("\nTotal divisiveis por 3 e 9: %d", total1);
  printf("\nTotal divisivel por 2 e 5: %d", total2);
  return 0;
}