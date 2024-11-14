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
        for (int x = 0; x < xMax; x++) {
            for (int y = 0; y < yMax; y++) {
                System.out.print("  "+fields[x][y].getStatus()+" ");
            }
            System.out.println();
        }
    }

    public void setField(int x, int y, Status status) {
        fields[x][y].setStatus(status);
    }
}
