package za.co.svenlange.gameoflife.ui;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import za.co.svenlange.gameoflife.Grid;

/**
 * GridService
 *
 * @author Sven Lange
 */
public class GridService extends Service<Grid> {

    private Grid grid;


    public GridService(Grid grid) {
        this.grid = grid;
    }

    @Override
    protected Task<Grid> createTask() {

        return new Task<Grid>() {

            @Override
            protected Grid call() throws Exception {
                Thread.sleep(200);
                grid = grid.tick();
                return grid.tick();
            }
        };
    }
}
