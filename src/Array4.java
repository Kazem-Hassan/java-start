
//Skapa en array med namn evenNumbers, be användaren mata in ett nummer och ett annat nummer som är högre.
//Få fram alla nummer mellan dessa två nummer som användaren matade in.
//Lägg in alla nummer som är jämna dvs delbara  med två i arrayen och printa sedan ut den med en for each-loop.

import java.util.ArrayList;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        //Skapa en array med namn evenNumbers,
        ArrayList<Double> evenNumbers = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        //be användaren mata in ett nummer och ett annat nummer som är högre.
        System.out.println("mata in ett nummer:");
        double nummer1 = scanner.nextInt();
       
        System.out.println("mata in ett annat nummer som är högre:");
        double nummer2 = scanner.nextInt();
        
        for(double i = nummer1; i < nummer2; i++){
            //lla nummer mellan dessa två nummer sparas i evenNumbers Array
            evenNumbers.add(i);
            //Få fram alla nummer mellan dessa två nummer som användaren matade in.
            System.out.println(i);
        }
        //Skapa en array med namn jämnaTal,
         ArrayList<Double> jämnaTal = new ArrayList<>();
            // Här används en förbättrad for-loop för att gå igenom varje tal i evenNumers.
        for (Double tal : evenNumbers )
        {
            //om talen ärdelbara  med två
            if(tal %2 == 0){
                //spara talen som är delbara  med två i jämntal Array
                jämnaTal.add(tal);
            }

         }System.out.println("Alla nummer som är jämna dvs delbara  med två i arrayen är :");
          // Här används en förbättrad for-loop för att gå igenom varje tal i jämnTal Array.
         for ( double tal :jämnaTal)
         {
            
             System.out.println(tal);

} 
         }
    }
    

