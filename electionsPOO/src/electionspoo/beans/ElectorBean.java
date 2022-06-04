/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.beans;

import electionspoo.utils.MainUtils;
import java.awt.Image;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class ElectorBean implements Serializable, Comparable {

    private String name;
    private int CC;
    private char gender;
    private LocalDate birthDate;
    private String password;
    private ImageIcon photo;
    //private Image photo;

    public ElectorBean() {
        this.name = null;
        this.CC = 0;
        this.gender = 0;
        this.birthDate = null;
        this.password = null;
        this.photo = null;
    }

    public ElectorBean(String name, int cc, char gender, LocalDate birthDate, String password, ImageIcon photo) {
        this.name = name;
        this.CC = cc;
        this.gender = gender;
        this.birthDate = birthDate;
        this.password = password;
        this.photo = photo;
    }

    public ElectorBean(String name, int cc, char gender, LocalDate birthDate, String password) {
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

    public String getBirthDate() {
        return this.birthDate.format(MainUtils.formatter);
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }

   
    
    @Override
    public int compareTo(Object elector) {
        int compareCC = ((ElectorBean)elector).getCC();
        /* For Ascending order*/
        return this.CC-compareCC;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }
}
