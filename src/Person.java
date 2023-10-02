 class Person {
    private int födelsedatum;
    private String namn;
    private String gatuAdress;
    private int postNummer;
    private String postOrt;


    public Person(int födelsedatum){
        this.födelsedatum= födelsedatum;
    }
    public String getNamn(){
        return namn;
    }
    public void setNamn(String namn){
        this.namn = namn;

    }
    public void bytAdress(String gatuAdress, int postNummer, String postOrt){
        this.gatuAdress = gatuAdress;
        this.postNummer = postNummer;
        this.postOrt = postOrt;

    }

    public void moveIn(Person person1, Person person2) {

        System.out.println(person1.getNamn() + " flyttade in hos " + person2.getNamn() + " på adress " + person2.getAdress());
    }

    public String getAdress() {
        return this.gatuAdress;
    }

    public int getPostNummer() {
        return this.postNummer;
    }
    
}
