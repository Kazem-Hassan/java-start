import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mata in en mening eller ett ord:");
        String input = scanner.nextLine();

        String rensainput = input.replaceAll("[^a-zA-Z]", "").toLowerCase(); //skapar en version av input-strängen där alla tecken som inte är bokstäver tas bort och alla bokstäver görs lowercase. Detta är för att ignorera eventuella mellanslag och skiljetecken och för att göra jämförelsen case-insensitive.

        boolean ärPalindrom = String7(rensainput); //är en hjälpmetod som används för att kontrollera om en sträng är ett palindrom. Den använder två index (vänster och höger) för att jämföra tecken från starten och slutet av strängen.
        if(ärPalindrom){
            System.out.println("meningen/ordet är Palindrom");
        }else
        {
            System.out.println("meningen/ordet är inte Palindrom");
        }
        scanner.close();
    }

    private static boolean ärPalindrom(String rensainput) {
        return false;
    }
    
    public static boolean String7(String str) // Denna rad deklarerar en metod med namnet ärPalindrom. Den är markerad som public vilket betyder att den är tillgänglig för andra klasser att använda. static innebär att metoden tillhör klassen och inte ett specifikt objekt av klassen. boolean indikerar att metoden returnerar en sanningsvärde (true eller false). Metoden tar emot en sträng som argument, vilken är den sträng som vi vill kontrollera om den är ett palindrom eller inte.
    {
        int vänster = 0;
        int höger = str.length() - 1; //int vänster = 0; och int höger = str.length() - 1;: Dessa två rader deklarerar två heltalsvariabler, vänster och höger. De används för att hålla koll på de två positioner som vi jämför i strängen. vänster börjar på index 0 (början av strängen) och höger börjar på index str.length() - 1 (slutet av strängen).

        while (vänster < höger) //Detta är en while-loop som fortsätter så länge vänster är mindre än höger. Det betyder att vi kommer att fortsätta jämföra tecken tills vi har kommit till mitten av strängen.
        {
            if (str.charAt(vänster) != str.charAt(höger))// Inuti loopen jämförs tecknen på position vänster och höger. Om de inte är lika, returneras false, vilket betyder att strängen inte är ett palindrom.
             {
                return false;
            }
            vänster++;
            höger--;   //vänster++; och höger--;: Efter varje jämförelse ökar vi vänster och minskar höger för att flytta jämförelsepunkterna mot mitten av strängen.
        }

        return true; // Om loopen slutförs utan att hitta några olika tecken, betyder det att strängen är ett palindrom, och metoden returnerar true.
    }


}

