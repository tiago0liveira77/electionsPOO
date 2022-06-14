/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.beans.candidate;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class CandidateBean implements Serializable{
    private String name;
    private String initials;
    private int votes;
    private ImageIcon photo;
    
    public CandidateBean(){
        this.name = "Exemplo";
        this.initials = "EXEM";
        this.photo = new ImageIcon("src/electionspoo/multimedia/person.png");
        this.votes = 0;
    }
    
    public CandidateBean(String name, String initials, ImageIcon photo){
        this.name = name;
        this.initials = initials;
        this.photo = photo;
        this.votes = 0;
    }
    
     public CandidateBean(String name, String initials){
        this.name = name;
        this.initials = initials;
        this.photo = null;
        this.votes = 0;
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

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
    
    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes += votes;
    }
}
