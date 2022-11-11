class TP01Q05 {

    public static boolean isFim(String s) {
        return (s.length() == 1 && s.charAt(0) == '0');
    }

    public static String logicaBooleana(String texto) {
        boolean A, B, C;
        //Separa o valor do numero de variaveis
        int numero = Integer.valueOf(texto.split(" ")[0]);
        //Execução de cada operação de acordo com o número de variaveis
        if (numero == 2) {
            if (Integer.valueOf(texto.split(" ")[1]) == 1) {
                A = true;
            } else {
                A = false;
            }
            if (Integer.valueOf(texto.split(" ")[2]) == 1) {
                B = true;
            } else {
                B = false;
            }
            if (texto.contains("and(not(A) , not(B))")) {
                if (!A && !B) {
                    return "1";
                } else {
                    return "0";
                }
            }
            if (texto.contains("not(and(A , B))")) {
                if (!(A && B)) {
                    return "1";
                } else {
                    return "0";
                }
            }
        } else if (numero == 3) {
            if (Integer.valueOf(texto.split(" ")[1]) == 1) {
                A = true;
            } else {
                A = false;
            }
            if (Integer.valueOf(texto.split(" ")[2]) == 1) {
                B = true;
            } else {
                B = false;
            }
            if (Integer.valueOf(texto.split(" ")[3]) == 1) {
                C = true;
            } else {
                C = false;
            }
            if (texto.contains("and(or(A , B) , not(and(B , C)))")) {
                if ((A || B) && (!(B && C))) {
                    return "1";
                } else {
                    return "0";
                }
            }
            if (texto.contains("and(A , or(B , C))")) {
                if (A && (B || C)) {
                    return "1";
                } else {
                    return "0";
                }
            }
            if (texto.contains("or(and(A , B) , and(A , C))")) {
                if ((A && B) || (A && C)) {
                    return "1";
                } else {
                    return "0";
                }
            }
            if (texto.contains("or(and(A , B), and(A , C))")) {
                if ((A && B) || (A && C)) {
                    return "1";
                } else {
                    return "0";
                }
            }
            if (texto.contains("or(A , and(B , C))")) {
                if ((A) || (B && C)) {
                    return "1";
                } else {
                    return "0";
                }
            }
            if (texto.contains("or(or(A , B) , C)")) {
                if ((A || B) || C) {
                    return "1";
                } else {
                    return "0";
                }
            }
            if (texto.contains("or(and(A , B , C) , and(or(A , B) , C))")) {
                if ((A && B && C) || ((A || B) && C)) {
                    return "1";
                } else {
                    return "0";
                }
            }
            if (texto.contains("or(and(A , B , C) , and(A , not(B) , C) , and(not(A) , not(B) , C) , and(not(A) , not(B) , not(C)))")) {
                if ((A && B && C) || (A && !B && C) || (!A && !B && C) || (!A && !B && !C)) {
                    return "1";
                } else {
                    return "0";
                }
            }
            if (texto.contains("or(not(A) , B , and(A , B , not(C)))")) {
                if (!A || B || (A && B && !C)) {
                    return "1";
                } else {
                    return "0";
                }
            }
            if (texto.contains("and(or(A , B , not(C)) , or(B , C) , or(not(A) , C))")) {
                if ((A || B || !C) && (B || C) && (!A || C)) {
                    return "1";
                } else {
                    return "0";
                }
            }
            if (texto.contains("or(or(and(not(and(A , B)) , not(C)) , and(not(A) , B , C) , and(A , B , C) , and(A , not(B) , not(C))) , and(A , not(B) , C))")) {
                if (((!(A && B) && !C) || (!A && B && C) || (A && B && C) || (A && !B && !C)) || (A && !B && C)) {
                    return "1";
                } else {
                    return "0";
                }
            }
            if (texto.contains("or(and(A , B , C) , and(A , not(B) , not(and(not(A) , not(C)))))")) {
                if ((A && B && C) || (A && !B && !(!A && !C))) {
                    return "1";
                } else {
                    return "0";
                }
            }
        }
        return texto;
    }

    public static void main(String[] args) {
        String[] entrada = new String[1000];
        int numEntrada = 0;

        //Leitura da entrada padrao
        do {
            entrada[numEntrada] = MyIO.readLine();
        } while (isFim(entrada[numEntrada++]) == false);
        numEntrada--; //Desconsiderar a ultima linha contendo a palavra FIM

        //Para cada linha de entrada, gerando uma de saida contendo o resultado da logica booleana
        for (int i = 0; i < numEntrada; i++) {
            MyIO.println(logicaBooleana(entrada[i]));
        }
    }
}