#include <stdio.h>
#include <string.h>

int main() {
    char texto[100];
    printf("Insira um texto: ");
    scanf(" %[^\n]", texto);
    for (int i = strlen(texto); i > 0; i--) {
        if (texto[i] == ' ') {
            for (int j = i; j < strlen(texto); ++j) {
                texto[j] = texto[j+1];
            }
        }
    }
    printf("%s", texto);
    return 0;
}