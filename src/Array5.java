public class Array5 {
    public static void main(String[] args) {
        int[] heltalArray = {5, 10, 15, 20, 25}; // Skapa en array med heltal

        int summa = 0; // Variabel för att hålla summan

        // Loopa igenom arrayen
        for (int i = 0; i < heltalArray.length; i++) {
            summa += heltalArray[i]; // Lägg till elementets värde till summan
        }

        System.out.println("Summan av talen är: " + summa);
    }
}