#include <stdio.h>

void Troca (int *A, int *B);

int main(void) {
  int x,y;
  printf("Digite dois números: ");
  scanf("%d %d", &x, &y);
  Troca(&x,&y);
  printf("%d, %d",x,y);
  return 0;
}

void Troca (int *A, int *B)
{
  int temp;
  if (*A < *B) {
    temp = *A;
    *A = *B;
    *B = temp;
  }
}