import java.util.ArrayList;
import java.util.Arrays;

//Skapa en klass Matratt
//den ska ha ett namn, pris, typ, antal kalorier
//Typ kan man tänka sig Vegetarisk, Vegansk, Kött
//Skapa upp några från main och lägg i en List.
//Skriv ut en dagens lunchmeny!
//Tips, tänk Listor och exemplet HockeyPlayer vi hade.


public class MatRattMain {
    public static void main(String[] args) {
        Matratt matratt1 =new Matratt("Qabili",  "kött", 175, 1500); //Här skapas en instans av klassen Matratt
        Matratt matratt2 = new Matratt("Tabula", "vegansk", 75, 300); //Här skapas en instans av klassen Matratt
        Matratt matratt3 = new Matratt("lasanie", "vegatarisk",  150, 750); //Här skapas en instans av klassen Matratt
        matratt1.setNamn("ris och kött");
        
         //Här skapas en dynamisk lista (lunchmeny) av maträtter med hjälp av ArrayList.
        ArrayList<Matratt> lunchmeny= new ArrayList<>();
        lunchmeny.add(matratt1); //: Här läggs matratt1 till i listan lunchmeny
        lunchmeny.add(matratt2);//: Här läggs matratt2 till i listan lunchmeny
        lunchmeny.add(matratt3);//: Här läggs matratt3 till i listan lunchmeny


        System.out.println("Lunchmeny för idag är:");
        //Här börjar en förbättrad for-loop som går igenom varje maträtt i lunchmeny.
        
        for (Matratt matratt : lunchmeny){   //طريقة الاولى
            //uti loopen används matratt för att referera till varje maträtt.
            System.out.println("Namn: " + matratt.getNamn());//anropar getNamn-metoden och returnerar namnet på maträtten.
            System.out.println("Typ : " + matratt.getTyp());//anropar getTyp-metoden och returnerar namnet på maträtten.
            System.out.println("Priset är: "+matratt.getPris());//anropar grtPris-metoden och returnerar namnet på maträtten.
            System.out.println("Antal Kalorier är : "+matratt.getAntalKalorier());//anropar getAntalKalorie-metoden och returnerar namnet på maträtten.
            System.out.println();
            
        }
        for(int i =0; i < lunchmeny.size(); i++){ // الرطريقة الثانية
            System.out.println(lunchmeny.get(i).toString());
        }
    }
    
}
