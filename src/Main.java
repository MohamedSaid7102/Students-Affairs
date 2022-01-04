import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//33203-234234-3243-

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View/SignInUp/SignInView.fxml"));
        primaryStage.setTitle("Sign in");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
