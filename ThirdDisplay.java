package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ThirdDisplay implements Initializable {

    @FXML
    private Label MFNAME, MLNAME, MADDRESS, MPHONE, MEMAIL, MDOB, MSKILLS, MUNII, MUNISTART, MUNIEND, MDEPARTMENT, MCGPA, MCLGNAME, MCLGFROM, MCOLGTO, MCLGPER, MSCLNAME, MSCLFROM, MSCLTO, MSCLPER, MWORKING, MCERTIFICATION, MHOBBIES;


    public String firstname;
    public String lastname;
    public String Address;
    public String Phone;
    public String Email;
    public String DOB;
    public String Uni;
    public String Unistart;
    public String Uniend;
    public String Unidept;
    public String CGPA;
    public String Clgname;
    public String Clgfrom;
    public String Clgto;
    public String Clgper;
    public String Sclname;
    public String Sclfrom;
    public String Sclto;
    public String Sclper;
    public String Skills;
    public String Workingexperience;
    public String Certification;
    public String Hobbies;


    public void setdata2(String firstname, String lastname, String Address, String Phone, String Email, String DOB, String Skills, String Uni, String Unistart, String Uniend, String Unidept, String CGPA, String Clgname, String Clgfrom, String Clgto, String Clgper, String Sclname, String Sclfrom, String Sclto, String Sclper, String Workingexperience, String Certification, String Hobbies) {
        //System.out.println("$$$$$$" + name);
        this.firstname = firstname;
        this.lastname = lastname;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.DOB = DOB;
        this.Uni = Uni;
        this.Unistart = Unistart;
        this.Uniend = Uniend;
        this.Unidept = Unidept;
        this.CGPA = CGPA;
        this.Clgname = Clgname;
        this.Clgfrom = Clgfrom;
        this.Clgto = Clgto;
        this.Clgper = Clgper;
        this.Sclname = Sclname;
        this.Sclfrom = Sclfrom;
        this.Sclto = Sclto;
        this.Sclper = Sclper;
        this.Skills = Skills;
        this.Workingexperience = Workingexperience;
        this.Certification = Certification;
        this.Hobbies = Hobbies;
        setTemplate2();
    }

    private void setTemplate2() {
        MFNAME.setText(firstname);
        MLNAME.setText(lastname);
        MADDRESS.setText(Address);
        MPHONE.setText(Phone);
        MEMAIL.setText(Email);
        MDOB.setText(DOB);
        MUNII.setText(Uni);
        MUNISTART.setText(Unistart);
        MUNIEND.setText(Uniend);
        MDEPARTMENT.setText(Unidept);
        MCGPA.setText(CGPA);
        MCLGNAME.setText(Clgname);
        MCLGFROM.setText(Clgfrom);
        MCOLGTO.setText(Clgto);
        MCLGPER.setText(Clgper);
        MSCLNAME.setText(Sclname);
        MSCLFROM.setText(Sclfrom);
        MSCLTO.setText(Sclto);
        MSCLPER.setText(Sclper);
        MSKILLS.setText(Skills);
        MWORKING.setText(Workingexperience);
        MCERTIFICATION.setText(Certification);
        MHOBBIES.setText(Hobbies);
    }
        @Override
        public void initialize (URL location, ResourceBundle resources){

        }
    }

