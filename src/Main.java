import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Skapa några maträtter
        Matratt matratt1 = new Matratt("Spaghetti Carbonara", 85.50, "Kött", 800);
        Matratt matratt2 = new Matratt("Vegetarisk lasagne", 70.00, "Vegetarisk", 600);
        Matratt matratt3 = new Matratt("Quinoa sallad", 65.25, "Vegansk", 450);

        // Lägg till maträtterna i en lista
        List<Matratt> lunchmeny = new ArrayList<>();
        lunchmeny.add(matratt1);
        lunchmeny.add(matratt2);
        lunchmeny.add(matratt3);

        // Skriv ut dagens lunchmeny
        System.out.println("Dagens Lunchmeny:");
        for (Matratt matratt : lunchmeny) {
            System.out.println("Namn: " + matratt.getNamn());
            System.out.println("Pris: " + matratt.getPris() + " kr");
            System.out.println("Typ: " + matratt.getTyp());
            System.out.println("Antal kalorier: " + matratt.getAntalKalorier());
            System.out.println();
        }
    }
}
