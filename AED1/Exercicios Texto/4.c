#include <stdio.h>
#include <string.h>

int main(void) {
  char numero[9];
  printf("Digite seu número de telefone: ");
  scanf(" %[^\n]", numero);
    for (int i = 0; i <= strlen(numero); i++) {
      if (numero[i] == '-') {
        for (int i2 = i; i2 <= strlen(numero); i2++) {
          numero[i2] = numero[i2 + 1];
        }
      }
    }
  printf("Numero sem formatação: %s", numero);
  if (strlen(numero) < 9) {
    for (int i = strlen(numero); i > 0; i--) {
      numero[i] = numero[i + 1];
    }
    numero[0] = '9';
  }
  printf("\nNumero com 9: %s", numero);
  for (int i = strlen(numero); i > 5; i--) {
    numero[i] = numero[i+1];
  }
  numero[5] = '-';
  printf("\nSeu numero: %s", numero);
  return 0;
}