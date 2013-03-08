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

    public Grid(int size) {
        this.grid = new Cell[size][size];
    }
    public Grid() {
        this(5);
    }

    private Cell[][] grid;

    public Set<Cell> getNeighbours(int i, int j) {
        Set<Cell> neighbours = new HashSet<Cell>();

        for (int x = calculatePosition(i); x <= i + 1 && x < grid.length; x++) {
            for (int y = calculatePosition(j); y <= j + 1 && y < grid.length; y++) {
                if (grid[x][y] != null && grid[x][y].getState() != DEAD && !(i==x && j==y)) {
                    neighbours.add(grid[x][y]);
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

    public void addCell(Cell cell) {
        grid[cell.getX()][cell.getY()] = cell;
    }

    private boolean isAliveInNextGeneration(int x, int y) {
        Cell cell;
        if (grid[x][y] == null) {
            cell = new Cell(x, y, DEAD);
        } else {
            cell = grid[x][y];
        }

        Set<Cell> neighbours = getNeighbours(cell.getX(), cell.getY());
        if (cell.getState() == ALIVE) {
            return !(neighbours.size() < 2) && !(neighbours.size() > 3);
        } else {
            return neighbours.size() == 3;
        }
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

    public Grid tick() {

        Grid nextGrid = new Grid(grid.length);

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {
                if (isAliveInNextGeneration(x, y)) {
                    nextGrid.addCell(new Cell(x, y));
                }
            }
        }

        return nextGrid;
    }

    public Cell getCell(int x, int y) {
        if (grid[x][y] == null) {
            return new Cell(x, y, DEAD);
        }
        return grid[x][y];
    }
}
