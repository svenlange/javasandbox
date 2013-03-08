package za.co.svenlange.gameoflife;

/**
 * Grid
 *
 * @author Sven Lange
 */
public class Grid {

    private final State[][] grid;

    public Grid(int size) {
        this.grid = new State[size][size];
    }

    public int numberOfNeighbours(int i, int j) {
        int neighbours = 0;

        for (int x = calculatePosition(i); x <= i + 1 && x < grid.length; x++) {
            for (int y = calculatePosition(j); y <= j + 1 && y < grid.length; y++) {
                if (isCellAlive(x, y) && !(i == x && j == y)) {
                    neighbours++;
                }
            }
        }

        return neighbours;
    }

    private int calculatePosition(int position) {
        if (position > 0) {
            return position - 1;
        } else {
            return position;
        }
    }

    public void addCell(int x, int y) {
        grid[x][y] = State.ALIVE;
    }

    public Grid tick() {
        Grid nextGrid = new Grid(grid.length);

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {
                if (isAliveInNextGeneration(x, y)) {
                    nextGrid.addCell(x, y);
                }
            }
        }

        return nextGrid;
    }

    private boolean isAliveInNextGeneration(int x, int y) {
        if (isCellAlive(x, y)) {
            return !(numberOfNeighbours(x, y) < 2) && !(numberOfNeighbours(x, y) > 3);
        } else {
            return numberOfNeighbours(x, y) == 3;
        }
    }

    public boolean isCellAlive(int x, int y) {
        return grid[x][y] != null && grid[x][y] == State.ALIVE;
    }

    public int size() {
        return grid.length;
    }

    public static Grid getBlinkerGrid() {
        Grid grid = new Grid(6);
        grid.addCell(2, 2);
        grid.addCell(2, 3);
        grid.addCell(2, 4);
        return grid;
    }

    public static Grid getBeaconGrid() {
        Grid grid = new Grid(8);
        grid.addCell(1, 1);
        grid.addCell(1, 2);
        grid.addCell(2, 1);
        grid.addCell(2, 2);
        grid.addCell(3, 3);
        grid.addCell(3, 4);
        grid.addCell(4, 3);
        grid.addCell(4, 4);
        return grid;
    }

    public static Grid getOctagon2Grid() {
        Grid grid = new Grid(10);
        grid.addCell(4, 1);
        grid.addCell(5, 1);
        grid.addCell(3, 2);
        grid.addCell(6, 2);
        grid.addCell(2, 3);
        grid.addCell(7, 3);
        grid.addCell(1, 4);
        grid.addCell(8, 4);
        grid.addCell(1, 5);
        grid.addCell(8, 5);
        grid.addCell(2, 6);
        grid.addCell(7, 6);
        grid.addCell(3, 7);
        grid.addCell(6, 7);
        grid.addCell(4, 8);
        grid.addCell(5, 8);
        return grid;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {

                buffer.append(grid[x][y]);
                if (y != grid.length - 1) {
                    buffer.append(" | ");
                } else {
                    buffer.append("\n");
                }

            }
        }
        return buffer.toString();
    }

    private static enum State {
        ALIVE
    }
}
