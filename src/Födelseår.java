import java.util.Scanner;

public class Födelseår{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        System.out.println("vad är ditt födelseår?  (skriv med siffror)");
         int age = scanner.nextInt();
         
         if (age  > 1979 && age < 1991) { 
            System.out.println("Du är född på 1980-talet.");
         }
         else if (age > 1989 && age < 2001 ){
            System.out.println("Du är född på 1990-talet");
         } else {
            System.out.println(" Du är inte född på 1990 eller 1980-talen.");
         }
    }



}