public class Piece {
    boolean alive;
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

    public int move(char col, int lin) { // Receives a column char and line number to change and return the new position value
        if (col == 'a'){
            this.pos = (-(lin - 6) * 7) - 1;
            return this.pos;
        }
        if (col == 'b'){
            this.pos = -(lin - 6) * 7;
            return this.pos;
        }
        if (col == 'c'){
            if(lin > 5) {
                this.pos = -(lin-7) * 3;
                return this.pos;
            } else if(lin < 3) {
                this.pos = -(lin-11) * 3;
                return this.pos;
            } else {
                this.pos = (-(lin - 6) * 7) + 1;
                return this.pos;
            }
        }
        if (col == 'd'){
            if(lin > 5) {
                this.pos = (-(lin-7) * 3) + 1;
                return this.pos;
            } else if(lin < 3) {
                this.pos = (-(lin-11) * 3) + 1;
                return this.pos;
            } else {
                this.pos = (-(lin - 6) * 7) + 2;
                return this.pos;
            }
        }
        if (col == 'e'){
            if(lin > 5) {
                this.pos = (-(lin-7) * 3) + 2;
                return this.pos;
            } else if(lin < 3) {
                this.pos = (-(lin-11) * 3) + 2;
                return this.pos;
            } else {
                this.pos = (-(lin - 6) * 7) + 3;
                return this.pos;
            }
        }
        if (col == 'f'){
            this.pos = (-(lin - 6) * 7) + 4;
            return this.pos;
        }
        if (col == 'g'){
            this.pos = (-(lin - 6) * 7) + 5;
            return this.pos;
        }
        return -1;
    }
}
