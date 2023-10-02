import java.util.Scanner;

public class beräkningar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out. println("Skriv tal 1:");
             int tal1 = scanner.nextInt();
         System.out. println("Skriv tal 2:");
             int tal2 = scanner.nextInt();

        int summa = tal1 + tal2;

        int differens  = tal1 -tal2;
        double medelvärde = (double)(tal1 + tal2) / 2;
        
        System.out.println("Summan av dem två talen är " + summa);
        System.out.println("Differens mellan dem två talen är " + differens );
        System.out.println("Medelvärdet av dem två talen är 10 " + medelvärde);

        scanner.close();




    }

}

    
    

