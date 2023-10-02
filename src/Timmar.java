import java.util.Scanner;

public class Timmar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv antal minuter:");
              int minuter = scanner.nextInt();

              if ( minuter < 60) {
                System.out.println("Det är " +minuter + " minuter");


              } else   {
                int timmarna = minuter / 60;
                double minuterna = minuter % 60;
                
                System.out.println("Det är " + timmarna + " och " + minuterna + " minuter.");


              }
        scanner.close();

    }
    
}
