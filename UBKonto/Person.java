public class Person {
    private String name;
    private String vorname;

    public Person(String n, String v){
        name = n;
        vorname = v;
    }

    //setter and getter methods
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public String getVorname(){
        return vorname;
    }
    public void setVorname(String v){
        vorname = v;
    }
}
