//Skapa en metod som du döper till hittaLangstaOrdet. 
//Metoden skall ta som inparameter en array med strängar.
// Metoden skall loopa igenom arrayen och returnera det längsta ordet.


public class Metoder5{
    public static void main(String[] args) {
        // Här skapar vi en array med strängar som heter ordLista och fyller den med några exempelord.
        String [] ordList ={"ali","Narges","Ali_Hassan", "biblan"};
        // Här anropar vi metoden hittaLangstaOrdet med ordLista som argument. 
        //Resultatet (den längsta strängen) kommer att lagras i variabeln langstaOrdet.
        String langstaOrd = hittaLangstaOrdet(ordList);
        System.out.println(langstaOrd);

        
    }
    // Här definierar vi metoden hittaLangstaOrdet.
    // Den är offentlig (public), vilket innebär att den kan användas från andra delar av programmet.
    // Den förväntar sig en array av strängar som inparameter och kommer att returnera en sträng som svar.
    public static String hittaLangstaOrdet(String[] ordList){
        //Här skapar vi en variabel langstaOrd och sätter den till en tom sträng.
        // Detta är variabeln som kommer att hålla det längsta ordet.
      String langsaord ="";
       //Här börjar en for-loop som går igenom varje sträng i ordLista.
      for(String ord : ordList){
        //nuti loopen jämförs längden på varje sträng (ord) med längden på langstaOrd.
        // Om ord är längre,
        if(ord.length() > langsaord.length()) 
           // uppdateras langstaOrd med det nya längsta ordet.
            langsaord = ord;
        
      } return langsaord;

    }






}



