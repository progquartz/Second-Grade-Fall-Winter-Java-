package sample;

import Lab05.Circle;
import Lab05.GeometricObject;
import Lab05.ResizableCircle;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Lab07Test extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();
        Scene scene = new Scene(root);
        Button button1 = new Button("Feature 1");
        Button button2 = new Button("Feature 2");
        Button button3 = new Button("Feature 3");
        button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                new JavaFXCalculator().displaycalculator2();
            }
        });
        button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //new JavaFXCalculator().displayCalculator();
                DBGUI db = new DBGUI();
                db.displayDBGUI();
                //new DBGUI().displayDBGUI();
            }
        });
        button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //new JavaFXCalculator().displayCalculator();
                new LabsGUI().displayLabsGUI();
            }
        });
        root.getChildren().addAll(button1,button2,button3);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Lab07");
        primaryStage.show();


    }


}
