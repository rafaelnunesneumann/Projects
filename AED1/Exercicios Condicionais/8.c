#include <stdio.h>

/*
  Lista de Exercicios- EX 8
  Autor - Rafael Nunes Neumann
  Data: 27/03/2022
  */

int main(void) {

  //DECLARAÇÃO DE VARIAVEL
  double salario;
  char aumento;

  //IMPRESSÕES E SCANNERS
  printf("Digite o seu salário: R$");
  scanf("%lf", &salario);
  printf("Escolha uma opção: A, B ou C: ");
  scanf("%s", &aumento);

  //REPETIÇÃO PARA CASO NÃO ESCOLHER NENHUMA OPÇÃO
  while (aumento != 'A' && aumento != 'B' && aumento != 'C') {
    printf("Escolha uma opção: A, B ou C: ");
    scanf("%s", &aumento);
  }

  //CONDICIONAL E CALCULO DO NOVO SALÁRIO
  switch(aumento) {
    case 'A':
    salario *= 1.08;
    printf("Seu novo salário é: R$%.2lf", salario);
    break;
    case 'B':
    salario *= 1.11;
    printf("Seu novo salário é: R$%.2lf", salario);
    break;
    case 'C':
    if (salario <= 1000) {
      salario += 350;
    } else {
      salario += 200;
    }
    printf("Seu novo salário é: R$%.2lf", salario);
    break;
  }
  return 0;
}