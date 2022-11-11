#include <stdio.h>

int contar(int num) {
  int casas = 1;
  if(num >= 10) {
    num /= 10;
    casas += contar(num);
}
  return casas;
}

int main(void) {
  int num;
  printf("Digite um número: ");
  scanf("%d", &num);
  printf("Resultado: %d",contar(num));
  return 0;
}