import java.util.Random;

public class Rabbit extends Makhluk {
    public Rabbit(int x, int y) {
        super(x, y);
    }

    @Override
    public void bergerak(int gridSize) {
        // Pergerakan kelinci (acak ke arah yang valid)
        Random rand = new Random();
        x = Math.max(0, Math.min(gridSize - 1, x + rand.nextInt(3) - 1)); // -1, 0, 1
        y = Math.max(0, Math.min(gridSize - 1, y + rand.nextInt(3) - 1));
    }
}
