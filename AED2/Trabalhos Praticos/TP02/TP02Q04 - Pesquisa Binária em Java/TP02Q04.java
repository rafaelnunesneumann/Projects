
import java.io.File;
import java.util.*;

class TP02Q04 {


    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static void main(String[] args) throws Exception {
        MyIO.setCharset("UTF-8");
        String[] entrada = new String[1000];
        String[] entrada2 = new String[1000];
        int numEntrada = 0;
        int numEntrada2 = 0;

        //Leitura da entrada padrao
        do {
            entrada[numEntrada] = MyIO.readLine();
        } while (isFim(entrada[numEntrada++]) == false);
        numEntrada--; //Desconsiderar a ultima linha contendo a palavra FIM
        do {
            entrada2[numEntrada2] = MyIO.readLine();
        } while (isFim(entrada2[numEntrada2++]) == false);
        numEntrada2--;

        Scanner sc = new Scanner(new File("/tmp/games.csv"));
        sc.useDelimiter(",");
        String[] array = new String[numEntrada];
        int j = 0;
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] separado = s.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            for (int i = 0; i < numEntrada; i++) {
                if (separado[0].equals(entrada[i])) {
                    array[j] = separado[1];
                    j++;
                }
            }
        }
        sc.close();
        Arrays.sort(array);
        for (int i = 0; i < numEntrada2; i++) {
            if (pesquisaBinaria(array, entrada2[i]) != -1) {
                MyIO.println("SIM");
            } else {
                MyIO.println("NAO");
            }
        }
    }

    static int pesquisaBinaria(String[] arr, String x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }
 
        return -1;
    }
}

