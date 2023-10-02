//Skapa en klass Matratt
//den ska ha ett namn, pris, typ, antal kalorier




class Matratt {// Här börjar definitionen av klassen Matratt.
    // namn, pris, typ, antal kalorier
    private String namn; // Detta är en privat medlemsvariabel som håller namnet på maträtten.
    private String typ;
    private int pris;  //Detta är en privat medlemsvariabel som håller priset på maträtten.
    private int antalKalorier;
    

// Detta är en konstruktor som används för att skapa en instans av Matratt. Den tar fyra inparametrar.
public Matratt(String namn, String typ, int pris, int antalKalorier){
    //Här används this för att referera till den aktuella instansen av objektet (Matratt). 
    //namn är det namn som skickats som argument till konstruktorn, och det tilldelas till medlemsvariabeln namn
    this.namn= namn;
    this.typ= typ;
    this.pris= pris;
    this.antalKalorier =antalKalorier;

}
//Detta är en metod som tillåter åtkomst till namnet på maträtten. Metoden getNamn returnerar namnet.
public String getNamn(){
    return namn;
}

public String getTyp(){
    return typ;
}
public int getPris(){
    return pris;    
}
public int getAntalKalorier(){
    return antalKalorier;
}
// skapar den här metoden för att välja vilka info som du vill skriva ut.
public String toString(){ 
    return namn +" "+ typ +" "+ pris;

} 
public void setNamn(String namn ){
    this.namn = namn;

}
}