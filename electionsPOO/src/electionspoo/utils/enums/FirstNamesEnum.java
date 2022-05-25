/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package electionspoo.utils.enums;

/**
 *
 * @author User
 */
public enum FirstNamesEnum {
    
    Tiago('M'),
    Luis('M'),
    Ambrósio('M'),
    Tomás('M'),
    Bruno('M');
     
    private final char gender;
    
    private FirstNamesEnum(char gender){
        this.gender = gender;
    }
    
    public char getGender(){
        return this.gender;
    }
}
