import java.util.Scanner;
import java.util.ArrayList;

public class Array1 {
    public static void main(String[] args) {
        //Här skapar vi en ArrayList med namnet talLista som kommer att innehålla tal som Double (decimaltal).
        ArrayList<Double> tallist= new ArrayList<>();  
        // Skapar en Scanner för att läsa inmatning från användaren 
        Scanner scanner = new Scanner(System.in); 
         // Loopar igenom och ställer fyra frågor om att mata in tal
        for ( int i = 0; i < 10; i++){
            System.out.println("mata in tal #" + (i+1) + ":");
            double tal = scanner.nextDouble();
            //Här läggs det inmatade talet till i ArrayList talLista med hjälp av metoden add().
            tallist.add(tal);

        }
        // Presenterar innehållet i listan
        System.out.println("talen du matade är:");
        // Här används en förbättrad for-loop för att gå igenom varje tal i talLista.
        for ( double tal : tallist){
            System.out.println(tal);
        }


    }

}
