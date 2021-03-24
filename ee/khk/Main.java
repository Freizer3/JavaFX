package ee.khk;

import javafx.application.Application;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Main extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }
    public void start(Stage stage) {
        Label label = new Label("Hello");
        Button button = new Button("Button");
        Group group = new Group(button);

        FlowPane root = new FlowPane(label, group);
        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();
    }
}



