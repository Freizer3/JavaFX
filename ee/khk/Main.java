package ee.khk;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
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
    @Override
    public void start(Stage stage) {
        Label label1 = new Label("Label1");
        Label label2 = new Label("Label2");
        Label label3 = new Label("Label3");
        Label label4 = new Label("Label4");
        Label label5 = new Label("Label5");
        Label label6 = new Label("Label6");
        Label label7 = new Label("Label7");

        HBox root = new HBox(10, label1, label2, label3, label4, label5, label6, label7);

        Scene scene = new Scene(root, 500, 150);
        stage.setScene(scene);

        stage.setTitle("HBox in JavaFX");

        stage.show();
    }
}



