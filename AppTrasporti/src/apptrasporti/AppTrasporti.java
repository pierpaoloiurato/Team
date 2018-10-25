package apptrasporti;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException { 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova", "root", "");
        launch(args);
    }
    
}
