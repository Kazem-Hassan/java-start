import java.util.Scanner;

public class Mjölk {
    public static void main(String[] args) {
    // Be användaren att mata in hur många paket mjölk som finns kvar. Är det mindre än
     //10, skriv - Beställ 30 paket. Är det mellan 10 och 20 skriv- Beställ 20 paket. Annars
      //skriv-Du behöver inte beställa någon mjölk.
      Scanner scanner = new Scanner(System.in);
      System.out.println("Hur många paket mjölk som finns kvar:     (svara med nummer)");
          int mjölk = scanner.nextInt();
      if (mjölk < 10 ){
           System.out.println("Beställ 30 paket.");


      }  else if (mjölk > 9 && mjölk < 21 ) {
             System.out.println("Beställ 20 paket.");

        
      } else {
            System.out.println("Du behöver inte beställa någon mjölk.");
        
      }  

    scanner.close();

    }
    
}
