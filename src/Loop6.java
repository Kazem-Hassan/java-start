import java.util.Scanner;
import java.util.Random;

//Rolling the dice

//Kasta två tärningar” och visa resultatet enligt skärmdump ända tills man INTE svarar ”y” eller ”yes” på frågan om igen


public class Loop6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        char again;
        do{
        System.out.println("Rolling the dices...");
        System.out.println("The valuse are...");
        int slumpTal1 = randomGenerator.nextInt(6) + 1;
        int slumpTal2 = randomGenerator.nextInt(6) + 1;
        System.out.println(slumpTal1);
        System.out.println(slumpTal2);
        System.out.print("Rolle the dices again?y ");
        again = scanner.next().charAt(0);
        } while(again == 'Y' || again == 'y' );

        scanner.close();

    }
}