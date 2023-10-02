//Skapa ett program där användaren får en fråga om att mata in sin ålder.
// Skapa en metod som tar emot det inmatade värdet och kontrollerar om användaren är myndig dvs över 18 år.
// Metoden returnerar sant eller falskt. Anropa metoden och skriv ut på skärmen om användaren är myndig eller ej.

import java.util.Scanner;
public class Metoder4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("Mata in din ålder");
        int ålder = scanner.nextInt();
        //: Här anropar du metoden myndig med ålder som argument. 
        boolean inmatadeÅlder = myndig (ålder);
        System.out.println(inmatadeÅlder);
        
    }
    // Här definierar du en offentlig (public) metod med namnet myndig.
    // Den tar en parameter ålder som är ett heltal och förväntas returnera en boolesk (boolean) värde (true eller false).
    public static boolean myndig(int ålder){
       // Inuti myndig-metoden kontrollerar du om ålder är mindre än 18.
       // Om så är fallet returnerar metoden false (vilket betyder att användaren inte är myndig).
       // Annars returnerar den true (vilket betyder att användaren är myndig).
        if( ålder < 18){
        return false;

        }else
        return true;
            
    }
}
