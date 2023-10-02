import java.util.Scanner;
//Be användaren mata in ett tal. Spara värdet i en variabel. Upprepa detta 10 gånger. För

//varje gång lägg till det inmatade värdet till variabelns värde. När det är klart skriv ut-
//Summan av det du matat in är: summan.


public class Loop4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tal = 0;
        int gånger =1;
        int summa =0;
        do {
        System.out.println("mata in ett tal:");
        int tal1 = scanner.nextInt();
        gånger++;
        summa += tal1;
        } while (gånger <= 10);

        System.out.println("Summan är" + summa);
    }
}




import java.util.Scanner;

public class SummaAvTioTal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int summa = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Mata in tal " + i + ": ");
            int inmatatTal = scanner.nextInt();
            summa += inmatatTal;
        }

        System.out.println("Summan av det du matat in är: " + summa);

        scanner.close();
    }
}
