import java.util.Scanner;

public class Bägge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             System.out.println("Skriv två namn:");
              String namn1 = scanner.nextLine();
              String namn2 = scanner.nextLine();
        boolean lika = namn1.equals(namn2);

        System.out.println(lika);


    }
    
}
