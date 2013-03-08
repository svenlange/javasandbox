package za.co.svenlange.gameoflife.ui;

import javafx.application.Application;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.GridPaneBuilder;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.RectangleBuilder;
import javafx.stage.Stage;
import za.co.svenlange.gameoflife.Cell;
import za.co.svenlange.gameoflife.Grid;
import za.co.svenlange.gameoflife.State;

public class UserInterface extends Application {

    private static final int SIZE = 10;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Conway's Game of Life");

        final GridPane gridPane = GridPaneBuilder.create()
                .padding(new Insets(4))
                .gridLinesVisible(true)
                .focusTraversable(true)
                .build();

//        Grid grid = getBlinkerGrid();
//        Grid grid = getBeaconGrid();
        Grid grid = getOctagon2Grid();

        populateGridPane(gridPane, grid);

        stage.setScene(new Scene(gridPane));
        stage.show();


        final GridService service = new GridService(grid);
        service.start();

        service.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent workerStateEvent) {
                Grid grid = (Grid) workerStateEvent.getSource().getValue();
                populateGridPane(gridPane, grid);
                service.restart();
            }
        });

    }

    private Grid getOctagon2Grid() {
        Grid grid = new Grid(SIZE);
        grid.addCell(new Cell(4, 1));
        grid.addCell(new Cell(5, 1));
        grid.addCell(new Cell(3, 2));
        grid.addCell(new Cell(6, 2));
        grid.addCell(new Cell(2, 3));
        grid.addCell(new Cell(7, 3));
        grid.addCell(new Cell(1, 4));
        grid.addCell(new Cell(8, 4));
        grid.addCell(new Cell(1, 5));
        grid.addCell(new Cell(8, 5));
        grid.addCell(new Cell(2, 6));
        grid.addCell(new Cell(7, 6));
        grid.addCell(new Cell(3, 7));
        grid.addCell(new Cell(6, 7));
        grid.addCell(new Cell(4, 8));
        grid.addCell(new Cell(5, 8));
        return grid;
    }

    private Grid getBeaconGrid() {
        Grid grid = new Grid(SIZE);
        grid.addCell(new Cell(1, 1));
        grid.addCell(new Cell(1, 2));
        grid.addCell(new Cell(2, 1));
        grid.addCell(new Cell(2, 2));
        grid.addCell(new Cell(3, 3));
        grid.addCell(new Cell(3, 4));
        grid.addCell(new Cell(4, 3));
        grid.addCell(new Cell(4, 4));
        return grid;
    }

    private Grid getBlinkerGrid() {
        Grid grid = new Grid(SIZE);
        grid.addCell(new Cell(2, 2));
        grid.addCell(new Cell(2, 3));
        grid.addCell(new Cell(2, 4));
        grid.addCell(new Cell(1, 1));
        return grid;
    }

    private void populateGridPane(GridPane gridPane, Grid grid) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                Rectangle rectangle = RectangleBuilder.create()
                        .height(15)
                        .width(15)
                        .fill(getColor(i, j, grid))
                        .build();


                gridPane.add(rectangle, i, j);
            }
        }
    }

    private Color getColor(int i, int j, Grid grid) {
        Color color;
        if (grid.getCell(i, j).getState() == State.ALIVE) {
            color = Color.BROWN;
        } else {
            color = Color.ANTIQUEWHITE;
        }
        return color;
    }

    public static void main(String[] args) {
        launch();
    }


}
