#include <stdio.h>
#include <string.h>

int main(void) {
  int dia,mes,ano;
  char extenso[20];
  printf("Digite o dia de seu nascimento: ");
  scanf("%d", &dia);
  printf("Digite o mes de seu nascimento: ");
  scanf("%d", &mes);
  while (mes < 1 || mes > 12) {
    printf("Digite o mes de seu nascimento: ");
    scanf("%d", &mes);
  }
  printf("Digite o ano de seu nascimento: ");
  scanf("%d", &ano);
  while(ano < 1) {
    printf("Digite o ano de seu nascimento: ");
    scanf("%d", &ano);
  }
  switch (mes) {
    case 1:
    strcpy(extenso, "Janeiro");
    break;
    case 2:
    strcpy(extenso, "Fevereiro");
    break;
    case 3:
    strcpy(extenso, "Março");
    break;
    case 4:
    strcpy(extenso, "Abril");
    break;
    case 5:
    strcpy(extenso, "Maio");
    break;
    case 6:
    strcpy(extenso, "Junho");
    break;
    case 7:
    strcpy(extenso, "Julho");
    break;
    case 8:
    strcpy(extenso, "Agosto");
    break;
    case 9:
    strcpy(extenso, "Setembro");
    break;
    case 10:
    strcpy(extenso, "Outubro");
    break;
    case 11:
    strcpy(extenso, "Novembro");
    break;
    case 12:
    strcpy(extenso, "Dezembro");
    break;
  }
  printf("%d de %s de %d", dia, extenso, ano);
  return 0;
}