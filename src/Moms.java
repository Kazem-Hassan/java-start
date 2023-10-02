

import java.util.Scanner;

public class Moms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange en summa:");
              double summa = scanner.nextInt();


        double momsen = summa * 0.25;
        double Total_summa = summa + momsen;
        System.out.println("Momsen Är " + momsen);
        System.out.println("Total summan plus momsen är " + Total_summa);

    scanner.close();    

    }
    
}
