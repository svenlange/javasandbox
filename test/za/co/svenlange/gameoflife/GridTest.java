package za.co.svenlange.gameoflife;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GridTest {

    @Test
    public void neighbourCountIsZero() throws Exception {
        Grid grid = new Grid(5);
        grid.addCell(new Cell(1, 1));
        assertEquals(0, grid.getNeighbours(1, 1).size());
    }

    @Test
    public void neighbourCountIsOne() throws Exception {
        Grid grid = new Grid(5);
        grid.addCell(new Cell(0, 0));
        grid.addCell(new Cell(1, 1));
        assertEquals(1, grid.getNeighbours(1, 1).size());
    }

    @Test
    public void neighbourCountIsTwo() throws Exception {
        Grid grid = new Grid(5);
        grid.addCell(new Cell(0, 0));
        grid.addCell(new Cell(1, 1));
        grid.addCell(new Cell(2, 2));
        assertEquals(2, grid.getNeighbours(1, 1).size());
    }

    @Test
    public void neighbourCountIsThree() throws Exception {
        Grid grid = new Grid(5);
        grid.addCell(new Cell(0, 0));
        grid.addCell(new Cell(1, 1));
        grid.addCell(new Cell(0, 1));
        grid.addCell(new Cell(2, 2));
        assertEquals(3, grid.getNeighbours(1, 1).size());
    }

    @Test
    public void initializeEmptyGrid() throws Exception {
        Grid grid = new Grid(5);
        grid.addCell(new Cell(2, 1));
        grid.addCell(new Cell(2, 2));
        grid.addCell(new Cell(2, 3));
        System.out.println(grid);
        System.out.println("\n\n\n");
        grid = grid.tick();
        System.out.println(grid);
        System.out.println("\n\n\n");
        grid = grid.tick();
        System.out.println(grid);
    }
}
