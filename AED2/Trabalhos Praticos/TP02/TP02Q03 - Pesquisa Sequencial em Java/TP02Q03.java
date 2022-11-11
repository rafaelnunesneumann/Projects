
import java.io.File;
import java.util.*;

class TP02Q03 {

    public static ArrayList<String> array = new ArrayList<>();

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
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] separado = s.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            for (int i = 0; i < numEntrada; i++) {
                if (separado[0].equals(entrada[i])) {
                    array.add(separado[1]);
                }
            }
        }
        sc.close();
        for (int i = 0; i < numEntrada2; i++) {
            boolean achou = false;
            if (array.contains(entrada2[i])) {
                achou = true;
            }
            MyIO.println(achou?"SIM":"NAO");
        }
    }
}

