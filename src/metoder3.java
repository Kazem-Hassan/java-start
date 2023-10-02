//Skapa en metod som räknar ut hur mycket momsen blir på en viss summa. 
//Summan skall vara en parameter av typen int. Metoden skall returnera momsvärdet
import java.util.Scanner;

public class metoder3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mata in priset:  (mata in hel tal.)");
        int summan =scanner.nextInt();
        //Här anropas metoden moms() med summan som argument.
        // Resultatet, som är momsvärdet, lagras i variabeln momsen.
        double momsen = moms(summan);
        System.out.println("Momsen är " + momsen);

        
        
    }
    // Här definierar du en offentlig (public) metod med namnet moms.
    // Den tar en parameter summan som är ett heltal och förväntas returnera en flyttalsvärde (double).
    public static double moms(int summan ){
  // Inuti moms-metoden beräknar du momsvärdet genom att multiplicera summan med 0.25 (vilket motsvarar 25% moms).
       double momsVärdet = summan * 0.25;
       //moms-metoden returnerar momsvärdet.
       return momsVärdet;



    }
}
