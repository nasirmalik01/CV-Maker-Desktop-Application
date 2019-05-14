package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class displayCV implements Initializable {

    @FXML
    private Label FName,LName,address,phone,email,dob,skills,uni,unistart,uniend,unidept,cgpa,clgname,clgfrom,clgto,clgper,sclname,sclfrom,sclto,sclper,workingexperience,certifcation,hobbies;


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


    public void setdata(String firstname,String lastname,String Address,String Phone,String Email,String DOB ,String Skills,String Uni,String Unistart,String Uniend,String Unidept,String CGPA,String Clgname ,String Clgfrom,String Clgto,String Clgper,String Sclname,String Sclfrom,String Sclto,String Sclper,String Workingexperience,String Certification,String Hobbies){
        //System.out.println("$$$$$$" + name);
        this.firstname = firstname;
        this.lastname=lastname;
        this.Address=Address;
        this.Phone = Phone;
        this.Email=Email;
        this.DOB=DOB;
        this.Uni = Uni;
        this.Unistart=Unistart;
        this.Uniend=Uniend;
        this.Unidept=Unidept;
        this.CGPA = CGPA;
        this.Clgname = Clgname;
        this.Clgfrom=Clgfrom;
        this.Clgto=Clgto;
        this.Clgper = Clgper;
        this.Sclname=Sclname;
        this.Sclfrom=Sclfrom;
        this.Sclto=Sclto;
        this.Sclper = Sclper;
        this.Skills=Skills;
        this.Workingexperience=Workingexperience;
        this.Certification=Certification;
        this.Hobbies=Hobbies;

        set();
    }

    private void set(){
        FName.setText(firstname);
        LName.setText(lastname);
        address.setText(Address);
        phone.setText(Phone);
        email.setText(Email);
        dob.setText(DOB); uni.setText(Uni);
        unistart.setText(Unistart);
        uniend.setText(Uniend);
        unidept.setText(Unidept);
        cgpa.setText(CGPA);
        clgname.setText(Clgname);
        clgfrom.setText(Clgfrom);
        clgto.setText(Clgto);
        clgper.setText(Clgper);
        sclname.setText(Sclname);
        sclfrom.setText(Sclfrom);
        sclto.setText(Sclto);
        sclper.setText(Sclper);
        skills.setText(Skills);
        workingexperience.setText(Workingexperience);
        certifcation.setText(Certification);
        hobbies.setText(Hobbies);

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
}
