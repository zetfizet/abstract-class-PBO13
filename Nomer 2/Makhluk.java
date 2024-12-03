// Abstract class Makhluk
public abstract class Makhluk {
    protected int x, y; // Posisi makhluk dalam grid

    public Makhluk(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Abstract method untuk pergerakan
    public abstract void bergerak(int gridSize);

    // Getter untuk posisi
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
