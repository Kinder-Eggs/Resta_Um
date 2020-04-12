public class Piece {
    public boolean alive;
    private int pos;

    Piece(boolean alive) {
        this.alive = alive;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

}
