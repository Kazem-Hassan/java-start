import java.util.Scanner;

public class Sträng6 {
    //Gör ett program där användaren får mata in en mening t ex ”Detta är min text
    //som jag matar in”. Programmet skall räkna ut hur många ord meningen består av
    //och meddela användaren om detta.


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mata in en mening:");
        String mening = scanner.nextLine();

        String[] ordList = mening.split("\\s+"); //mening.split("\\s+") delar upp strängen i en lista av ord. Här används reguljära uttrycket \\s+ som matchar en eller flera vita tecken (mellanrum, tabbar, etc.) som 
       
       
        int antalOrd =ordList.length;  // ordLista.length ger antalet element i listan, vilket motsvarar antalet ord i meningen.

       // Resultatet skrivs ut på skärmen tillsammans med en lämplig meddelandesträng.
        System.out.println("Antal ord i denna mening är " + antalOrd + "ord.");
        
        scanner.close();
    }
    
}
