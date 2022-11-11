import java.util.Arrays;
import java.util.Scanner;

class questao2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant = Integer.valueOf(sc.nextLine());
        int numEntrada = 0;
        String[] entrada = new String[quant];
        String[] novo = new String[quant];
        while (numEntrada < quant) {
            entrada[numEntrada++] = sc.nextLine(); 
        }
        for (int i = 0; i < novo.length; i++) {
            novo[i] = "";
        }
        for (int i = 0; i < entrada.length; i++) {
            String[] separado = entrada[i].split(" ");
            Arrays.sort(separado);
            for (int j = 0; j < separado.length; j++) {
                if (!novo[i].contains(separado[j])) {
                    novo[i]+=separado[j] + " ";
                }
            }
        }
        for (int i = 0; i < novo.length; i++) {
            System.out.println(novo[i]);
        }
        sc.close();
    }
}