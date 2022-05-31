/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.bo;

import electionspoo.beans.ElectorBean;
import electionspoo.utils.enums.FirstNamesEnum;
import electionspoo.utils.enums.LastNamesEnum;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author User
 */
public class ElectorBO {
    
    
    private static String electorFilePath = "electors.txt";
    private static File electorsFile = new File(electorFilePath);

  
    public static void createFile(ArrayList<ElectorBean> electorList) throws FileNotFoundException, IOException, ParseException {

        if (!electorsFile.exists()) {
            FileOutputStream fi = new FileOutputStream(electorsFile);
            ObjectOutputStream oi = new ObjectOutputStream(fi);
            
            oi.writeObject(electorList);
            
            oi.close();
            fi.close();
        }
    }

    public static ArrayList<ElectorBean> getElectorsFromFile(ArrayList<ElectorBean> electorList) throws FileNotFoundException, IOException, ClassNotFoundException{
        try {
            createFile(electorList);
            FileInputStream fi = new FileInputStream(electorsFile);
            ObjectInputStream oi = new ObjectInputStream(fi);
            
            electorList = (ArrayList<ElectorBean>) oi.readObject();
            
            oi.close();
            fi.close();
            
            return electorList;
        } catch (ParseException ex) {
            Logger.getLogger(ElectorBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return electorList;
    }
    
    public static void saveElectorsToFile(ArrayList<ElectorBean> electorList) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
        try {
            FileOutputStream fi = new FileOutputStream(electorsFile);
            ObjectOutputStream oi = new ObjectOutputStream(fi);

            oi.writeObject(electorList);

            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }
    
    public static String getGUIListLine(ElectorBean electorBean) {
        return String.format("%08d | %c | %s | %-20s", electorBean.getCC() ,electorBean.getGender(), electorBean.getBirthDate(), electorBean.getName());  
    }
    
    public static void deleteElectorFromList(ArrayList<ElectorBean> electorList, int id) throws IOException, FileNotFoundException, ClassNotFoundException, ParseException{
        electorList.remove(id);
    }
    
    
    
}

