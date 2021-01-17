public class TestKonto {
    
    public static void kontoVergleich(Konto k1, Konto k2){
        double stand1 = k1.getKontostand();
        double stand2 = k2.getKontostand();

        if(stand1 == stand2){
            System.out.println("Beide Konten haben gleich Geld in Ihren Konten");
        }
        else if(stand1 > stand2){
            System.out.println(k1.getPersonName() + " hat mehr geld auf dem Konto als " + k2.getPersonName());
        }
        else{
            System.out.println(k2.getPersonName() + " hat mehr geld auf dem Konto als " + k1.getPersonName());
        }
    }
    public static void main(String[] args) {
        Konto konto1 = new Konto("Mueller", "Hans", 500);
        Konto konto2 = new Konto("Krause", "Peter", 1500);
        Konto konto3 = new Konto("Boehm", "Harald", 330);

        kontoVergleich(konto1, konto2);
        kontoVergleich(konto2, konto3);
        kontoVergleich(konto1, konto3);
        System.out.println();
        konto2.ueberweise(konto1, 5000);
    }
}
