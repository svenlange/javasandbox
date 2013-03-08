package za.co.svenlange.gameoflife;

/**
 * PredefinedGrids
 *
 * @author Sven Lange
 */
public class PredefinedGrids {
    public static Grid getBlinkerGrid() {
        GridImpl grid = new GridImpl(6);
        grid.addCell(2, 2);
        grid.addCell(2, 3);
        grid.addCell(2, 4);
        return grid;
    }

    public static Grid getBeaconGrid() {
        GridImpl grid = new GridImpl(8);
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
        GridImpl grid = new GridImpl(10);
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
}
