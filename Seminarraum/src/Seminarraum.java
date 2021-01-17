public class Seminarraum {
    private int maxStuehle;
    private int anzahlStuehle;
    private String name;

    public Seminarraum(String n, int anzahl, int max){
        name = n;
        maxStuehle = max;
        anzahlStuehle = anzahl;
    }
    public String getName(){
        return name;
    }
    public int getMaxStuehle(){
        return maxStuehle;
    }
    public int getAnzahlStuehle(){
        return anzahlStuehle;
    }
    public void aendernAnzahlStuehle(int anzahl){
        anzahlStuehle = anzahl;
    }
    public void erhoeheStuehle(){
        anzahlStuehle++;
        if (anzahlStuehle < maxStuehle){
            System.out.println("Die maximale Anzahl von Stühle wurde verpasst, wählen Sie ein kleineres Zahl");
            anzahlStuehle--;
        }
        else{
            System.out.println("In " + this.getName() + " wurde ein Stuhl dazugestellt.");
            System.out.println(this.getName() + " hat " + this.getAnzahlStuehle() + " Stühle.");
        }
    }
    public void verringernStuehle(){
        anzahlStuehle--;
        System.out.println("Aus " + this.getName() + " wurde ein Stuhl entfernt.");
        System.out.println(this.getName() + " hat " + this.getAnzahlStuehle() + " Stühle.");
    }

    public void control(){
        System.out.println(getName() + " hat " + getAnzahlStuehle() + " von maximal " + getMaxStuehle() + " Stühlen.");
    }

    public void equals(Seminarraum zweite){  
        int ersteStuehle = this.getAnzahlStuehle();
        int zweiteStuehle = zweite.getAnzahlStuehle();     
        if(ersteStuehle > zweiteStuehle){
            System.out.println(this.getName() + " hat nicht genau so viel Stühle wie " + zweite.getName());
        }
        else if(zweiteStuehle > ersteStuehle){
            System.out.println(zweite.getName() + " hat nicht genau so viel Stühle wie " + this.getName());
        }
        else{
            System.out.println(this.getName() + " hat genau so viel Stühle wie " + zweite.getName());
        }
    }
}
