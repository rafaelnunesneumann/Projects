import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = new String[1000];
        ArrayList<String> norte = new ArrayList<>();
        ArrayList<String> sul = new ArrayList<>();
        ArrayList<String> leste = new ArrayList<>();
        ArrayList<String> oeste = new ArrayList<>();

        int numEntrada = 0, quantNorte = 0, quantSul = 0, quantOeste = 0, quantLeste = 0, total = 0;
        HashMap<String, Integer> map = new HashMap<>();
        do {
            entrada[numEntrada] = sc.nextLine();
        } while (entrada[numEntrada++].equals("0") == false);
        numEntrada--;
        int card = Integer.valueOf(entrada[0]);
        for (int i = 1; i < numEntrada; i++) {
            if (entrada[i].contains("A")) {
                if (card == -4) {
                    map.put(entrada[i], -4);
                    leste.add(entrada[i]);
                    quantLeste++;
                }
                if (card == -3) {
                    map.put(entrada[i], -3);
                    norte.add(entrada[i]);
                    quantNorte++;
                }
                if (card == -2) {
                    map.put(entrada[i], -2);
                    sul.add(entrada[i]);
                    quantSul++;
                }
                if (card == -1) {
                    map.put(entrada[i], -1);
                    oeste.add(entrada[i]);
                    quantOeste++;
                }
            } else {
                card = Integer.valueOf(entrada[i]);
            }

        }
        total=(quantNorte + quantSul + quantOeste + quantLeste);
        int count = 1;
        while (total > 0) {
            if (count == 1) {
                if (oeste.size() > 0) {
                    System.out.print(oeste.get(0) + " ");
                    String a = oeste.get(0);
                    oeste.remove(a);
                }
                count=2;
                total--;
            }
            if (count == 2) {
                if (norte.size() > 0) {
                    System.out.print(norte.get(0) + " ");
                    String a = norte.get(0);
                    norte.remove(a);          
                }
                count=3;
                total--;
            }
            if (count == 3) {
                if (sul.size() > 0) {
                    System.out.print(sul.get(0) + " ");
                    String a = sul.get(0);
                    sul.remove(a);                
                }
                count=4;
                total--;
            }
            if (count == 4) {
                if (leste.size() > 0) {
                    System.out.print(leste.get(0) + " ");
                    String a = leste.get(0);
                    leste.remove(a);              
                  }
                count=1;
                total--;
            }
        }
        sc.close();
    }
}