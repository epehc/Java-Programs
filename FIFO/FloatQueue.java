public class FloatQueue {
    private float[] warte;
    private int laenge;

    public FloatQueue (int l){
        laenge = l;
        warte = new float[l];
    }
    public void enqueue(float wert){
        //check whether the queue is empty, to add it to the first slot
        if(this.isEmpty()){
            warte[0] = wert;
        }
        else{
            //check which is the next available slot, to set it there
            for(int i = 1; i < laenge; i++){
                if(warte[i] == 0){
                    warte[i] = wert;
                    break;
                }
                //Prints a message in case the queue is already full
                else if(warte[laenge - 1] != 0){
                    System.out.println("Warteschlange ist schon voll!");
                }
            }
        }

    }
    public float dequeue(){
        float toShow;
        //returns -1 in case the queue is empty
        if(this.isEmpty()){
            return (float) -1.0;
        }
        else{
            /*assign the value of the first slot to the local variable
             and correct the values in the queue.*/
            toShow = warte[0];
            for(int i = 0; i < laenge -1; i++){
                warte[i] = warte[i + 1];
            }
            warte[laenge -1] = 0;
            System.out.println("Entferntes Wert: " + toShow);
            System.out.println();
            return toShow;
        }

    }
    public boolean isEmpty(){
        //checks to see if any of the values is not 0 
        for (float f : warte) {
            if(f != 0){
                return false;
            }
        }
        return true;
    }
    public void queuePrint(){
        if(this.isEmpty()){
            System.out.println("Leere Warteschlange.");
        }
        else{
            for (float f : warte) {
                if(f == 0){
                    break;
                }
                else{
                    System.out.println(f);
                }    
            }
        }    
        System.out.println();
    }
    public void clear(){
        for (float f : warte) {
            f = 0;
        }
    }
}    
