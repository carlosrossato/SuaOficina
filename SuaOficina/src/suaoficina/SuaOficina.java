package suaoficina;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SuaOficina extends Application{
    
    private static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Login.fxml"));
        stage.resizableProperty().setValue(Boolean.FALSE);

        
        Scene scene = new Scene(root);
        
        stage.setTitle("SuaOficina");
        stage.setScene(scene);
        stage.show();
        setStage(stage);
        
    }
    
    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        SuaOficina.stage = stage;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
