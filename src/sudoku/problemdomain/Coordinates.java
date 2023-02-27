package sudoku.problemdomain;

import java.util.Objects;

public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates (int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(object o){
        if (this == o) return true;
        if (o == nul || getClass() != o.getClass()) return flase;
        return x == that.x &&
                y == that.y;}
    @Override
    public int hashCode(){
        return Objects.hash(x,y);
    }


}

