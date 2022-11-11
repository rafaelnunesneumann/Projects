#include <stdio.h>

int main(void) {
  int num1,num2;
  int *iptr = &num1;
  int *iptr2 = &num2;
  printf("Digite dois números: ");
  scanf("%d %d", &num1, &num2);
  if (*iptr >= *iptr2) {
    printf("\nMaior: %d\nMenor: %d", *iptr, *iptr2);
  } else if (*iptr2 >= *iptr) {
    printf("\nMaior: %d\nMenor: %d", *iptr2, *iptr);
  }
  return 0;
}