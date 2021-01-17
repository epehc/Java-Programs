/**
 * Klasse TestFloatQueue
 */
 

// Dies ist die Testklasse für die Klasse FloatQueue

public class TestFloatQueue {

    public static void main(String[] args) {
       // Queue mit 5 Elementen erzeugen
        FloatQueue example = new FloatQueue(5);

        // Füge die float-Werte 2.45 und 1.29 in Warteschlange ein
            // Warteschlange ausgeben
        example.enqueue((float) 2.45);
        example.enqueue((float) 1.29);
        example.queuePrint();
        
        //Füge 2 weitere Elemente (4.31, 7.85) in Warteschlange ein
          // Warteschlange ausgeben
         example.enqueue((float) 4.31);
         example.enqueue((float)7.85);
         example.queuePrint();

        
        // Entferne Element 0 aus der Warteschlange 
        // Warteschlange ausgeben
        example.dequeue();
        example.queuePrint();

        // füge neues Element ein (1.11)
        // Warteschlange ausgeben
         example.enqueue((float) 1.11);

        // Entferne alle Elemente aus Warteschlange
        // Warteschlange ausgeben
        while(!example.isEmpty()){
           example.dequeue();
        }
        example.queuePrint();
 
        // Füge 2 neue Elemente (2.11, 3.11) in Warteschlange ein
           // Warteschlange ausgeben
         example.enqueue((float) 2.11);
         example.enqueue((float) 3.11);

        // Löschen aller Warteschlangen-Inhalte
        // Warteschlange ausgeben
         example.clear();
         example.queuePrint();
 
 }
}