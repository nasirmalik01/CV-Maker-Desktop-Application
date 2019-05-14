package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class SignUp_Controller  implements Initializable {

    @FXML
    private TextField s_user;

    @FXML
    private TextField s_email;

    @FXML
    private TextField s_password;

    @FXML
    private Button s_signup;

    @FXML
    private Label s_login;

    public void signup(MouseEvent event)
    {

        try {


            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Oracle_1");
            Statement statement = connection.createStatement();
            String username = s_user.getText();
            String password = s_password.getText();
            String email = s_email.getText();
            if(email.isEmpty() || username.isEmpty() || password.isEmpty())
            {
                JOptionPane.showMessageDialog(null , "These fields can't be empty");
            }
            int update =  statement.executeUpdate("insert into AccountDetail values('"+username+"', '"+password+"' , '"+email+"')");
            //System.out.println("User Registered");
            JOptionPane.showMessageDialog(null , "User Registered successfully");




        }catch (SQLException e){
                e.printStackTrace();
        }
    }

@FXML
   public void loginMove(MouseEvent event) throws Exception
   {
       Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
       Scene scene = new Scene(root);
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       stage.setScene(scene);
       stage.show();


   }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
