package apptrasporti;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppTrasporti extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        FXMLLoader root = new FXMLLoader(getClass().getResource("Login.fxml"));
        
        Scene scene = new Scene(root.load(), 600, 400);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
