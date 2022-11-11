#include <stdio.h>
#include <stdbool.h>
#include <string.h>


bool isFim(char string[100]) {
  if (strlen(string) == 3 && string[0] == 'F' && string[1] == 'I' && string[2] == 'M') {
    return true;
  }
  return false;
}

bool isPalindromo(char string[]) {
  //Conta até o final da string
  for (int i = 0; i < strlen(string); i++) {
    //Verifica se as letras são iguais seguindo a ordem, caso contrario, retorna false
    if (string[i] != string[strlen(string)-1-i]) {
      return false;
    }
  }
  return true;
}

int main(void) {
  char entrada[1000][1000];
  int numEntrada = 0;

  //Leitura da entrada padrao
  do {
    scanf(" %[^\n]", entrada[numEntrada]);
  } while (isFim(entrada[numEntrada++]) == false);
  numEntrada--; //Desconsiderar ultima linha contendo a palavra FIM

  //Para cada linha de entrada, gerando uma de saida contendo o resultado se a palavra é palindroma
  for (int i = 0; i < numEntrada; i++) {
    if (isPalindromo(entrada[i]) == true) {
      printf("SIM\n");
    } else {
      printf("NAO\n");
    }
  }
  return 0;
}