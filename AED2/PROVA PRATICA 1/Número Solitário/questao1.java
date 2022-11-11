import java.util.ArrayList;
import java.util.Scanner;

class questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean resp = true;
        while (resp == true) {
            int tamanho = sc.nextInt();
            if (tamanho != 0) {
                ArrayList<Integer> array = new ArrayList<Integer>();
                for (int i = 0; i < tamanho; i++) {
                    array.add(sc.nextInt());
                }
                int[] num = new int[tamanho];
                for (int i = 0; i < num.length; i++) {
                    num[i] = 0;
                }
                for (int i = 0; i < array.size(); i++) {
                    for (int j = i + 1; j < array.size(); j++) {
                        if (array.get(i).equals(array.get(j))) {
                            num[i]++;
                            num[j]++;
                        }
                    }
                }
                int a = 0;
                for (int i = 0; i < num.length; i++) {
                    if (num[i] == 0 || num[i] % 2 == 0 && a == 0) {
                        System.out.println(array.get(i));
                        a = 1;
                    }
                }
            } else {
                resp = false;
            }

        }
        sc.close();
    }
}