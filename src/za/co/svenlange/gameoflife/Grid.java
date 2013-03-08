package za.co.svenlange.gameoflife;

import java.util.HashSet;
import java.util.Set;

import static za.co.svenlange.gameoflife.State.ALIVE;
import static za.co.svenlange.gameoflife.State.DEAD;

/**
 * Grid
 *
 * @author Sven Lange
 */
public class Grid {

    private final Cell[][] grid;

    public Grid(int size) {
        this.grid = new Cell[size][size];
    }

    public int numberOfNeighbours(int i, int j) {
        Set<Cell> neighbours = new HashSet<Cell>();

        for (int x = calculatePosition(i); x <= i + 1 && x < grid.length; x++) {
            for (int y = calculatePosition(j); y <= j + 1 && y < grid.length; y++) {
                if (grid[x][y] != null && grid[x][y].getState() != DEAD && !(i == x && j == y)) {
                    neighbours.add(grid[x][y]);
                }
            }
        }

        return neighbours.size();
    }

    private int calculatePosition(int position) {
        if (position > 0) {
            return position - 1;
        } else {
            return position;
        }
    }

    public void addCell(int x, int y) {
        grid[x][y] = new Cell(x, y);
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
        Cell cell;
        if (grid[x][y] == null) {
            cell = new Cell(x, y, DEAD);
        } else {
            cell = grid[x][y];
        }

        int neighbours = numberOfNeighbours(cell.getX(), cell.getY());
        if (cell.getState() == ALIVE) {
            return !(neighbours < 2) && !(neighbours > 3);
        } else {
            return neighbours == 3;
        }
    }

    public State getCellState(int x, int y) {
        if (grid[x][y] == null) {
            return DEAD;
        } else {
            return ALIVE;
        }
    }

    public int size() {
        return grid.length;
    }

    public static Grid getBlinkerGrid() {
        Grid grid = new Grid(8);
        grid.addCell(2, 2);
        grid.addCell(2, 3);
        grid.addCell(2, 4);
        grid.addCell(1, 1);
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
}
