import java.util.List;
import java.util.Random;

/**
 * Aufgabe: Klasse Auto(bewertet)
 * 
 * @author Jose Cardona
 * 
 *         Beschreibung: Klasse Auto zur erzeugen von selbstfahrende Autos
 * 
 */
 
 // fuegen Sie sinnvolle Kommentare ein !!!


 public class Auto {

    private int geschwindigkeit;
    private String farbe;
    
    //Constructor to create Auto Objects with color.
    public Auto(String far){
        farbe = far;

    }

    //getter and setter methods
    public int getGeschwindigkeit() { 
        return geschwindigkeit;        
    }
    public void setGeschwindigkeit(int ges){
        geschwindigkeit = ges;
    }
    public String getFarbe(){
        return farbe;
    }
    public void setFarbe(String far){
        farbe = far;
    }
    
    //drive method. Depending on the current value of the speed, what the console will print
    public void fahren(int ges){
        if(getGeschwindigkeit() < ges){
            geschwindigkeit = ges;
            System.out.println(getFarbe() + " beschleunigt auf Geschwindigkeit von " + getGeschwindigkeit() + "km/h");
        }
        else if(getGeschwindigkeit() == ges){
            System.out.println(getFarbe() + " hält Geschwindigkeit von " + ges + "km/h");
        }
        else{
            geschwindigkeit = ges;
            System.out.println(getFarbe() + " bremst auf Geschwindigkeit von " + getGeschwindigkeit() + " km/h");
        }
        
    }

    //Turn right method
    static void rechtsFahren(int grad, String far){
        System.out.println(far + " fährt eine Rechtskurve von " + grad + " Grad");
    }

    //Turn left method
    static void linksFahren(int grad, String far){
        System.out.println(far + " fährt eine Linkskurve von " + grad + " Grad");
    }

    //Obstruction detection method (50% chance)
    public boolean hinderniserkennung(){
        int warscheinlichkeit = new Random().nextInt(2);
        if(warscheinlichkeit == 1){
            System.out.println("Es liegt ein Hindernis für " + getFarbe() + " vor");
            return true;
        }
        else{
            System.out.println("Es liegt kein Hindernis für " + getFarbe() + " vor");
            return false;
        }
    }
}
