package Controller.SignInUp;

import Utils.DBUtils;
import Utils.FXUtils;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    
    @FXML
    private JFXButton SignUp_Btn;
    
    @FXML
    private TextField address_tf;
    
    @FXML
    private TextField email_tf;
    
    @FXML
    private TextField fName_tf;
    
    @FXML
    private TextField lName_tf;
    
    @FXML
    private TextField nationalID_tf;
    
    @FXML
    private PasswordField password_tf;
    
    @FXML
    private JFXButton signin;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        signin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                FXUtils.changeScene(actionEvent,"/View/SignInUp/SignInView.fxml", "Sign up");
            }
        });
    
        SignUp_Btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.signUp(actionEvent, fName_tf.getText(), lName_tf.getText(), email_tf.getText(),
                        password_tf.getText(), address_tf.getText(), nationalID_tf.getText());
            }
        });
    }
}
