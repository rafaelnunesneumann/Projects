#include <stdio.h>

/*
  Lista de Exercicios- EX 5
  Autor - Rafael Nunes Neumann
  Data: 23/03/2022
  */

int main(void) {

  //DECLARAÇÃO DE VARIAVEL
  double diaria, promocao, cinquenta, oitenta, dif;

  //IMPRESSÕES NA TELA E SCANNERS
  printf("Digite o valor da diária: ");
  scanf("%lf", &diaria);

  //CALCULOS
  promocao = diaria - (diaria*0.25);
  cinquenta = diaria*37;
  oitenta = promocao*60;
  dif = (oitenta - cinquenta);
  
  //IMPRESSÕES NA TELA
  printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nValor da diária com promoção: R$%.2lf\nTotal arrecadado com promoção: R$%.2lf\nTotal arrecadado sem promoção: R$%.2lf\nDiferença de valores: R$%.2lf\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n", promocao, oitenta, cinquenta, dif);
  return 0;
}