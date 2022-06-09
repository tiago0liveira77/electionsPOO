/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.beans;

import java.awt.Image;
import java.io.Serializable;

/**
 *
 * @author User
 */
public class CandidateBean implements Serializable{
    private String name;
    private String initials;
    private Image photo;
    
    public CandidateBean(){
        this.name = "Partido A";
        this.initials = "prA";
        this.photo = null;
    }
    
    public CandidateBean(String name, String initials, Image photo){
        this.name = name;
        this.initials = initials;
        this.photo = photo;
    }
    
     public CandidateBean(String name, String initials){
        this.name = name;
        this.initials = initials;
        this.photo = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
}
