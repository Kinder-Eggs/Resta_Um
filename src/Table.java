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

    void printTable() {
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 8; j++) {
                if (j == 0) {
                    System.out.print(-(i - 7));
                } else {
                   switch (i){
                       case 0:
                           if (j != 1 && j != 2 && j != 6 && j != 7){
                               if(pieces[j-3].alive) {
                                   System.out.print("P");
                               } else {
                                   System.out.print("-");
                               }
                           } else {
                               System.out.print(" ");
                           }break;
                       case 1:
                           if (j != 1 && j != 2 && j != 6 && j != 7) {
                               if(pieces[j].alive) {
                                   System.out.print("P");
                               } else {
                                   System.out.print("-");
                               }
                           } else {
                               System.out.print(" ");
                           }break;
                       case 2:
                           if(pieces[j+5].alive) {
                               System.out.print("P");
                           } else {
                               System.out.print("-");
                           }break;
                       case 3:
                           if(pieces[j+12].alive) {
                               System.out.print("P");
                           } else {
                               System.out.print("-");
                           }break;
                       case 4:
                           if(pieces[j+19].alive) {
                               System.out.print("P");
                           } else {
                               System.out.print("-");
                           }break;
                       case 5:
                           if (j != 1 && j != 2 && j != 6 && j != 7) {
                               if(pieces[j+24].alive) {
                                   System.out.print("P");
                               } else {
                                   System.out.print("-");
                               }
                           } else {
                               System.out.print(" ");
                           }break;
                       case 6:
                           if (j != 1 && j != 2 && j != 6 && j != 7) {
                               if(pieces[j+27].alive) {
                                   System.out.print("P");
                               } else {
                                   System.out.print("-");
                               }
                           } else {
                               System.out.print(" ");
                           }break;
                    }
                }
                if(i < 6 || j < 5) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g");
    }
}
