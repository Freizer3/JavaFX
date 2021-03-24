package ee.khk;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.layout.*;
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
        Label headerLbl = new Label("Press the login button");
        Label statusLbl = new Label("Start screen");
        Button loginBtn = new Button("Login");

        StackPane root = new StackPane(headerLbl, statusLbl, loginBtn);






        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);

        stage.setTitle("Stackpane in JavaFX");

        stage.show();
    }
}



