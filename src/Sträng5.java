public class Sträng5 {
    //Du har en Sträng som heter containNumbers, skriv in “1234”, skriv kod som kontrollerar
    //om strängen innehåller siffror eller ej.


    public static void main(String[] args) {
        
    
    String containNumbers = "123456789";
    boolean innehållerSiffror = false; //boolean innehållerSiffror = false; initierar en boolean-variabel som kommer att vara true om strängen innehåller siffror, och false annars.

    for(char c: containNumbers.toCharArray()) //for (char c : containNumbers.toCharArray()) { ... } loopar igenom varje tecken i strängen containNumbers.
    //containNumbers.toCharArray() konverterar strängen till en char-array så att vi kan loopa igenom den.
    //char c : ... deklarerar en temporär variabel c som kommer att vara varje enskilt tecken i strängen.
    {
        if (Character.isDigit(c)) //if (Character.isDigit(c)) { ... } kontrollerar om det aktuella tecknet (c) är en siffra med hjälp av Character.isDigit(). Om det är en siffra, sätter vi innehållerSiffror till true och bryter ut ur loopen.
        {
            innehållerSiffror = true;
            break;
        }
    } if (innehållerSiffror)
    {
        System.out.println("innehållerSiffror");
    }else{
        System.out.println("innehåller inte siffror");
    }

  }  
}
