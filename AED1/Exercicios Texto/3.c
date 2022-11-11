#include <stdio.h>
#include <string.h>

int main(void) {
  char texto[100], invertido[100];
  int conta = 0;
  printf("Digite uma frase: ");
  scanf(" %[^\n]", texto);
  for (int i = 0; i < strlen(texto); i++) {
    invertido[i] = texto[strlen(texto) - 1 - i];
  }
  invertido[strlen(texto)] = '\0';
  printf("Texto invertido: %s", invertido);
  for (int i = 0; i <= strlen(texto); i++) {
    if (texto[i] == invertido[i]) {
      conta++;
    }
  }
  if (conta - 1 == strlen(texto)) {
    printf("\nÉ Palíndromo!");
  } else {
    printf("\nNão é Palíndromo!");
  }
  return 0;
}