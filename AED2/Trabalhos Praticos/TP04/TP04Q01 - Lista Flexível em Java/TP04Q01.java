
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

class TP04Q01 {

    public static HashMap<Integer, Game> map = new HashMap<>();

    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static void main(String[] args) throws Exception {
        lerArquivoCsv();
        MyIO.setCharset("UTF-8");
        String[] entrada = new String[1000];
        int numEntrada = 0;
        int tamanho;
        String[] entrada2 = new String[1000];
        int numEntrada2 = 0;
        Lista lista = new Lista();

        //Leitura da entrada padrao
        do {
            entrada[numEntrada] = MyIO.readLine();
        } while (isFim(entrada[numEntrada++]) == false);
        numEntrada--; //Desconsiderar a ultima linha contendo a palavra FIM
        tamanho = Integer.valueOf(MyIO.readLine());
        for (int i = 0; i < tamanho; i++) {
            entrada2[numEntrada2++] = MyIO.readLine();
        }

        for (int i = 0; i < numEntrada; i++) {
            Game game = map.get(Integer.valueOf(entrada[i]));
            lista.inserirFim(game);
        }

        for (int i = 0; i < numEntrada2; i++) {
            if (entrada2[i].startsWith("II")) {
                String[] separado = entrada2[i].split(" ");
                lista.inserirInicio(map.get(Integer.valueOf(separado[1])));
            }
            if (entrada2[i].startsWith("IF")) {
                String[] separado = entrada2[i].split(" ");
                lista.inserirFim(map.get(Integer.valueOf(separado[1])));
            }
            if (entrada2[i].startsWith("I*")) {
                String[] separado = entrada2[i].split(" ");
                lista.inserir(map.get(Integer.valueOf(separado[2])), Integer.valueOf(separado[1]));
            }
        }

        //Saida das remoçoes primeiro
        for (int i = 0; i < numEntrada2; i++) {
            if (entrada2[i].startsWith("R")) {
                if (entrada2[i].startsWith("R*")) {
                    String[] separado = entrada2[i].split(" ");
                    Game game = lista.remover(Integer.valueOf(separado[1]));
                    System.out.println("(R) " + game.getName());
                }
                if (entrada2[i].startsWith("RF")) {
                    Game game = lista.removerFim();
                    System.out.println("(R) " + game.getName());
                }
                if (entrada2[i].startsWith("RI")) {
                    Game game = lista.removerInicio();
                    System.out.println("(R) " + game.getName());
                }
            }
        }

        for (int i = 0; i < lista.tamanho(); i++) {
            Game game = lista.pesquisar(i);
            System.out.println("[" + i + "] " + game.getApp_ID() + " " + game.getName() + " " + toString(game.getData()) + " " + game.getOwners() + " " + 
            game.getAge() + " " + price(game.getPrice()) + " " + game.getDlcs() + " " + game.getLanguages() +  " " + game.getWebsite() + " " +
            game.getWindows() + " " + game.getMac() + " " + game.getLinux() + " " + game.getUpVotes() + " " + converterHora(game.getAvg_Pt()) +
            " " + game.getDevelopers() + " " + game.getGenre());
        }
    }

    public static void lerArquivoCsv() throws Exception {
        Game[] game = new Game[6000];
        Scanner sc = new Scanner(new File("/tmp/games.csv"));
        sc.useDelimiter(",");
        int i = 0;
        while (sc.hasNextLine()) {
          String s = sc.nextLine();

          //Separa as linhas pelas , fora do ""
          String[] separado = s.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

          int id = Integer.valueOf(separado[0]);
          String name = separado[1];
          Date data;
          if (separado[2].contains(",")) {
            data = toDate(separado[2].replace("\"", ""), 1);
          } else {
            data = toDate(separado[2].replace("\"", ""), 0);
          }
          String owners = separado[3];
          int age = Integer.valueOf(separado[4]);
          float price;
          if (Float.valueOf(separado[5]) != 0) {
            price = Float.valueOf(separado[5]);
          } else {
            price = Float.valueOf("0.00");
          }
          int dlcs = Integer.valueOf(separado[6]);
          List<String> lan = new ArrayList<>();
          String language = separado[7].replace("\"", "").replace("'", "").replace("[", "").replace("]", "".replace("\r\n", ""));
          for (int j = 0; j < language.split(",").length; j++) {
            lan.add(language.split(",")[j]);
          }
          String[] languages = lan.toArray(new String[0]);
          String website = "null";
          if (separado[8] != "") {
            if (separado[8].length() > 5) {
                website = separado[8];
            }
          }
          boolean windows = Boolean.valueOf(separado[9]);
          boolean mac = Boolean.valueOf(separado[10]);
          boolean linux = Boolean.valueOf(separado[11]);
          float primeiro = Integer.valueOf(separado[12]);
          float segundo = Integer.valueOf(separado[13]);
          float upvotes;
          if (primeiro != 0) {
            upvotes = primeiro/(primeiro + segundo);
            upvotes*=100;
            upvotes = Math.round(upvotes);
          } else {
            upvotes = 0;
          }
          int avg_pt;
          if (separado[14] != "") {
            avg_pt = Integer.valueOf(separado[14]);
          } else {
            avg_pt = Integer.valueOf(null);
          }
          String developers = separado[15].replace("\"", "");
          List<String> gen = new ArrayList<>();
           if (separado.length == 17) {
            String genre = separado[16].replace("\"", "");
            for (int j = 0; j < genre.split(",").length; j++) {
                gen.add(genre.split(",")[j]);
              }
          } else {
            gen.add(null);
          }
          String genres[] = gen.toArray(new String[0]);
          game[i] = new Game(id, age, dlcs, avg_pt, name, owners, website, developers, price, upvotes, languages, genres, windows, mac, linux, data);
          map.put(id, game[i]);
          i++;
        }
        sc.close(); 
    }


    public static Date toDate(String data, int type) throws Exception{
        Date date;
        if (type == 0) {
            date = new SimpleDateFormat("MM yyyy", Locale.ENGLISH).parse(data.replace("Jan", "01").replace("Feb", "02").replace("Mar", "03")
            .replace("Apr", "04").replace("May", "05").replace("Jun", "06")
            .replace("Jul", "07").replace("Aug", "08").replace("Sep", "09")
            .replace("Oct", "10").replace("Nov", "11").replace("Dec", "12"));
        } else {
            date = new SimpleDateFormat("MM dd, yyyy", Locale.ENGLISH).parse(data.replace("Jan", "01").replace("Feb", "02").replace("Mar", "03")
            .replace("Apr", "04").replace("May", "05").replace("Jun", "06")
            .replace("Jul", "07").replace("Aug", "08").replace("Sep", "09")
            .replace("Oct", "10").replace("Nov", "11").replace("Dec", "12"));
        }
        return date;
    }

    public static String toString(Date date) throws Exception{
        String s = new SimpleDateFormat("MMM/yyyy").format(date);
        return s.replace("jan", "Jan").replace("fev", "Feb").replace("mar", "Mar")
        .replace("abr", "Apr").replace("mai", "May").replace("jun", "Jun")
        .replace("jul", "Jul").replace("ago", "Aug").replace("set", "Sep")
        .replace("out", "Oct").replace("nov", "Nov").replace("dez", "Dec");
    }

    public static String converterHora(float time) {
        if (time == 0) {
            return null;
        }
        int hora, minutos;
        hora = (int)time/60;
        minutos = (int)time%60;
        if (hora > 0 && minutos > 0) {
            return hora + "h" + " " + minutos + "m";
        } else if (hora > 0 && minutos == 0) {
            return hora + "h";
        } else if (hora == 0 && minutos > 0) {
            return minutos + "m";
        }
        return null;
    }

    public static String price(float price) {
        int p = (int)price;
        float dif = price - p;
        if (price == 0) {
            return "0.00";
        } else if (dif == 0) {
            return String.valueOf(price) + "0";
        } else {
            return String.valueOf(price);
        }
    }
}

class Game {

    private int app_id, age, dlcs, avg_pt;
    private String name, owners, website, developers;
    private Date release_date;
    private float price, upvotes;
    private String[] languages, genres;
    private boolean windows, mac, linux;

    public Game() throws Exception {
        String[] lan = {"English"};
        String[] gen = {"TBD"};
        String d = "01 2000";
        setApp_ID(0);
        setAge(0);
        setDlcs(0);
        setAvg_Pt(0);
        setName("Game");
        setOwners("TBA");
        setWebsite("www.game.com");
        setDevelopers("TBA");
        setPrice(0);
        setUpvotes(0);
        setLanguages(lan);
        setGenre(gen);
        setWindows(false);
        setMac(false);
        setLinux(false);
        setData(TP04Q01.toDate(d, 0));
        
    }

    public Game(int id, int age, int dlcs, int avg_pt, String name, String owners, String website, String developers, float price, float upvotes, String[] language, String[] genres, boolean windows, boolean mac, boolean linux, Date data) throws Exception {
        setApp_ID(id);
        setAge(age);
        setDlcs(dlcs);
        setAvg_Pt(avg_pt);
        setName(name);
        setOwners(owners);
        setWebsite(website);
        setDevelopers(developers);
        setPrice(price);
        setUpvotes(upvotes);
        setLanguages(language);
        setGenre(genres);
        setWindows(windows);
        setMac(mac);
        setLinux(linux);
        setData(data);
        
    }

    public void setApp_ID(int id) {
        if (id >= 0) {
            app_id = id;
        }
    }

    public int getApp_ID() {
        return app_id;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setDlcs(int dlcs) {
        if (dlcs >= 0) {
            this.dlcs = dlcs;
        }
    }

    public int getDlcs() {
        return dlcs;
    }

    public void setAvg_Pt(int avg_pt) {
        if (avg_pt >= 0) {
            this.avg_pt = avg_pt;
        }
    }

    public int getAvg_Pt() {
        return avg_pt;
    }

    public void setName(String name) {
        if (name.length() >= 1) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setOwners(String owners) {
        if (name.length() >= 1) {
            this.owners = owners;
        }
    }

    public String getOwners() {
        return owners;
    }

    public void setWebsite(String website) {
        if (website != null) {
            this.website = website;
        } else {
            this.website = "null";
        }
    }

    public String getWebsite() {
        String resp = "null";
        if (website != null) {
            resp = website;
        }
        return resp;
    }

    public void setDevelopers(String developers) {
        if (name.length() >= 1) {
            this.developers = developers;
        }
    }

    public String getDevelopers() {
        return developers;
    }

    public void setData(Date data) {
        release_date = data;
    }

    public Date getData() {
        return release_date;
    }

    public void setPrice(float price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public float getPrice() {
        return price;
    }

    public void setUpvotes(float upvotes) {
        if (upvotes >= 0) {
            this.upvotes = upvotes;
        }
    }

    public float getUpvotes() {
        return upvotes;
    }

    public String getUpVotes() {
        int num = (int)getUpvotes();
        return num+"%";
    }

    public void setLanguages(String[] languages) {
        if (languages.length >= 0) {
            this.languages = languages;
        }
    }

    public String getLanguages() {
        String s = "[";
        String s2 = "";
        for (int i = 0; i < languages.length; i++) {
            s+=languages[i] + ",";
        }
        for (int i = 0; i < s.length() - 1; i++) {
            s2+=s.charAt(i);
        }
        s2+="]";
        return s2;
    }

    public void setGenre(String[] genres) {
        if (genres.length >= 0) {
            this.genres = genres;
        }
    }

    public String getGenre() {
        String s = "[";
        String s2 = "";
        for (int i = 0; i < genres.length; i++) {
            s+=genres[i] + ", ";
        }
        for (int i = 0; i < s.length() - 2; i++) {
            s2+=s.charAt(i);
        }
        s2+="]";
        return s2;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public boolean getWindows() {
        return windows;
    }

    public void setMac(boolean mac) {
        this.mac = mac;
    }

    public boolean getMac() {
        return mac;
    }

    public void setLinux(boolean linux) {
        this.linux = linux;
    }

    public boolean getLinux() {
        return linux;
    }

}

class Celula {
    public Game elemento;
    public Celula prox;
    public Celula() throws Exception {
        this(new Game());
    }
    public Celula(Game game) {
        this.elemento = game;
        this.prox = null;
    }
}

class Lista {

    private Celula primeiro;
	private Celula ultimo;

    public Lista() throws Exception {
		primeiro = new Celula();
		ultimo = primeiro;
	}

	public void inserirInicio(Game x) {
		Celula tmp = new Celula(x);
      tmp.prox = primeiro.prox;
		primeiro.prox = tmp;
		if (primeiro == ultimo) {                 
			ultimo = tmp;
		}
      tmp = null;
	}

	public void inserirFim(Game x) {
		ultimo.prox = new Celula(x);
		ultimo = ultimo.prox;
	}

	public Game removerInicio() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		}

      Celula tmp = primeiro;
		primeiro = primeiro.prox;
		Game resp = primeiro.elemento;
      tmp.prox = null;
      tmp = null;
		return resp;
	}

	public Game removerFim() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		} 

		// Caminhar ate a penultima celula:
      Celula i;
      for(i = primeiro; i.prox != ultimo; i = i.prox);

      Game resp = ultimo.elemento; 
      ultimo = i; 
      i = ultimo.prox = null;
      
		return resp;
	}

   public void inserir(Game x, int pos) throws Exception {

      int tamanho = tamanho();

      if(pos < 0 || pos > tamanho){
			throw new Exception("Erro ao inserir posicao (" + pos + " / tamanho = " + tamanho + ") invalida!");
      } else if (pos == 0){
         inserirInicio(x);
      } else if (pos == tamanho){
         inserirFim(x);
      } else {
		   // Caminhar ate a posicao anterior a insercao
         Celula i = primeiro;
         for(int j = 0; j < pos; j++, i = i.prox);
		
         Celula tmp = new Celula(x);
         tmp.prox = i.prox;
         i.prox = tmp;
         tmp = i = null;
      }
   }

	public Game remover(int pos) throws Exception {
      Game resp;
      int tamanho = tamanho();

		if (primeiro == ultimo){
			throw new Exception("Erro ao remover (vazia)!");

      } else if(pos < 0 || pos >= tamanho){
			throw new Exception("Erro ao remover (posicao " + pos + " / " + tamanho + " invalida!");
      } else if (pos == 0){
         resp = removerInicio();
      } else if (pos == tamanho - 1){
         resp = removerFim();
      } else {
		   // Caminhar ate a posicao anterior a insercao
         Celula i = primeiro;
         for(int j = 0; j < pos; j++, i = i.prox);
		
         Celula tmp = i.prox;
         resp = tmp.elemento;
         i.prox = tmp.prox;
         tmp.prox = null;
         i = tmp = null;
      }

		return resp;
	}

	public void mostrar() {
		System.out.print("[ ");
		for (Celula i = primeiro.prox; i != null; i = i.prox) {
			System.out.print(i.elemento + " ");
		}
		System.out.println("] ");
	}

	public boolean pesquisar(Game x) {
		boolean resp = false;
		for (Celula i = primeiro.prox; i != null; i = i.prox) {
         if(i.elemento == x){
            resp = true;
            i = ultimo;
         }
		}
		return resp;
	}

    public Game pesquisar(int x) {
        Celula i = primeiro;
        Game resp = null;
        for(int j = 0; j < x; j++, i = i.prox);
		
        Celula tmp = i.prox;
        resp = tmp.elemento;
		return resp;
	}

   public int tamanho() {
      int tamanho = 0; 
      for(Celula i = primeiro; i != ultimo; i = i.prox, tamanho++);
      return tamanho;
   }

}