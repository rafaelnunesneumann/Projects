#include <stdio.h>

/*
  Lista de Repetição - Exercicio 9
  Autor: Rafael Nunes Neumann
  Data: 02/04/2022
    */

int main(void) {
  int menor, meio, maior;
  double compra,venda, somacompra, somavenda, lucro, porcentagem, lucrototal;
  printf("Digite o preço de compra: R$");
  scanf("%lf", &compra);
  printf("Digite o preço de venda: R$");
  scanf("%lf", &venda);

  menor = 0;
  meio = 0;
  maior = 0;
  somacompra = 0;
  somavenda = 0;
  lucro = 0;
  while (compra > 0) {
    somacompra += compra;
    somavenda += venda;
    lucro = venda - compra;
    porcentagem = (lucro/compra)*100;
    lucrototal = somacompra - somavenda;
    if (porcentagem < 10) {
      menor++;
    } else if (porcentagem >= 10 && porcentagem <= 20) {
      meio++;
    } else if (porcentagem > 20) {
      maior++;
    }
    printf("Digite o preço de compra: R$");
    scanf("%lf", &compra);
    printf("Digite o preço de venda: R$");
    scanf("%lf", &venda);
  }
  printf("\nLucro menor que 10%%: %d\nLucro entre 10%% e 20%%: %d\nLucro maior que 20%%: %d\nValor total de compra: R$%.2lf\nValor total de venda: R$%.2lf\nLucro total: R$%.2lf", menor, meio, maior, somacompra, somavenda, lucrototal);
  return 0;
}