import java.util.Scanner;

class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            int quantcaixas = sc.nextInt();
            int caixas[] = new int[quantcaixas];
            for (int j = 0; j < quantcaixas; j++) {
                caixas[j] = sc.nextInt();
            }
            int menor = caixas[0];
            for (int j = 0; j < quantcaixas; j++) {
                if (caixas[j] < menor) {
                    menor = caixas[j];
                }
            }
            int soma = 0;
            for (int j = 0; j < quantcaixas; j++) {
                if (caixas[j] != menor) {
                    soma+=caixas[j]-menor;
                }
            }
            System.out.println(soma);
        }
        sc.close();
    }
}