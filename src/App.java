public class App {
    public static void main(String[] args) throws Exception {

        isEven(2);
        sign(-5);
        describe(2);
        order2(10,5);
        order3(6,1,3);
        line(2,5);
        table10(10); //tekee metodin parametrin verran kertotauluja
        check("java123");
        
        String passTries[] = {"java123114", "java1233","java123"};
        login(passTries);
        
        int luvut[] = {11,131,1,4,6,6,5,9};
        average(luvut);
        max(luvut);

}

 static boolean isEven(int n)
 {

    /*
    opettajan siistimpi esimerkki:

    boolean tulos = n%2 == 0;
    return tulos;
    */ 

    if(n%2 == 0)
    {
    System.out.println("tosi");
    return true;
    } 
    else    
    {
    System.out.println("epätosi");
    return false;
    }

}

static String sign(int n){
 if(n > 0)
    {
    String positiivinen = "positiivinen";
    System.out.println("positiivinen");
    return positiivinen;
    }
    else if(n == 0)
    {
    String nolla = "nolla";
    System.out.println("nolla");
    return nolla;
    }
    else{
    String negatiivinen = "negatiivinen";
    System.out.println("negatiivinen");
    return negatiivinen;
    }

    
}

static String describe(int n){
 if(n > 0 && n%2 == 0)
    {
    String positiivinenParillinen = "Positiivinen/parillinen";
    System.out.println("Positiivinen/parillinen");
    return positiivinenParillinen;
    }
        else if(n > 0 && n%2 != 0)
    {
    String positiivinenEiParillinen = "Positiivinen/pariton";
    System.out.println("Positiivinen/pariton");
    return positiivinenEiParillinen;
    }
    else if(n == 0)
     {
    String nolla = "nolla";
    System.out.println("nolla");
        return nolla;
     }
    else if(n < 0 && n%2 == 0)
     {
    String negatiivinenParillinen = "negatiivinen/parillinen";
    System.out.println("negatiivinen/parillinen");
    return negatiivinenParillinen;
     }
    else{
    String negatiivinenPariton = "negatiivinen/pariton";
    System.out.println("negatiivinen/pariton");
    return negatiivinenPariton;
     }
}

static String order2(int a,int b){
    int min = Math.min(a,b);
    int max = Math.max(a,b);

    String minStr = Integer.toString(min);
    String maxStr = Integer.toString(max);

    System.out.println(minStr+" "+maxStr);
    return minStr + maxStr;
}

static String order3(int a,int b,int c){
    int min = Math.min(a,b);
    int max = Math.max(a,b);
    int mid = (a+b+c)-min-max;

    String minStr = Integer.toString(min);
    String maxStr = Integer.toString(max);
    String midStr = Integer.toString(mid);

    System.out.println(minStr+" "+midStr+" "+maxStr);
    return minStr + midStr + maxStr;
}
static String line(int n,int i){
    int summa = n * i;

    String nStr = Integer.toString(n);
    String iStr = Integer.toString(i);
    String summaStr = Integer.toString(summa);

    String tuloste = nStr+"x"+iStr+"="+summaStr+"\n";
    System.out.println(tuloste);

     return tuloste;
}

static String table10(int n){

    String teksti = "";
    StringBuilder rakentaja = new StringBuilder(teksti);
    for(int kerroinLinelle = 1; kerroinLinelle <= n; kerroinLinelle++)
    {    
        teksti = line(1,kerroinLinelle);
        rakentaja.append(teksti);  
        System.out.println(teksti); //printtaa tulosteen kahdesti, sillä line metodissa on myös printti.
    }
    return teksti;
}
static boolean check(String s){
    String pass = "java123";

    boolean checkPass = pass.equals(s);
        if(pass.equals(s))
        {
        System.out.println("Oikein!");
        }
        else
        {
        System.out.println("Väärin!");
        }
    return checkPass;
}

static String login(String[] tries){

    String pass = "java123";
    String passväärin = "Salasana väärin!";
    String passOikein = "Tervetuloa!";

  if(tries.length > 3)
  {
    String failure = "liian monta yritystä!";
    System.out.println(failure);
    return failure;
  }
  else
  { 
    for(int i =0; i <= 3; i++)
    {
        if(tries[i].equals(pass)){
            
            System.out.println(passOikein);
            return passOikein;
        }
        else{
            System.out.println(passväärin);
        }
    }
    return passväärin;
  }
}

static double average(int[] a){

int summa =0;
int n = a.length; // käyttäjän syöttämän arrayn elementtien määrä
    for(int i =0; i < n; i++)
    {
        summa += a[i]; //lisätään summaan joka kerta arrayn elementtien arvo   
    }

    System.out.println(summa / n);
    return summa / n; //palautetaan keskiarvo
}

static int max(int[] a){

int edellinensuurin =0;
int nykyinenSuurin =0;
int n = a.length;
    for(int i =0; i < n; i++)
    {
        edellinensuurin = a[i];
        if(edellinensuurin >= nykyinenSuurin)
            {
            nykyinenSuurin = edellinensuurin; //päivitetään nykyinen suurin
            } 
    }
    System.out.println(nykyinenSuurin);
    return nykyinenSuurin;
}
}
