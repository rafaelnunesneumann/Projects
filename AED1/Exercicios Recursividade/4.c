#include <stdio.h>


int resto(int num, int num2) {
  if (num2 > num) {
    return num;
  } else {
    return (resto(num - num2, num2));
  }
}

int main(void) {
  int num, num2;
  printf("Digite um número: ");
  scanf("%d", &num);
  printf("Digite outro número: ");
  scanf("%d", &num2);
  printf("Resultado: %d", resto(num, num2));
  return 0;
}