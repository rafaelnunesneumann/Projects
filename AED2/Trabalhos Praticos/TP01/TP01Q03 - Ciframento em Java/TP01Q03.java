class TP01Q03 {

    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static String converterCifra(String texto) {
        String novo = "";
        //Conta até o final da String
        for (int i = 0; i < texto.length(); i++) {
            //Pega o numero do char na tabela ASCII e adiciona 3
            int cifra = ((int)texto.charAt(i) + 3);
            //Adiciona a letra na nova string
            novo+=(char)cifra;
        }
        return novo;
    }

    public static void main(String[] args) {
        String[] entrada = new String[1000];
        int numEntrada = 0;

        //Leitura da entrada padrao
        do {
            entrada[numEntrada] = MyIO.readLine();
        } while (isFim(entrada[numEntrada++]) == false);
        numEntrada--; //Desconsiderar a ultima linha contendo a palavra FIM

        //Para cada linha de entrada, gerando uma de saida contendo a conversão do texto para a cifra de cesar
        for (int i = 0; i < numEntrada; i++) {
            MyIO.println(converterCifra(entrada[i]));
        }
    }
}