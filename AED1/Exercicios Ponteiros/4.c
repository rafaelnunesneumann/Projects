#include <stdio.h>

int Troca (int *A, int *B, int *C);

int main(void) {
  int x,y,z;
  printf("Digite tres números: ");
  scanf("%d %d %d", &x, &y, &z);
  Troca(&x,&y,&z);
  return 0;
}

int Troca (int *A, int *B, int *C) {
  int temp;
  if (*A == *B && *A == *C) {
    printf("%d, %d, %d", *A, *B, *C);
    return 1;
  } else if (*A >= *B && *A >= *C) {
    if (*B <= *C) {
      temp = *B;
      *B = *C;
      *C = temp;
    }
    printf("%d, %d, %d", *A, *B, *C);
  } else if (*B >= *A && B >= C) {
    temp = *B;
    *B = *A;
    *A = temp;
    if (*C >= *B) {
      temp = *B;
      *B = *C;
      *C = temp;
    }
    printf("%d, %d, %d", *A, *B, *C);
  } else if (*C >= *A && *C >= *B) {
    temp = *A;
    *A = *C;
    *C = temp;
    if (*C >= *B) {
      temp = *B;
      *B = *C;
      *C = temp;
    }
    printf("%d, %d, %d", *A, *B, *C);
  }
  return 0;
}