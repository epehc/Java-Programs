public class Konto{
    private Person person;
    private double kontostand;

    //Constructor
    public Konto(String name, String vorname, double kontostand){
        person = new Person(name, vorname);
        this.kontostand = kontostand;
    }

    //getter and setter methods
    public double getKontostand(){
        return kontostand;
    }
    public void setKontostand(double betrag){
        kontostand += betrag;
    }
    public Person getPerson(){
        return person;
    }
    public String getPersonName(){
        return person.getName();
    }
    public String getPersonVorname(){
        return person.getVorname();
    }
    public void setPersonName(String name){
        person.setName(name);
    }
    public void setPersonVorname(String vorname){
        person.setVorname(vorname);
    }

    public void ueberweise(Konto aufKonto, double betrag){
        this.kontostand -= betrag;
        aufKonto.setKontostand(betrag);

        System.out.println("Nach der Überweisung hat");
        System.out.println(this.person.getName() + " " + this.getKontostand() + " auf dem Konto");
        System.out.println(aufKonto.person.getName() + " " + aufKonto.getKontostand() + " auf dem Konto");
    }
    
}