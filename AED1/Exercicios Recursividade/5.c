#include <stdio.h>

double soma = 0;

double serie(int i) {
  if (i == 1) {
    return 1;
  } else {
    return 1 / (i * serie(i - 1));
  }
}

int main(void) {
  int n;
  do {
    printf("Digite um número positivo: ");
    scanf("%d", &n);
  } while (n <= 0);
  for (int i = 1; i <= n; i++) {
  soma += serie(i);
}
  printf("%lf", soma);
  return 0;
}