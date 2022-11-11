#include <stdio.h>

/*
  Lista de Exercicios- EX 10
  Autor - Rafael Nunes Neumann
  Data: 27/03/2022
  */

int main(void) {

  //DECLARAÇÃO DE VARIÁVEL
  int velocidade, maximo;

  //IMPRESSÕES E SCANNERS
  printf("Digite a velocidade máxima permitida: ");
  scanf("%d", &maximo);
  printf("Digite a velocidade do motorista: ");
  scanf("%d", &velocidade);

  //CALCULO E CONDIÇÃO
  if (velocidade <= maximo) {
    printf("Motorista respeitou a lei!");
  } else if ((velocidade - maximo) <= 10) {
    printf("O motorista estava %d km/h acima do limite permitido\nPor isso, sua multa será de R$50", velocidade - maximo);
  } else if ((velocidade - maximo) > 10 && (velocidade - maximo) <= 30) {
        printf("O motorista estava %d km/h acima do limite permitido\nPor isso, sua multa será de R$100", velocidade - maximo);
  } else if ((velocidade - maximo) > 30) {
            printf("O motorista estava %d km/h acima do limite permitido\nPor isso, sua multa será de R$200", velocidade - maximo);
  }
  return 0;
}