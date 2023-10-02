import java.util.Scanner;
//Skapa ett program där användaren får mata in två tal. Låt sedan programmet skriva ut alla
//tal som finns mellan dessa två tal på skärmen. Lös detta med en for-loop.


public class Loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matta in två tal:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        if (x<y){
            for(int tal1= x ; tal1 < y; tal1++) {
                System.out.println(tal1);
            }

        }else{
            System.out.println("första talet måste vara mindre än andra talet");
        }
    }
    
}
