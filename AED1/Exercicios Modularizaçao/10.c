#include <stdio.h>

/* Lista de Exercicios Modularização - Ex 10
  Autor: Rafael Nunes Neumann
  Data: 14/04/2022
    */

char categoria(int idade) {
  if (idade >= 5 && idade <= 7) {
    return 'F';
  } else if (idade >= 8 && idade <= 10) {
    return 'E';
  } else if (idade >= 11 && idade <= 13) {
    return 'D';
  } else if (idade >= 14 && idade <= 15) {
    return 'C';
  } else if (idade >= 16 && idade <= 17) {
    return 'B';
  } else if (idade >= 18) {
    return 'A';
  }
  return 'F';
}

int main(void) {
  int idade;
  printf("Digite a idade do nadador: ");
  scanf("%d", &idade);
  printf("Categoria: %c", categoria(idade));
  return 0;
}