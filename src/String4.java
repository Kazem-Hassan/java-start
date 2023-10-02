import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mata in det första namnet: ");
        String namn1 = scanner.nextLine();

        System.out.print("Mata in det andra namnet: ");
        String namn2 = scanner.nextLine();

        if (!namn1.isEmpty()){
            namn1 = namn1.substring(0, 1).toUpperCase() +namn1.substring(1);

            if(!namn2.isEmpty()){
                namn2=namn2.substring(0, 1).toUpperCase() +namn2.substring(1);
            }System.out.println(namn1 + namn2);
            scanner.close();
        }
    }
    
}
