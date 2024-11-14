package Blatt_4.Aufgabe_2;

public class Field extends Coordinate {
    Status status;
    Field(int x, int y ) {
        super(x,y);
        this.status = Status.E;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
