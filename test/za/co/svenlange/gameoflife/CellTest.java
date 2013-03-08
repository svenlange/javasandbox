package za.co.svenlange.gameoflife;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static za.co.svenlange.gameoflife.State.ALIVE;
import static za.co.svenlange.gameoflife.State.DEAD;

public class CellTest {

    private Grid grid;

    @Before
    public void setUp() throws Exception {
        grid = new Grid(8);
        grid.addCell(1, 1);
    }

    @Test
    public void liveCellWithZeroLiveNeighboursDies() {
        grid = grid.tick();
        assertEquals(DEAD, grid.getCellState(1, 1));
    }

    @Test
    public void liveCellWithOneLiveNeighboursDies() {
        grid.addCell(0, 1);
        grid = grid.tick();
        assertEquals(DEAD, grid.getCellState(1, 1));
    }

    @Test
    public void liveCellWithTwoLiveNeighboursLivesOn() {
        grid.addCell(0, 0);
        grid.addCell(0, 1);
        grid = grid.tick();
        assertEquals(ALIVE, grid.getCellState(1, 1));
    }

    @Test
    public void liveCellWithThreeLiveNeighboursLivesOn() {
        grid.addCell(0, 0);
        grid.addCell(0, 1);
        grid.addCell(0, 2);
        grid = grid.tick();
        assertEquals(ALIVE, grid.getCellState(1, 1));
    }

    @Test
    public void liveCellWithFourLiveNeighboursDies() throws Exception {
        grid.addCell(0, 0);
        grid.addCell(0, 1);
        grid.addCell(0, 2);
        grid.addCell(1, 2);
        grid = grid.tick();
        assertEquals(DEAD, grid.getCellState(1, 1));
    }

    @Test
    public void deadCellWithExactlyThreeLiveNeighboursBecomesLiveCell() {
        grid.addCell(0, 5);
        grid.addCell(0, 6);
        grid.addCell(0, 7);
        grid = grid.tick();
        assertEquals(ALIVE, grid.getCellState(1, 6));
    }
}
