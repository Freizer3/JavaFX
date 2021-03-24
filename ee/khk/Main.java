package ee.khk;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Parent;


public class Main extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }
    public void start(Stage stage) {
        Label lbl = new Label("Hello");
        Button btn = new Button("Click");

        FlowPane root = new FlowPane();
        root.getChildren().addAll(lbl, btn);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);

        stage.setTitle("Layout in JavaFX");
        stage.show();
    }
}



