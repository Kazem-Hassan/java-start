 //Skapa en klass Student
//Den ska ha ett förnamn, efternamn, namn på skolan som studenten
//studerar på samt ålder på studenten,

 
 class Student {   // Här börjar definitionen av klassen Student.
    private String förNamn; //Detta är en privat medlemsvariabel som håller studentens förnamn.
    private String efterNamn;//Detta är en privat medlemsvariabel som håller studentens efternamn.
    private int ålder;  //Detta är en privat medlemsvariabel som håller studentens ålder.
    private String skolNamn;//Detta är en privat medlemsvariabel som håller studentens Skola.

    


    // Detta är en konstruktor som används för att skapa en instans av Student.
    // Den tar fyra inparametrar (förnamn, efternamn, ålder, skolnamn)
    // och sätter dem som värden för respektive egenskap hos studenten.
    public Student(String förNamn, String efterNamn, int ålder, String skolNamn ){
        
        this.förNamn = förNamn;// Här används this för att referera till den aktuella instansen av objektet (Student). förNamn är det namn som skickats som argument till konstruktorn, och det tilldelas till medlemsvariabeln förNamn.
        this.efterNamn= efterNamn;
        this.ålder = ålder;
        this.skolNamn = skolNamn;
    }
    public String getFörNamn(){ //Detta är en metod som tillåter åtkomst till förnamnet på studenten. Metoden getFörNamn returnerar förnamnet.
        return förNamn;
    }
    public String getEfterNamn(){//: Detta är en metod som tillåter åtkomst till efternamnet på studenten. Metoden getEfterNamn returnerar efternamnet.
        return efterNamn;
    }
    public int getÅlder(){//Detta är en metod som tillåter åtkomst till åldern på studenten. Metoden getÅlder returnerar åldern som ett heltal.
        return ålder;
    }
    public String getSkolNamn(){//: Detta är en metod som tillåter åtkomst till namnet på den skola där studenten går. Metoden getSkolNamn returnerar skolans namn.
        return skolNamn;
    }



    
}
