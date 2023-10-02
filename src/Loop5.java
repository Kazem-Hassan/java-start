import java.util.Scanner;
//Skapa ett program där användaren får mata in ett tal. Låt sedan programmet skriva ut
//alla siffror som är mindre än det inmatade talet men större än 0. Lös detta med en
//loop.

public class Loop5 {
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
         int tal;
        
            System.out.println( "Mata ett tal");
            tal = scanner.nextInt();
            do{
            tal--;
            System.out.println( tal );
        }while (tal > 0); 
    }
}
