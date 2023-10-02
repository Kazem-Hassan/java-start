
//Skapa en metod som heter addNumberAndStore, metoden ska ta emot en variabel och lagra den i en array.
//Gör så att användaren kan lägga till flera nummer och skriv ut sedan ut innehållet i listan.

import java.util.Scanner;
import java.util.ArrayList;
public class Metoder6 {
    static  ArrayList<Integer> minArray =new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur många tal vill du mata in?");
        int gånger=scanner.nextInt();
        for (int i = 0;  i< gånger; i++){
            System.out.println("Mata in tal #" + (i+1) + ":");
            Integer tal = scanner.nextInt();
            ArrayList<Integer> lagra_I_Array = addNumberAndStore(tal);
             
            
        }

    }
    public static ArrayList<Integer> addNumberAndStore(int tal){
       
        
         minArray.add(tal);
         
       return minArray;
        
    }
}
