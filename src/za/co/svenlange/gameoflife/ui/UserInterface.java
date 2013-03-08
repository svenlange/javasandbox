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
import za.co.svenlange.gameoflife.Grid;
import za.co.svenlange.gameoflife.PredefinedGrids;

public class UserInterface extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Conway's Game of Life");

        final GridPane gridPane = GridPaneBuilder.create()
                .padding(new Insets(4))
                .gridLinesVisible(true)
                .focusTraversable(true)
                .build();

        Grid grid = PredefinedGrids.getOctagon2Grid();

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

    private void populateGridPane(GridPane gridPane, Grid grid) {
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.size(); j++) {

                Color color = getColor(grid.isCellAlive(i, j));

                Rectangle rectangle = RectangleBuilder.create()
                        .height(15)
                        .width(15)
                        .fill(color)
                        .build();


                gridPane.add(rectangle, i, j);
            }
        }
    }

    private Color getColor(boolean cellAlive) {
        if (cellAlive) {
            return Color.BROWN;
        } else {
            return Color.ANTIQUEWHITE;
        }
    }

    public static void main(String[] args) {
        launch();
    }


}
