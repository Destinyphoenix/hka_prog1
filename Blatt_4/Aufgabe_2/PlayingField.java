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

    public boolean isGameOverX(){
        boolean uninterruptedX = true;
        for (int y = 0; y < yMax; y++) {
            uninterruptedX = true;
            for (int x = 1; x < xMax; x++) {
                if (fields[x][y].getStatus() != fields[x-1][y].getStatus() || fields[x][y].getStatus() == Status.E) {
                    uninterruptedX = false;
                    break;
                }
            }
            if (uninterruptedX) {
                System.out.println(fields[0][y].getStatus()+" Won");
                return true;
            }
        }
        return false;
    }
    public boolean isGameOverY(){
        boolean uninterruptedY = true;
        for (int x = 0; x < xMax; x++) {
            uninterruptedY = true;
            for (int y = 1; y < yMax; y++) {
                if (fields[x][y].getStatus() != fields[x][y-1].getStatus() || fields[x][y].getStatus() == Status.E) {
                    uninterruptedY = false;
                    break;
                }
            }
            if (uninterruptedY) {
                System.out.println(fields[x][0].getStatus()+" Won");
                return true;
            }
        }
        return false;
    }

    public boolean isGameOverD(){
        boolean uninterruptedD = true;

        for (int x = 1; x < xMax; x++) {
                if (fields[x][x].getStatus() != fields[x-1][x-1].getStatus() || fields[x][x].getStatus() == Status.E) {
                    uninterruptedD = false;
                    break;
                }
        }
        if (uninterruptedD) {
            System.out.println(fields[0][0].getStatus()+" Won");
            return true;
        }
        uninterruptedD = true;
       int x = 0;
        for (int y = yMax-1; y > 0; y--) {


            if (fields[x][y].getStatus() != fields[x+1][y -1].getStatus() || fields[x][y].getStatus() == Status.E) {
                uninterruptedD = false;
                break;
            }
            x++;
        }
            if (uninterruptedD) {
                System.out.println(fields[yMax-1][0].getStatus()+" Won");
                return true;
            }
        return false;
    }

public boolean isEmptySlotLeft(){
       for(Field[] field: fields){
           for(Field f: field){
               if(f.getStatus() == Status.E){
                   System.out.println("no Winner");
                   return true;
               }
           }
       }
       return false;
}

    public boolean isGameOver() {
        return isGameOverX() || isGameOverY() || isGameOverD() || !isEmptySlotLeft();
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
