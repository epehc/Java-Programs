
/**
 * Aufgabe Klasse TestAuto(bewertet)
 * @author Jose Cardona
 * 
 * Beschreibung: Testklasse für die Klasse Auto
 * 
 */
 
 // fuegen Sie sinnvolle Kommentare ein


// Dies ist die Testklasse für die Klasse Auto
public class TestAuto {

    public static void main(String[] args) {
        // ....
        Auto car1 = new Auto("Rot");
        Auto car2 = new Auto("Blau");

        boolean first;
        boolean second;

        //Start moving both cars
        car1.fahren(15);
        car2.fahren(15);
        
        //Will run in a Loop to avoid repetition of code
        for(int i = 1; i<= 5; i++){
            first = car1.hinderniserkennung();
            second = car2.hinderniserkennung();
            if(!first && !second){
                car1.fahren(15);
                car2.fahren(15);                
            }
            else if(!first){
                car1.fahren(15);
                car2.fahren(5);
                Auto.rechtsFahren(180, car2.getFarbe());
                car2.fahren(15);
            }
            else if(!second){
                car1.fahren(5);
                Auto.linksFahren(180, car1.getFarbe());
                car1.fahren(15);
                car2.fahren(15);
            }
            else{
                car1.fahren(5);
                Auto.linksFahren(180, car1.getFarbe());
                car1.fahren(15);
                car2.fahren(5);
                Auto.rechtsFahren(180, car2.getFarbe());
                car2.fahren(15);
            }

            System.out.println("Runde " + i + " beendet");
            System.out.println();
        }
    }

}