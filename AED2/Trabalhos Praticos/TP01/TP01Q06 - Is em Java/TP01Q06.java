

class TP01Q06 {

   public static boolean isFim(String s){
      return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
   }

   public static boolean isVogal(char texto) {
      //Verifica se são letras
      if('a' <= texto && texto <= 'z' || 'A' <= texto && texto <= 'Z'){
         //Verifica se são vogais
         if ((texto == 'a') || (texto == 'A') || (texto == 'e') || (texto == 'E') || (texto == 'i') || (texto == 'I') || (texto == 'o') || (texto == 'O') || (texto == 'u') || (texto == 'U')) {
            return true;
         }
      }
      return false;
   }

   public static boolean isInteiro(char texto) {
      //Verifica se são numeros inteiros, se sim retorna true
      if ('0' <= texto && texto <= '9') {
         return true;
      }
      return false;
   }

   public static boolean isReal(char texto) {
      //Verifica se são numeros reais, se sim retorna true
      if (('0' <= texto && texto <= '9') || texto == ',' || texto == '.') {
         return true;
      }
      return false;
   }

   public static boolean hasVogal(String texto) {
      //Repete até o tamanho do texto
      for (int i = 0; i < texto.length(); i++) {
         //Verifica se cada letra é vogal, se não for, retorna false
         if (isVogal(texto.charAt(i)) == false) {
            return false;
         }
      }
      return true;
   }

   public static boolean hasConsoante(String texto) {
      //Repete até o tamanho do texto
      for (int i = 0; i < texto.length(); i++) {
         //Verifica se cada letra é vogal, se for, retorna false
         if (isVogal(texto.charAt(i)) == true) {
            return false;
         }
      }
      //Repete até o tamanho do texto
      for (int i = 0; i < texto.length(); i++) {
         //Verifica novamente se todos os caracteres são letras
         if ('a' <= texto.charAt(i) && texto.charAt(i) <= 'z' || 'A' <= texto.charAt(i) && texto.charAt(i) <= 'Z') {
            return true;
         }
      }
      return false;
   }

   public static boolean hasInteiro(String texto) {
      //Repete até o tamanho do texto
      for (int i = 0; i < texto.length(); i++) {
         //Verifica se é inteiro, caso nao for, retorna false
         if (isInteiro(texto.charAt(i)) == false) {
            return false;
         }
      }
      return true;
   }

   public static boolean hasReal(String texto) {
      int contador = 0;
      //Repete até o tamanho do texto
      for (int i = 0; i < texto.length(); i++) {
         //Verifica se é real, caso nao for, retorna false
         if (isReal(texto.charAt(i)) == false) {
            return false;
         }
      }
      for (int i = 0; i < texto.length(); i++) {
         //Conta a quantidade de , e .
         if (texto.charAt(i) == ',' || texto.charAt(i) == '.') {
            contador++;
         }
      }
      //Se a quantidade for maior que 1, retorna false
      if (contador > 1) {
         return false;
      }
      return true;
   }


   public static void main (String[] args){
      String[] entrada = new String[1000];
      int numEntrada = 0;

      //Leitura da entrada padrao
      do {
         entrada[numEntrada] = MyIO.readLine();
      } while (isFim(entrada[numEntrada++]) == false);
      numEntrada--;   //Desconsiderar ultima linha contendo a palavra FIM

      //Para cada linha de entrada, gerando uma de saida contendo a verificação de vogais, consoantes, numeros inteiros e numeros reais
      for(int i = 0; i < numEntrada; i++){
         String vogal = hasVogal(entrada[i])?"SIM":"NAO";
         String consoante = hasConsoante(entrada[i])?"SIM":"NAO";
         String inteiro = hasInteiro(entrada[i])?"SIM":"NAO";
         String real = hasReal(entrada[i])?"SIM":"NAO";
         MyIO.println(vogal + " " + consoante + " " + inteiro + " " + real);
      }
   }
}
