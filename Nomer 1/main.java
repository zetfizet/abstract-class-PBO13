public class main {
    public static void main(String[] args) {
        // Objek Manusia
        Manusia manusia = new Manusia();
        manusia.bernafas();
        manusia.makan();
        manusia.berbicara();

        System.out.println();

        // Objek Hewan
        Hewan hewan = new Hewan();
        hewan.bernafas();
        hewan.makan();
        hewan.berburu();

        System.out.println();

        // Objek Tumbuhan
        Tumbuhan tumbuhan = new Tumbuhan();
        tumbuhan.bernafas();
        tumbuhan.makan();
        tumbuhan.berfotosintesis();
    }
}