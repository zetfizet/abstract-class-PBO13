import java.util.Random;

public class Fox extends Makhluk {
    public Fox(int x, int y) {
        super(x, y);
    }

    @Override
    public void bergerak(int gridSize) {
        // Pergerakan rubah (lebih cepat, acak lebih jauh)
        Random rand = new Random();
        x = Math.max(0, Math.min(gridSize - 1, x + rand.nextInt(5) - 2)); // -2, -1, 0, 1, 2
        y = Math.max(0, Math.min(gridSize - 1, y + rand.nextInt(5) - 2));
    }
}
