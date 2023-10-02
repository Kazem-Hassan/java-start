import java.util.Scanner;

public class Entro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad heter du?");
                String namn = scanner.nextLine();

        System.out.println("Vad är ditt födelse år?");
                int birth_year = scanner.nextInt();

                int x = 2023;

                int age = x -birth_year;

        System.out.println("Hello" + namn + "you are " + age + " Year old." );

        scanner.close();

    }
    
}
