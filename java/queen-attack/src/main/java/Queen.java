public class Queen {
    int x;
    int y;

    public Queen(int x, int y) {
        if(x < 0) throw new IllegalArgumentException("Queen position must have positive row.");
        if(x > 7) throw new IllegalArgumentException("Queen position must have row <= 7.");
        this.x = x;
        if(y < 0) throw new IllegalArgumentException("Queen position must have positive column.");
        if(y > 7) throw new IllegalArgumentException("Queen position must have column <= 7.");
        this.y = y;
    }
}
