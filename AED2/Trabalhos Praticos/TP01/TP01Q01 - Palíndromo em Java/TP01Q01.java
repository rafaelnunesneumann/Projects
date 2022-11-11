class TP01Q01 {

    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static boolean isPalindromo(String texto) {
        //Conta até o final da string
        for (int i = 0; i < texto.length(); i++) {
            //Verifica se as letras são iguais seguindo a ordem, caso contrario, retorna false
            if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] entrada = new String[1000];
        int numEntrada = 0;

        //Leitura da entrada padrao
        do {
            entrada[numEntrada] = MyIO.readLine();
        } while (isFim(entrada[numEntrada++]) == false);
        numEntrada--; //Desconsiderar a ultima linha contendo a palavra FIM

        //Para cada linha de entrada, gerando uma de saida contendo o resultado se a palavra é palindroma
        for (int i = 0; i < numEntrada; i++) {
            MyIO.println(isPalindromo(entrada[i])?"SIM":"NAO");
        }
    }
}