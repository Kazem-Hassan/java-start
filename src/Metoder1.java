public class Metoder1 {
    //Skapa ett program med en ny metod. Döp metoden till printMessage().
    // Den skall returnera texten – ”Hello World!”.


    public static void main(String[] args) {
        // I main-metoden skapar du en variabel message av typen String.
        // Du tilldelar den resultatet av att anropa metoden printMessage().
        String message= printMessage();
        System.out.println(message);
    }
    //: Här definierar du metoden printMessage(). 
    // Den är deklarerad med returtypen String, vilket betyder att den förväntas returnera en textsträng.
    public static String  printMessage() {
        //I printMessage()-metoden returneras textsträngen "Hello World!".
         //Detta är det värde som kommer att tilldelas variabeln message när printMessage() anropas i main-metoden.
        return "Hello Word";
 
        
    }
    
}


