
//
//Skapa ett program med en ny metod.
// Metoden skall ta emot två inparametrar av typen string och slå ihop dom till en sträng och returnera det nya värdet. 
//Anropa den nya metoden från main och skriv ut resultatet på skärmen.
public class Metoder2 {
   
    public static void main(String[] args) {
        //I main-metoden skapar du en variabel resultat av typen String. 
        //Du tilldelar den resultatet av att anropa metoden slaaIhop() med argumenten "Hello" och "Word".
        String resultat = slaaIhop("Hello", "Word");
        System.out.println(resultat);
    }
      //Här definierar du en privat (private) metod med namnet slaaIhop.
      // Denna metod tar två strängar som argument, string och string2, och förväntas returnera en textsträng.   
    private static String slaaIhop (String string, String string2){
        //Inuti slaaIhop-metoden skapas en ny strängvariabel tillsamma,
        // som är resultatet av att slå ihop string och string2.
        String tillsamma = string+string2;
        //slaaIhop-metoden returnerar strängen tillsamma.
        return tillsamma;
    }
    
}
