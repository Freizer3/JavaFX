package ee.khk;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class Main extends Application{
    public static void main(String[] args){
        System.out.println("Launching Application");
        Application.launch(args);
    }
    public void init() throws Exception {
        System.out.println("Application inits");
    super.init();
    }
    public void start(Stage stage) {
        System.out.println("Application starts");
        stage.show();
    }
    public void stop() throws Exception {
        System.out.println("Application stops");
        super.stop();
    }
}



