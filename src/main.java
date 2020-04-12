public class main {
    public static void main(String[] args) {
        CSVReader csv = new CSVReader();
        csv.setDataSource("C:/Users/gasni/IdeaProjects/Resta_Um/src/db/arq001.csv");
        String commands[] = csv.requestCommands();
        Table table = new Table();
        System.out.println("Tabuleiro Inicial:");
        table.printTable();
        for(int i = 0; i < commands.length; i++) {
            table.pieces[table.positions[csvToPos(commands[i].substring(0,2))]].setPos(csvToPos(commands[i].substring(3,5)));
            table.positions[csvToPos(commands[i].substring(0,2))] = csvToPos(commands[i].substring(3,5));
            table.positions[csvToPos(commands[i].substring(3,5))] = csvToPos(commands[i].substring(0,2));
            eat(commands[i], table);
            System.out.println();
            System.out.println("Source: " + commands[i].substring(0,2));
            System.out.println("Target: " + commands[i].substring(3,5));
            table.printTable();
        }
    }

    private static int csvToPos(String coord) {
        char col = coord.charAt(0);
        int lin = Integer.parseInt(coord.substring(1,2));
        if (col == 'a'){
            return (-(lin - 6) * 7) - 1;
        }
        if (col == 'b'){
            return -(lin - 6) * 7;
        }
        if (col == 'c'){
            if(lin > 5) {
                return -(lin-7) * 3;
            } else if(lin < 3) {
                return -(lin-11) * 3;
            } else {
                return (-(lin - 6) * 7) + 1;
            }
        }
        if (col == 'd'){
            if(lin > 5) {
                return (-(lin-7) * 3) + 1;
            } else if(lin < 3) {
                return (-(lin-11) * 3) + 1;
            } else {
                return (-(lin - 6) * 7) + 2;
            }
        }
        if (col == 'e'){
            if(lin > 5) {
                return (-(lin-7) * 3) + 2;
            } else if(lin < 3) {
                return (-(lin-11) * 3) + 2;
            } else {
                return (-(lin - 6) * 7) + 3;
            }
        }
        if (col == 'f'){
            return (-(lin - 6) * 7) + 4;
        }
        if (col == 'g'){
            return (-(lin - 6) * 7) + 5;
        }
        return -1;
    }

    private static void eat(String coord, Table table) {
        char col1 = coord.charAt(0);
        int lin1 = Integer.parseInt(coord.substring(1,2));
        char col2 = coord.charAt(3);
        int lin2 = Integer.parseInt(coord.substring(4,5));
        if(col1 == col2) {
            table.pieces[table.positions[csvToPos(coord.substring(0,1) + (lin1+lin2)/2)]].alive = false;
        } else {
            table.pieces[table.positions[csvToPos(Character.toString(((char)((int) col1 + (int) col2))/2) + lin1)]].alive = false;
        }
    }
}
