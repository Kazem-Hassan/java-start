import java.util.Scanner;

public class Växla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ange belopp som ska betalas:");
        int belopp = scanner.nextInt();

        int femhundra = belopp / 500;
        belopp = belopp % 500;

        int hundra = belopp / 100;
        belopp = belopp %100;

        int femtio = belopp / 50;
        belopp = belopp %50;

        int tjogu = belopp / 20;
        belopp = belopp % 20;

        int tio = belopp / 10;
        belopp= belopp % 10;

        int fem = belopp / 5;
        belopp = belopp % 5;
        
        int krona = belopp;

        System.out.println("500 lappar:" + femhundra);
        System.out.println("100 lappar:" + hundra);
        System.out.println("50 lappar:" + femtio);
        System.out.println("20 lappar:" + tjogu);
        System.out.println("10 kr:" + tio);
        System.out.println("5 kr:" + fem);
        System.out.println(" en krona:" + krona);

        scanner.close();

    }
    
}
