/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.beans;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author User
 */
public class ElectorBean {
    private String name;
    private String CC;
    private char gender;
    private Date birthDate;
    private String password;
    private Image photo;
    
    public ElectorBean(){
        this.name = null;
        this.CC = null;
        this.gender = 0;
        this.birthDate = null;
        this.password = null;
        this.photo = null;
    }
    
    public ElectorBean(String name, String cc, char gender, Date birthDate, String password, Image photo){
        this.name = name;
        this.CC = cc;
        this.gender = gender;
        this.birthDate = birthDate;
        this.password = password;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
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

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
}
