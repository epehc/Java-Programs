public class TestSeminarraum {
    
    public static void main(String[] args) {
        Seminarraum first = new Seminarraum("Seminarraum_1", 30, 100);
        Seminarraum second = new Seminarraum("Seminarraum_2", 30, 40);

        first.control();
        second.control();
        first.equals(second);

        System.out.println();

        first.erhoeheStuehle();
        second.verringernStuehle();
        first.equals(second);
    }
    
}
