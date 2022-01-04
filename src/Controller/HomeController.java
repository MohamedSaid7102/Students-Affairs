package Controller;

import Model.User;
import Utils.FXUtils;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    
    @FXML
    private JFXButton GPA;
    
    @FXML
    private JFXButton MaterialRegistration;
    
    @FXML
    private JFXButton SOTY;
    
    @FXML
    private JFXButton ShowMarks;
    
    @FXML
    private JFXButton home;
    
    @FXML
    private Hyperlink linkToCollegeSite;
    
    @FXML
    private JFXButton logout_btn;
    
    @FXML
    private JFXButton showDevelopers;
    
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        logout_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                User.resetUserInfo();
                FXUtils.changeScene(actionEvent, "/View/SignInUp/SignInView.fxml", "Sign in");
            }
        });
    }
}
