public class Konto{
    private int kontonummer;
    private String kontoinhaber;
    private double saldo;

    public String getKontoinhaber(){
        return kontoinhaber;
    }
    public void setKontoinhaber(String name){
        kontoinhaber = name;
    }    
    public int getKontonummer(){
        return kontonummer;
    }
    public void setKontonummer(int nr){
        kontonummer = nr;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double betrag){
        saldo = betrag;
    }
    public void zahlEin(double betrag){
        System.out.println("Einzahlung: " + betrag);
        saldo += betrag;
        this.infoKontonummer();
    }
    public void zahlAus(double betrag){
        System.out.println("Auszahlung: " + betrag);
        saldo -= betrag;
        this.infoKontonummer();
    }
    public void infoKontoinhaber(){
        System.out.print("KontoinhaberIn: " + kontoinhaber + "    Kontonummer: " + kontonummer + "\n");
    
    }
    public void infoKontonummer(){
        System.out.println("Kontonummer: "+ kontonummer + "     Saldo: " + saldo);

    }
}    