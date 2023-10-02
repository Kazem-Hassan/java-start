public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person(1992);
        Person person2= new Person(2000);
    
    person1.bytAdress("Kungsgatan", 75321, "Uppsala");
    person2.bytAdress("täljestenen", 75234 , "Uppsala");

    person1.setNamn("Kazem");
    person2.setNamn("Hadi");

    person1.moveIn(person1, person2);
    
    
    }

    
}
