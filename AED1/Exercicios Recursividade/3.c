#include <stdio.h>

int total = 0;

int dividir(int x, int y) {
  if (y > x) {
    return total;
  } else {
    total++;
    return (dividir(x - y, y));
  }
}

int main(void) {
  int num, num2;
  printf("Digite um número: ");
  scanf("%d", &num);
  printf("Digite outro número: ");
  scanf("%d", &num2);
  printf("Resultado: %d", dividir(num, num2));
  return 0;
}