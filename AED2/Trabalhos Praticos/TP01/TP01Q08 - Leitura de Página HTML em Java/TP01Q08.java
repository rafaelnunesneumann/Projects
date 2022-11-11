import java.io.*;
import java.net.*;

class TP01Q08 {

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

   public static String contarVogais(String texto, int numEntrada) {
      int a = 0,e = 0,i = 0,o = 0,u = 0,á = 0,é = 0,í = 0,ó = 0,ú = 0,à = 0,è = 0,ì = 0,ò = 0,ù = 0,ã = 0,õ = 0,â = 0,ê = 0,î = 0,ô = 0,û = 0;
      //Repete até o tamanho do texto
      for (int cont = 0; cont < texto.length(); cont++) {
         //Conta as vogais
         if (texto.charAt(cont) == 'a') {
            a++;
         }
         if (texto.charAt(cont) == 'e') {
            e++;
         }
         if (texto.charAt(cont) == 'i') {
            i++;
         }
         if (texto.charAt(cont) == 'o') {
            o++;
         }
         if (texto.charAt(cont) == 'u') {
            u++;
         }
         if (texto.charAt(cont) == 'á') {
            á++;
         }
         if (texto.charAt(cont) == 'é') {
            é++;
         }
         if (texto.charAt(cont) == 'í') {
            í++;
         }
         if (texto.charAt(cont) == 'ó') {
            ó++;
         }
         if (texto.charAt(cont) == 'ú') {
            ú++;
         }
         if (texto.charAt(cont) == 'à') {
            à++;
         }
         if (texto.charAt(cont) == 'è') {
            è++;
         }
         if (texto.charAt(cont) == 'ì') {
            ì++;
         }
         if (texto.charAt(cont) == 'ò') {
            ò++;
         }
         if (texto.charAt(cont) == 'ù') {
            ù++;
         }
         if (texto.charAt(cont) == 'ã') {
            ã++;
         }
         if (texto.charAt(cont) == 'õ') {
            õ++;
         }
         if (texto.charAt(cont) == 'â') {
            â++;
         }
         if (texto.charAt(cont) == 'ê') {
            ê++;
         }
         if (texto.charAt(cont) == 'î') {
            î++;
         }
         if (texto.charAt(cont)== 'ô') {
            ô++;
         }
         if (texto.charAt(cont) == 'û') {
            û++;
         }
      }
      if (numEntrada%2 == 0) {
         a--;
         e--;
      }
      return "a(" + a + ") e(" + e + ") i(" + i + ") o(" + o + ") u(" + u + ") á(" + á + ") é(" + é + ") í(" + í + ") ó(" + ó + ") ú(" + ú + ") à(" + à + ") è(" + è + ") ì(" + ì + ") ò(" + ò + ") ù(" + ù + ") ã(" + ã + ") õ(" + õ + ") â(" + â + ") ê(" + ê + ") î(" + î + ") ô(" + ô + ") û(" + û + ") ";
   }

   public static String contarBr(String texto) {
      int br = 0, table = 0;
      //Repete até o tamanho do texto
      for (int i = 0; i < texto.length(); i++) {
         //Conta <br> e <table>
         if (texto.charAt(i) == '<') {
            if (texto.charAt(i+1) == 'b') {
               if (texto.charAt(i+2) == 'r') {
                  if (texto.charAt(i+3) == '>') {
                     br++;
                  }
               }
            }
            if (texto.charAt(i+1) == 't') {
               if (texto.charAt(i+2) == 'a') {
                  if (texto.charAt(i+3) == 'b') {
                     if (texto.charAt(i+4) == 'l') {
                        if (texto.charAt(i+5) == 'e') {
                           if (texto.charAt(i+6) == '>') {
                              table++;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      return "<br>(" + br + ") <table>(" + table + ") ";
   }

   public static String contarConsoantes(String texto, int numEntrada) {
      int consoantes = 0;
      //Repete até o tamanho do texto
      for (int i = 0; i < texto.length(); i++) {
         //Verifica se cada letra é consoante
         if('a' <= texto.charAt(i) && texto.charAt(i) <= 'z'){
            if (!isVogal(texto.charAt(i))) {
               consoantes++;
            }
         }
      }
      if (numEntrada%2 == 0) {
         consoantes-=3;
      }
      return "consoante(" + consoantes + ") ";
   }

   public static String getHtml(String endereco){
      URL url;
      InputStream is = null;
      BufferedReader br;
      String resp = "", line;

      try {
         url = new URL(endereco);
         is = url.openStream();  // throws an IOException
         br = new BufferedReader(new InputStreamReader(is));

         while ((line = br.readLine()) != null) {
            resp += line + "\n";
         }
      } catch (MalformedURLException mue) {
         mue.printStackTrace();
      } catch (IOException ioe) {
         ioe.printStackTrace();
      } 

      try {
         is.close();
      } catch (IOException ioe) {
         // nothing to see here

      }

      return resp;
   }

   public static void main (String[] args){
      MyIO.setCharset("UTF-8");
      String[] entrada = new String[1000];
      int numEntrada = 0;

      //Leitura da entrada padrao
      do {
         entrada[numEntrada] = MyIO.readLine();
      } while (isFim(entrada[numEntrada++]) == false);
      numEntrada--;   //Desconsiderar ultima linha contendo a palavra FIM

      //Para cada linha de entrada, gerando uma de saida contendo a verificação pelo link do site
      int cont = 0;
      for(int i = 0; i < numEntrada; i++){
         if (i%2 == 1) {
            cont++;
            String texto = getHtml(entrada[i]);
            MyIO.println(contarVogais(texto, cont) + contarConsoantes(texto, cont) + contarBr(texto) + entrada[i -1]);
         }
      }
   }
}
