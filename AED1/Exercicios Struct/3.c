#include <stdio.h>

typedef struct Clientes
{
  char email[100];
  int codigo;
  char pagina;
  int horas;
  double pagamento;
} Clientes;

int main(void) {
  Clientes cliente[500];
  int N;
  printf("Digite o número de clientes (max 500): ");
  scanf("%d", &N);
  for (int i = 0; i < N; i++) {
    printf("\nDigite o codigo do cliente %d: ", i);
    scanf("%d", &cliente[i].codigo);
    printf("Digite o email: ");
    scanf(" %[^\n]", cliente[i].email);
    printf("Numero de horas de acesso: ");
    scanf("%d", &cliente[i].horas);
    printf("Pagina? (S/N): ");
    scanf(" %c", &cliente[i].pagina);
  }
  printf("\n");
  for (int i = 0; i < N; i++) {
    cliente[i].pagamento = 0;
    if (cliente[i].horas > 20) {
      int temp = (cliente[i].horas - 20)*2.5;
      cliente[i].pagamento = 35 + temp;
    } else {
      cliente[i].pagamento = 35;
    }
    if (cliente[i].pagina == 'S') {
      cliente[i].pagamento += 40;
    }
    printf("Cliente: %d\n", cliente[i].codigo);
    printf("Email: %s\n", cliente[i].email);
    printf("Numero de horas de acesso: %d\n", cliente[i].horas);
    printf("Pagina?: %c\n", cliente[i].pagina);
    printf("Total a pagar: R$%.2lf\n\n", cliente[i].pagamento);
  }

  return 0;
}