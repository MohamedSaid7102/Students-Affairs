package Utils;

import javafx.beans.NamedArg;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class FXUtils {
    
    //    Function to change the scene
    public static void changeScene(ActionEvent event, String fxmlFile, String title) {
        Parent root = null;
        
        //        Check if the userName & password is provided -> so user is trying to sign in
        try {
            FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource(fxmlFile)); // we need to load the view
            // into parent root
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow()); // get the current stage by 1. cast
        // the targeted event into node -- 2. get it's window 'stage' from it's scene 3. cast the result into Stage.
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    // Function to alert user
    public static void alertUser(String alertHeader,String alertMessage, @NamedArg("alertType") Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(alertHeader);
        alert.setContentText(alertMessage);
        alert.show();
    }
}
