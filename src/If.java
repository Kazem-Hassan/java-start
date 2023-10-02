import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Ange ett tal:");
             int tal = scanner.nextInt();
             if (tal > 10){
                System.out.println("Talet större än 10");
                    
                           }else {
                            System.out.println("Talet mindre äm 10");
                           }
        scanner.close();                   

    }
    
}
