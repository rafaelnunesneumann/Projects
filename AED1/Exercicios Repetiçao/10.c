#include <stdio.h>

/*
  Lista de Repetição - Exercicio 10
  Autor: Rafael Nunes Neumann
  Data: 02/04/2022
    */

int main(void) {
  int voto, um, dois, tres, quatro, cinco, seis;
  printf("Candidatos: 1, 2, 3, 4, 5(nulo), 6 (branco), 0(para encerrar a votação)");
  printf("\nDigite o seu voto: ");
  scanf("%d", &voto);
  while (voto < 0 && voto > 6) {
    printf("Digite o seu voto: ");
    scanf("%d", &voto);
  }
  um = 0;
  dois = 0;
  tres = 0;
  quatro = 0;
  cinco = 0;
  seis = 0;
  while (voto != 0) {
    if (voto == 1) {
      um++;
    } else if (voto == 2) {
      dois++;
    } else if (voto == 3) {
      tres++;
    } else if (voto == 4) {
      quatro++;
    } else if (voto == 5) {
      cinco++;
    } else if (voto == 6) {
      seis++;
    }
    printf("Digite o seu voto: ");
    scanf("%d", &voto);
  }
  printf("\nCandidato 1: %d\nCandidato 2: %d\nCandidato 3: %d\nCandidato 4: %d\nNulos: %d\nBrancos: %d", um, dois, tres, quatro, cinco, seis);
  return 0;
}