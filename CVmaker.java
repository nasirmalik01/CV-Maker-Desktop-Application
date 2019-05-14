package sample;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class CVmaker implements Initializable {

    @FXML
    private TextField firstname, lastname, address, phone, email, UniName, dept, cgpa, ClgName, percentageClg, SchoolName, percentageSchool;

    @FXML
    DatePicker dob, fromUni, toUni, fromClg, toClg, fromSchool, toSchool;

    @FXML
    TextArea skills, workExperience, certification , hobbies;


    @FXML
    Button GenerateCV ,TEMPLATEBTN , template3 ,  Save;

    @FXML
    public void SaveCVButton(MouseEvent event) throws IOException {

        try {

            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Oracle_1");
            Statement statement = connection.createStatement();
            String FName = firstname.getText();
            String LName = lastname.getText();
            String Address = address.getText();
            String Phone = phone.getText();
            String Email = email.getText();
            String Uniname = UniName.getText();
            String Dept = dept.getText();
            String Cgpa = cgpa.getText();
            String Clgname = ClgName.getText();
            String Percentageclg = percentageClg.getText();
            String Schoolname = SchoolName.getText();
            String Percentageschool = percentageSchool.getText();

            LocalDate DOB = dob.getValue();
            String S_DOB = DOB.toString();

            LocalDate Fromuni = fromUni.getValue();
            String S_Fromuni = Fromuni.toString();

            LocalDate Touni = toUni.getValue();
            String S_Touni = Touni.toString();

            LocalDate Fromcollege = fromClg.getValue();
            String S_Fromcollege = Fromcollege.toString();

            LocalDate Tocollege = toClg.getValue();
            String S_Tocollege = Tocollege.toString();


            LocalDate Fromschool = fromSchool.getValue();
            String S_Fromschool = Fromschool.toString();

            LocalDate Toschool = toSchool.getValue();
            String S_Toschool = Toschool.toString();

            String Skills = skills.getText();
            String Workexperience = workExperience.getText();
            String Certification = certification.getText();
            String Hobbies = hobbies.getText();
            int update =  statement.executeUpdate("insert into CandidateInfo values('"+FName+"', '"+LName+"' , '"+Address+"' , '"+S_DOB+"' ,  '"+Phone+"' , '"+Email+"' , '"+Uniname+"' , '"+Dept+"' , '"+Cgpa+"', '"+S_Fromuni+"' , '"+S_Touni+"' , '"+Clgname+"','"+Percentageclg+"', '"+S_Fromcollege+"' ,'"+S_Tocollege+"' , '"+Schoolname+"' , '"+Percentageschool+"' , '"+S_Fromschool+"' , '"+S_Toschool+"', '"+Skills+"' , '"+Workexperience+"' , '"+Certification+"' , '"+Hobbies+"')");
            System.out.println("Data saved");
            JOptionPane.showMessageDialog(null, "Data Saved Successfully");


        }catch (SQLException  e)
        {
            e.printStackTrace();
        }





    }

    public void GenerateCVButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Display.fxml"));
        Parent root = (Parent) loader.load();

        //pass the parameter to the controller of the next scene controller class
        displayCV controller = loader.<displayCV>getController();
        controller.setdata(firstname.getText(),lastname.getText(),address.getText(),phone.getText(),email.getText(),dob.getValue().toString(),skills.getText(),UniName.getText(),fromUni.getValue().toString(),toUni.getValue().toString(),dept.getText(),cgpa.getText(),ClgName.getText(),fromClg.getValue().toString(),toClg.getValue().toString(),percentageClg.getText(),SchoolName.getText(),fromSchool.getValue().toString(),toSchool.getValue().toString(),percentageSchool.getText(),workExperience.getText(),certification.getText(),hobbies.getText());

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }


    public void GenerateTeemplate2(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondDisplay.fxml"));
        Parent root = (Parent) loader.load();

        //pass the parameter to the controller of the next scene controller class
        Template2 controller1 = loader.<Template2>getController();
        controller1.setdata2(firstname.getText(),lastname.getText(),address.getText(),phone.getText(),email.getText(),dob.getValue().toString(),skills.getText(),UniName.getText(),fromUni.getValue().toString(),toUni.getValue().toString(),dept.getText(),cgpa.getText(),ClgName.getText(),fromClg.getValue().toString(),toClg.getValue().toString(),percentageClg.getText(),SchoolName.getText(),fromSchool.getValue().toString(),toSchool.getValue().toString(),percentageSchool.getText(),workExperience.getText(),certification.getText(),hobbies.getText());

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }

    public void GenerateTeemplate3(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Template3.fxml"));
        Parent root = (Parent) loader.load();

        //pass the parameter to the controller of the next scene controller class
        ThirdDisplay controller2 = loader.<ThirdDisplay>getController();
        controller2.setdata2(firstname.getText(),lastname.getText(),address.getText(),phone.getText(),email.getText(),dob.getValue().toString(),skills.getText(),UniName.getText(),fromUni.getValue().toString(),toUni.getValue().toString(),dept.getText(),cgpa.getText(),ClgName.getText(),fromClg.getValue().toString(),toClg.getValue().toString(),percentageClg.getText(),SchoolName.getText(),fromSchool.getValue().toString(),toSchool.getValue().toString(),percentageSchool.getText(),workExperience.getText(),certification.getText(),hobbies.getText());

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }
        @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
}
