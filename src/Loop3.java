import java.util.Scanner;
//Skapa ett program där användaren

//Får mata in två tal.
//Skriv sedan till skärmen summan av de två talen.
//Skriv sedan en fråga- Vill du fortsätta(J/N)?.
//Svarar användaren J återupprepas punkt a-c
//Svarar användaren N avbryts programmet

public class Loop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char svar;
        do{
        System.out.println("matta in två tal:");
        int tal1 =scanner.nextInt();
        int tal2 =scanner.nextInt();
        int summa = tal1 +tal2;
        System.out.println(summa);
        System.out.println("Vill du fortsätta?   J/N");
        svar = scanner.next().charAt(0);
        } while (svar == 'J' || svar == 'j');


        scanner.close();



    }
    
}
