public class Table {
    Piece[] pieces = {new Piece(true), new Piece(true), new Piece(true), new Piece(true),
            new Piece(true), new Piece(true), new Piece(true), new Piece(true),
            new Piece(true), new Piece(true), new Piece(true), new Piece(true),
            new Piece(true), new Piece(true) ,new Piece(true) ,new Piece(true),
            new Piece(false), new Piece(true), new Piece(true), new Piece(true),
            new Piece(true), new Piece(true), new Piece(true), new Piece(true),
            new Piece(true), new Piece(true), new Piece(true), new Piece(true),
            new Piece(true), new Piece(true), new Piece(true), new Piece(true),
            new Piece(true)};
    int[] positions = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
            27, 28, 29, 30, 31, 32};


    Table() {
        for(int i = 0; i < 33; i++) {
            pieces[i].setPos(i);
        }
    }

    void printTable() {
        System.out.print("7     ");
        int i = 0;
        while(i < 3) {
            if (pieces[positions[i]].alive) {
                System.out.print("P");
            } else {
                System.out.print("-");
            }
            System.out.print(" ");
            i++;
        }
        System.out.println("    ");
        System.out.print("6     ");
        while(i < 6) {
            if (pieces[positions[i]].alive) {
                System.out.print("P");
            } else {
                System.out.print("-");
            }
            System.out.print(" ");
            i++;
        }
        System.out.println("    ");
        System.out.print("5 ");
        while(i < 13) {
            if (pieces[positions[i]].alive) {
                System.out.print("P");
            } else {
                System.out.print("-");
            }
            System.out.print(" ");
            i++;
        }
        System.out.println();
        System.out.print("4 ");
        while(i < 20) {
            if (pieces[positions[i]].alive) {
                System.out.print("P");
            } else {
                System.out.print("-");
            }
            System.out.print(" ");
            i++;
        }
        System.out.println();
        System.out.print("3 ");
        while(i < 27) {
            if (pieces[positions[i]].alive) {
                System.out.print("P");
            } else {
                System.out.print("-");
            }
            System.out.print(" ");
            i++;
        }
        System.out.println();
        System.out.print("2     ");
        while(i < 30) {
            if (pieces[positions[i]].alive) {
                System.out.print("P");
            } else {
                System.out.print("-");
            }
            System.out.print(" ");
            i++;
        }
        System.out.println();
        System.out.print("1     ");
        while(i < 33) {
            if (pieces[positions[i]].alive) {
                System.out.print("P");
            } else {
                System.out.print("-");
            }
            System.out.print(" ");
            i++;
        }
        System.out.println();
        System.out.println("  a b c d e f g");
    }
}
