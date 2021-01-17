public class Punkt {
    
    private int x;
    private int y;
    private String farbe;

    Punkt(int u, int v){
        x = u;
        y = v;
    }

    //setter methods for variables x, y, farbe
    public void setX(int i){ x = i;}
    public void setY(int i){ y = i;}
    public void setFarbe(String s){farbe = s;}

    //getter methods for variables x, y , farbe
    public int getX(){ return x; }
    public int getY(){ return y; }
    public String getFarbe(){return farbe;}


    //Aufgabe c)
    //Print the values of the current point, in a desired format
    public void print(){        
        System.out.format("(x= %d; y= %d; farbe= %s)", x, y, farbe);
    }

    //Aufgabe d)
    //Increase the current X and Y values 1
    public void verschiebeUmEins(){
        x++;
        y++;
    }

    //Aufgabe e)
    //Method to change the location of the point
    public void verschiebe(int delX, int delY){
        x = x + delX;
        y = y + delY;
    }

    //Aufgabe g)
    //Set the X and Y values to 0
    public void defaultValues(){
        this.setX(0);
        this.setY(0);
    }

    //Aufgabe h)
    //Method to calculate distance between two points using Pythagoras Theorem
    public double berechneDistanz(Punkt p){
        double a = Math.pow((this.x - p.x), 2);
        double b = Math.pow((this.y - p.y), 2);

        double distanz = Math.sqrt(a+b);

        return distanz;
    }

    //Aufgabe i)
    //Method to print the distance between two points in a custom format.
    public void printDistanz(Punkt p1, Punkt p2, double distanz){
        System.out.print("Der Abstand zwischen dem ersten Punkt ");
        p1.print();
        System.out.println();
        System.out.print("und dem zweiten Punkt ");
        p2.print();
        System.out.println();
        System.out.format("beträgt %.2f%n", distanz);
    }
}
