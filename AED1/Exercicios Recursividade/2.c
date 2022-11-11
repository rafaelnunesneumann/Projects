#include <stdio.h>

int somar(int num) {
  if (num == 0) {
    return 0;
  } else {
    return (num % 10 + somar(num/10));
  }
}

int main(void) {
  int num;
  printf("Digite um número: ");
  scanf("%d", &num);
  printf("Resultado: %d", somar(num));
  return 0;
}