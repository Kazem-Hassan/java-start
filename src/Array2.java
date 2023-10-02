import java.util.ArrayList;
import java.util.Scanner;

//Skapa ett program där användaren får upp fyra frågor om att mata in ett tal. Spara
//alla talen i en lista. Loopa igenom listan och ta fram det tal som är störst. Skriv
//tillbaka resultatet på skärmen för användaren



public class Array2 {
    public static void main(String[] args) {
        ArrayList<Double> talList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for ( int i =0; i < 4; i++){
            System.out.println("att mata in  tal #" +(i+1)+ ":");
            double tal =scanner.nextDouble();
            talList.add(tal);
            
            }
            Double maxTal= talList.get(0);
            //Detta är en förbättrad for-loop som går igenom varje element i listan talLista. Variabeln tal kommer att innehålla värdet av varje element i tur och ordning.
            for( double tal : talList)
            {
                if (tal> maxTal){
                    //Om tal är större än maxTal, uppdateras värdet av maxTal med värdet av tal. Detta betyder att maxTal alltid kommer att innehålla det största värdet hittills.
                    maxTal = tal;
                }
            }   System.out.println("Det största talet är:" + maxTal );    

   }

    
}
