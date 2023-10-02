import java.util.Scanner;
import java.util.ArrayList;

//Skapa ett program där användaren får upp fyra frågor om att mata in ett tal. Spara
//alla talen i en lista. Loopa igenom listan och presentera innehåller i konsolen.

//Utöka uppgift 1 med en inledande fråga där användaren får ange hur många tal den
//vill mata in. Gör sedan samma sak för att ta fram det största talet.

public class Array3 {
    public static void main(String[] args) {
        //Här skapar vi en ArrayList med namnet talLista som kommer att innehålla tal som Double (decimaltal).
        ArrayList<Double> tallist= new ArrayList<>();  
        // Skapar en Scanner för att läsa inmatning från användaren 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Hur många tal vill du mata in ?");
        int gånger = scanner.nextInt();
        
         // Loopar igenom och ställer fyra frågor om att mata in tal
        for ( int i = 0; i < gånger; i++){
            System.out.println("mata in tal #" + (i+1) + ":");
            double tal = scanner.nextDouble();
            //Här läggs det inmatade talet till i ArrayList talLista med hjälp av metoden add().
            tallist.add(tal);

        }
        Double maxTal = tallist.get(0);
       
        // Här används en förbättrad for-loop för att gå igenom varje tal i talLista.
        for ( double tal : tallist){
            if(tal > maxTal){
                ////Om tal är större än maxTal, uppdateras värdet av maxTal med värdet av tal. Detta betyder att maxTal alltid kommer att innehålla det största värdet hittills.
                maxTal = tal;
            }
             
        }System.out.println("Det största talet du matade:" + maxTal);


    }

}

