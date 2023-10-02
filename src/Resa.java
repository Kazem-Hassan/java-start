    import java.util.Scanner;

public class Resa {
    
    public static void main(String[] args) {
       
         
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("*Är du student, pensionär eller vuxen? " );
            String student = "student";
            String vuxen = "vuxen";
            String pensionär = "pensionär";
            String ålder = scanner.nextLine();

            if (ålder == student || ålder == pensionär ) {
                System.out.println(" Din resa kostar 20 kr.");
            }
            else{
              System.out.println(" Din resa kostar 30 kr.");

            }


        } catch (Exception e) {
            System.out.println(" den har matat in en felaktig svar " );

        }
    }
}

