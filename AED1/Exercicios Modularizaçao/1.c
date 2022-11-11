#include <stdio.h>

/* Lista de Exercicios Modularização - Ex 1
  Autor: Rafael Nunes Neumann
  Data: 14/04/2022
    */

void notas(char s, double nota1, double nota2, double nota3) {
  double total;
  if (s == 'A' || s == 'a') {
    total = (nota1 + nota2 + nota3)/3;
    printf("Resultado: %.2lf\n\n", total);
  } else if (s == 'P' || s == 'p') {
    total = (nota1*5 + nota2*3 + nota3*2)/5+3+2;
    printf("Resultado: %.2lf\n\n", total);
  }
}

int main(void) {
  double nota1,nota2,nota3;
  char s;
  while (1 > 0) {
    printf("Digite 'A' para fazer a média aritimética\nDigite 'P' para fazer a  média ponderada\n\n");
    scanf("%s", &s);
    while(s != 'a' && s != 'A' && s != 'p' && s != 'P') {
      printf("Digite 'A' para fazer a média aritimética\nDigite 'P' para fazer a  média ponderada\n\n");
      scanf("%s", &s);
    }
    printf("Digite a primeira nota: ");
    scanf("%lf", &nota1);
    printf("Digite a segunda nota: ");
    scanf("%lf", &nota2);
    printf("Digite a terceira nota: ");
    scanf("%lf", &nota3);
    notas(s, nota1, nota2, nota3);
  }
  return 0;
}