#include <stdio.h>

/*
  Lista de Exercicios- EX 3
  Autor - Rafael Nunes Neumann
  Data: 27/03/2022
  */

int main(void) {

  //DECLARAÇÃO DE VARIAVEL
  int ano, idade;
  char niver;

  //IMPRESSÕES NA TELA E SCANNERS
  printf("Digite o ano de seu nascimento: ");
  scanf("%d", &ano);

  //CALCULO DA IDADE
  idade = 2022 - ano;

  //CONFIRMAÇÃO DE ANIVERSARIO
  printf("Você ja fez aniversário esse ano? (S) Sim, (N) Não: ");
  scanf("%s", &niver);
  while (niver != 'S' && niver != 'N') {
    printf("Digite 'S' para sim e 'N' para não: ");
    scanf("%s", &niver);
  }
  if (niver == 'N') {
    idade -= 1;
  }

  //IMPRESSÕES FINAIS NA TELA
  printf("Sua idade: %d", idade);
  if (idade >= 18) {
    printf("\nVocê ja tem idade para tirar a habilitação!");
  } else {
    printf("\nVocê não tem idade para tirar a habilitação!");
  }
  return 0;
}