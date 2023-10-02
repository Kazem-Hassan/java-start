//I Main skapa ett objekt av Student och tilldela instansvariablerna ett värde. 
//Skriv sedan ut värdet på instansvariablerna.



public class StudentMain {
    public static void main(String[] args) {
        //Här skapas en ny instans av Student-klassen med hjälp av konstruktorn. 
        Student student = new Student("Kazem", "Hassan", 30, "Nackademin");

        
        System.out.println(student.getÅlder()+" "+ student.getEfterNamn()+" "+student.getFörNamn() +" "+ student.getSkolNamn());
    }
}
