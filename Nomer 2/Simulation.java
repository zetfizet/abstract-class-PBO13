public class Simulation {
    private static final int GRID_SIZE = 10; // Ukuran grid
    private static final int STEPS = 5; // Jumlah langkah simulasi

    public static void main(String[] args) {
        // Inisialisasi makhluk
        Rabbit rabbit = new Rabbit(5, 5);
        Fox fox = new Fox(0, 0);

        // Jalankan simulasi
        for (int step = 1; step <= STEPS; step++) {
            // Bersihkan layar grid
            char[][] grid = new char[GRID_SIZE][GRID_SIZE];
            for (int i = 0; i < GRID_SIZE; i++) {
                for (int j = 0; j < GRID_SIZE; j++) {
                    grid[i][j] = '.';
                }
            }

            // Perbarui posisi makhluk di grid
            grid[rabbit.getX()][rabbit.getY()] = 'R'; // R untuk Rabbit
            grid[fox.getX()][fox.getY()] = 'F'; // F untuk Fox

            // Cetak grid
            System.out.println("Penggerakan ke-" + step + ":");
            for (int i = 0; i < GRID_SIZE; i++) {
                for (int j = 0; j < GRID_SIZE; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }

            // Gerakkan makhluk
            rabbit.bergerak(GRID_SIZE);
            fox.bergerak(GRID_SIZE);

            System.out.println();
        }
    }
}
