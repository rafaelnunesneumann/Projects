#include <stdio.h>

/* Lista de Exercicios Modularização - Ex 4
  Autor: Rafael Nunes Neumann
  Data: 14/04/2022
    */

void triangulo(double x, double y, double z) {
  if ((x < (y + z)) && (y < (x + z)) && (z < (x + y))) {
    if (x == y && x == z) {
      printf("Triangulo Equilátero\n");
    } else if (x == y || x == z || y == z) {
      printf("Triangulo Isosceles\n");
    } else if (x != y && y != z) {
      printf("Triangulo Escaleno\n");
    }
  } else {
    printf("Não forma triângulo\n");
  }
}

int main(void) {
  double x,y,z;
  while (1 > 0) {
    printf("Digite tres valores reais: ");
    scanf("%lf %lf %lf", &x, &y, &z);
    triangulo(x, y ,z);
  }
  return 0;
}