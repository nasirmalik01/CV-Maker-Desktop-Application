
package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class Login_Controller implements Initializable {

    @FXML
    private TextField login_user;

    @FXML
    private TextField login_pass;

    @FXML
    private Button login_btn;

    @FXML
    public void loginbtn(MouseEvent event) throws IOException {
        try {


/*
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
*/
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Oracle_1");
            Statement statement = connection.createStatement();
            String username = login_user.getText();
            String password = login_pass.getText();
            if(username.isEmpty() || password.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "These fields can't be empty");
                return;
            }
            ResultSet resultSet = statement.executeQuery("select * from AccountDetail where username" +
                    " = '" + username + "' or email = '" + login_pass + "' and password = '" + password + "'");

            if (resultSet.next()) {
                Parent root = FXMLLoader.load(getClass().getResource("CVmaker.fxml"));
                Scene scene = new Scene(root);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
                System.out.println("Username and password matched");
            }
            else
            {
                //System.out.println("Username or password is incorrect");
                JOptionPane.showMessageDialog(null , "Sorry, Username or password is Incorrect");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    @FXML
    public void signupMove(MouseEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("signUp.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

