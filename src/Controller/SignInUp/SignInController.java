package Controller.SignInUp;

import Utils.DBUtils;
import Utils.FXUtils;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignInController implements Initializable {
    
    @FXML
    private TextField email_tf;
    
    @FXML
    private PasswordField password_tf;
    
    @FXML
    private JFXButton signIn_btn;
    
    @FXML
    private JFXButton signup;
    
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                FXUtils.changeScene(actionEvent,"/View/SignInUp/SignUpView.fxml", "Sign up");
            }
        });
    
        signIn_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.Login(actionEvent, email_tf.getText(), password_tf.getText());
            }
        });
        
    }
}
