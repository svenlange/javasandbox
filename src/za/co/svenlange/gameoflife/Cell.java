package za.co.svenlange.gameoflife;

import static za.co.svenlange.gameoflife.State.ALIVE;

/**
 * Cell
 *
 * @author Sven Lange
 */
public class Cell {

    private final int x;
    private final int y;
    private State state = ALIVE;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Cell(int x, int y, State state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        return x == cell.x && y == cell.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return getX() + ", " + getY() + ", " + getState().toString();
    }
}
