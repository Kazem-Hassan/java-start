import java.util.Scanner;

public class AgeA {
    
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Mata in din ålder:   (svara med siffror.)" );
            int ålder = scanner.nextInt();

            if (ålder < 18 ) {
                System.out.println("DU ej myndig.");
            }
            else if (ålder > 65 ){
              System.out.println("DU är  pensionär.");
            } else{
              System.out.println("DU är  myndig.");

            }


        } catch (Exception e) {
            System.out.println(" den har matat in en felaktig ålder " );

        }
    }
}
