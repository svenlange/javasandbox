package za.co.svenlange.gameoflife;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static za.co.svenlange.gameoflife.State.ALIVE;
import static za.co.svenlange.gameoflife.State.DEAD;

public class CellTest {

    private Grid grid;
    private Cell cell;

    @Before
    public void setUp() throws Exception {
        cell = new Cell(1, 1);

        grid = new Grid(5);
        grid.addCell(cell);
    }

    @Test
    public void liveCellWithZeroLiveNeighboursDies() {
        grid = grid.tick();
        assertEquals(DEAD, grid.getCell(1, 1).getState());
    }

    @Test
    public void liveCellWithOneLiveNeighboursDies() {
        grid.addCell(new Cell(0, 1));
        grid = grid.tick();
        assertEquals(DEAD, grid.getCell(1, 1).getState());
    }

    @Test
    public void liveCellWithTwoLiveNeighboursLivesOn() {
        grid.addCell(new Cell(0, 0));
        grid.addCell(new Cell(0, 1));
        grid = grid.tick();
        assertEquals(ALIVE, grid.getCell(1, 1).getState());
    }

    @Test
    public void liveCellWithThreeLiveNeighboursLivesOn() {
        grid.addCell(new Cell(0, 0));
        grid.addCell(new Cell(0, 1));
        grid.addCell(new Cell(0, 2));
        grid = grid.tick();
        assertEquals(ALIVE, grid.getCell(1, 1).getState());
    }

    @Test
    public void liveCellWithFourLiveNeighboursDies() throws Exception {
        grid.addCell(new Cell(0, 0));
        grid.addCell(new Cell(0, 1));
        grid.addCell(new Cell(0, 2));
        grid.addCell(new Cell(1, 2));
        grid = grid.tick();
        assertEquals(DEAD, grid.getCell(1, 1).getState());
    }

    @Test
    public void deadCellWithExactlyThreeLiveNeighboursBecomesLiveCell() {
        cell.setState(DEAD);
        grid.addCell(new Cell(0, 0));
        grid.addCell(new Cell(0, 1));
        grid.addCell(new Cell(0, 2));
        grid = grid.tick();
        assertEquals(ALIVE, grid.getCell(1, 1).getState());
    }
}
