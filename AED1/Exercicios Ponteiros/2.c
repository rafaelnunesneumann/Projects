#include <stdio.h>

int main(void) {
  int inteiro, inteiro2;
  double real, real2;
  char caracter, caracter2;
  int *iptr = &inteiro;
  double *iptr2 = &real;
  char *iptr3 = &caracter;
  printf("Digite um número inteiro: ");
  scanf("%d", &inteiro);
  printf("Endereço: %p\nConteudo: %d\n\n", &iptr, *iptr);
  printf("Digite um número real: ");
  scanf("%lf", &real);
  printf("Endereço: %p\nConteudo: %.2lf\n\n", &iptr2, *iptr2);
  printf("Digite um caracter: ");
  scanf("%s", &caracter);
  printf("Endereço: %p\nConteudo: %c\n\n", &iptr3, *iptr3);
  printf("Digite outro número inteiro: ");
  scanf("%d", &inteiro2);
  *iptr = inteiro2;
  printf("Endereço: %p\nConteudo: %d\n\n", &iptr, *iptr);
  printf("Digite outro número real: ");
  scanf("%lf", &real2);
  *iptr2 = real2;
  printf("Endereço: %p\nConteudo: %.2lf\n\n", &iptr2, *iptr2);
  printf("Digite outro caracter: ");
  scanf("%s", &caracter2);
  *iptr3 = caracter2;
  printf("Endereço: %p\nConteudo: %c\n\n", &iptr3, *iptr3);
  return 0;
}