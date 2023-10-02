import java.util.Scanner;

public class Stringar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv tre meningar:");
            String mening1 = scanner.nextLine();
            String mening2 = scanner.nextLine();
           String mening3 = scanner.nextLine();
        System.out.println(mening1 + mening2 + mening3);   


    }
}