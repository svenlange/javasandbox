package za.co.svenlange.gameoflife;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GridTest {

    private Grid grid;

    @Before
    public void setUp() throws Exception {
        grid = new Grid(8);
    }

    @Test
    public void neighbourCountIsZero() throws Exception {
        grid.addCell(1, 1);
        assertEquals(0, grid.numberOfNeighbours(1, 1));
    }

    @Test
    public void neighbourCountIsOne() throws Exception {
        grid.addCell(0, 0);
        grid.addCell(1, 1);
        assertEquals(1, grid.numberOfNeighbours(1, 1));
    }

    @Test
    public void neighbourCountIsTwo() throws Exception {
        grid.addCell(0, 0);
        grid.addCell(1, 1);
        grid.addCell(2, 2);
        assertEquals(2, grid.numberOfNeighbours(1, 1));
    }

    @Test
    public void neighbourCountIsThree() throws Exception {
        grid.addCell(0, 0);
        grid.addCell(1, 1);
        grid.addCell(0, 1);
        grid.addCell(2, 2);
        assertEquals(3, grid.numberOfNeighbours(1, 1));
    }

    @Test
    public void liveCellWithZeroLiveNeighboursDies() {
        grid.addCell(1, 1);
        grid = grid.tick();
        assertFalse(grid.isCellAlive(1, 1));
    }

    @Test
    public void liveCellWithOneLiveNeighboursDies() {
        grid.addCell(0, 1);
        grid.addCell(1, 1);
        grid = grid.tick();
        assertFalse(grid.isCellAlive(1, 1));
    }

    @Test
    public void liveCellWithTwoLiveNeighboursLivesOn() {
        grid.addCell(0, 0);
        grid.addCell(0, 1);
        grid.addCell(1, 1);
        grid = grid.tick();
        assertEquals(true, grid.isCellAlive(1, 1));
    }

    @Test
    public void liveCellWithThreeLiveNeighboursLivesOn() {
        grid.addCell(0, 0);
        grid.addCell(0, 1);
        grid.addCell(0, 2);
        grid.addCell(1, 1);
        grid = grid.tick();
        assertTrue(grid.isCellAlive(1, 1));
    }

    @Test
    public void liveCellWithFourLiveNeighboursDies() throws Exception {
        grid.addCell(0, 0);
        grid.addCell(0, 1);
        grid.addCell(0, 2);
        grid.addCell(1, 2);
        grid.addCell(1, 1);
        grid = grid.tick();
        assertFalse(grid.isCellAlive(1, 1));
    }

    @Test
    public void deadCellWithExactlyThreeLiveNeighboursBecomesLiveCell() {
        grid.addCell(0, 5);
        grid.addCell(0, 6);
        grid.addCell(0, 7);
        grid = grid.tick();
        assertEquals(true, grid.isCellAlive(1, 6));
    }

    @Test
    public void printBlinkerToConsole() throws Exception {
        grid = Grid.getBlinkerGrid();
        System.out.println(grid + "\n\n\n");
        grid = grid.tick();
        System.out.println(grid + "\n\n\n");
        grid = grid.tick();
        System.out.println(grid);
    }
}
