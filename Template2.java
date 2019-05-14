package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Template2 implements Initializable{


        @FXML
        private Label FNAME,LNAME,ADDRESS,PHONE,EMAIL,DATEOFBIRTH,SKILLS,UNI,UNISTART,UNIEND,UNIDEPT,CCGPA,CLGNAME,CLGFROM,CLGTO,CLGPER,SCLNAME,SCLFROM,SCLTO,SCLPER,WORKING,CERTIFICATION,HOBBIES;


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


        public void setdata2(String firstname,String lastname,String Address,String Phone,String Email,String DOB ,String Skills,String Uni,String Unistart,String Uniend,String Unidept,String CGPA,String Clgname ,String Clgfrom,String Clgto,String Clgper,String Sclname,String Sclfrom,String Sclto,String Sclper,String Workingexperience,String Certification,String Hobbies){
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
            setTemplate2();
        }

        private void setTemplate2(){
            FNAME.setText(firstname);
            LNAME.setText(lastname);
            ADDRESS.setText(Address);
            PHONE.setText(Phone);
            EMAIL.setText(Email);
            DATEOFBIRTH.setText(DOB);
            UNI.setText(Uni);
            UNISTART.setText(Unistart);
            UNIEND.setText(Uniend);
            UNIDEPT.setText(Unidept);
            CCGPA.setText(CGPA);
            CLGNAME.setText(Clgname);
            CLGFROM.setText(Clgfrom);
            CLGTO.setText(Clgto);
            CLGPER.setText(Clgper);
            SCLNAME.setText(Sclname);
            SCLFROM.setText(Sclfrom);
            SCLTO.setText(Sclto);
            SCLPER.setText(Sclper);
            SKILLS.setText(Skills);
            WORKING.setText(Workingexperience);
            CERTIFICATION.setText(Certification);
            HOBBIES.setText(Hobbies);

        }
        @Override
        public void initialize(URL location, ResourceBundle resources) {


        }
    }


