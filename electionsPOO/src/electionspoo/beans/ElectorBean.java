/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.beans;

import java.awt.Image;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author User
 */
public class ElectorBean implements Serializable {

    private int id;
    private String name;
    private int CC;
    private char gender;
    private Date birthDate;
    private String password;
    private Icon photo;
    //private Image photo;

    public ElectorBean() {
        this.name = null;
        this.CC = 0;
        this.gender = 0;
        this.birthDate = null;
        this.password = null;
        this.photo = null;
    }

    public ElectorBean(String name, int cc, char gender, Date birthDate, String password, Icon photo) {
        this.name = name;
        this.CC = cc;
        this.gender = gender;
        this.birthDate = birthDate;
        this.password = password;
        this.photo = photo;
    }

    public ElectorBean(String name, int cc, char gender, Date birthDate, String password) {
        this.name = name;
        this.CC = cc;
        this.gender = gender;
        this.birthDate = birthDate;
        this.password = password;
        this.photo = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Icon getPhoto() {
        return photo;
    }

    public void setPhoto(Icon photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/mm/yyyy");
        String date = formatter1.format(this.birthDate);
        String photo = "";
        if(this.photo == null)
             photo= "FOTO";
        else
            photo= this.photo.toString();
        
        String end= String.format("000 | %c | %s | %-20s", this.gender, date, this.name);  
            
        //return ("Nome: " + this.name + " CC: " + this.CC + " Gender: " + this.gender + " Birth: " + date + " Password: " + this.password + "Photo: " + photo);
        return end;
    }

    //TESTS
    public void printElector() {
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/mm/yyyy");
        String date = formatter1.format(this.birthDate);
        String photo = this.photo.toString();
        System.out.println("Nome: " + this.name + " CC: " + this.CC + " Gender: " + this.gender + " Birth: " + date + " Password: " + this.password + "Photo: " + photo);
    }
}
