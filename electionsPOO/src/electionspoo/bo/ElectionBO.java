/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.bo;

import electionspoo.beans.ElectionBean;
import electionspoo.beans.ElectorBean;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ElectionBO {
    
    public static void createFile(ArrayList<ElectionBean> electionList, File fileToSave) throws FileNotFoundException, IOException, ParseException {

        if (!fileToSave.exists()) {
            FileOutputStream fi = new FileOutputStream(fileToSave);
            ObjectOutputStream oi = new ObjectOutputStream(fi);
            
            oi.writeObject(electionList);
            
            oi.close();
            fi.close();
        }
    }

    public static ArrayList<ElectionBean> getElectorsFromFile(ArrayList<ElectionBean> electionList, File fileToSave) throws FileNotFoundException, IOException, ClassNotFoundException{
        try {
            createFile(electionList, fileToSave);
            FileInputStream fi = new FileInputStream(fileToSave);
            ObjectInputStream oi = new ObjectInputStream(fi);
            
            electionList = (ArrayList<ElectionBean>) oi.readObject();
            
            oi.close();
            fi.close();
            
            return electionList;
        } catch (ParseException ex) {
            Logger.getLogger(ElectorBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return electionList;
    }
    
    
    
}
