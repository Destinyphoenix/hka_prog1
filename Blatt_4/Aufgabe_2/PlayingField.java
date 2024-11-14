package Blatt_4.Aufgabe_2;

public class PlayingField {
    int xMax;
    int yMax;
   private Field[][]  fields;

   PlayingField(int xMax, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
        this.fields = new Field[xMax][yMax];

        for (int x = 0; x < xMax; x++) {
            for (int y = 0; y < yMax; y++) {
                fields[x][y] = new Field(x,y);
            }
        }
    }

    public Field[][] getPlayingField() {
        return fields;
    }

    public void printPlayingField() {
        System.out.println();
        System.out.println("x    0   1   2  ");
        System.out.println("     ---------");
        for (int y = 0; y < yMax; y++) {
            System.out.print("y"+y+"|");
            for (int x = 0; x < yMax; x++) {
                System.out.print("  "+fields[x][y].getStatus()+" ");
            }
            System.out.println();
        }
    }

    public boolean isTurnValid(int x, int y, Status status) {
       if(x >= xMax || y >= yMax || x < 0 || y < 0) {
           return false;
       }
        return fields[x][y].getStatus() == Status.E;
    }

    public boolean setField(int x, int y, Status status) {
       if(isTurnValid(x, y,status)) {
           fields[x][y].setStatus(status);
           return true;
       }
        System.out.println("invalid turn, try again");
       return false;
    }
}
