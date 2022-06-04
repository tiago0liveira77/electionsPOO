/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.bo;

import electionspoo.beans.ElectorBean;
import electionspoo.utils.MainUtils;
import electionspoo.utils.enums.FirstNamesEnum;
import electionspoo.utils.enums.LastNamesEnum;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


/**
 *
 * @author User
 */
public class ElectorBO {
   
  
    public static void createFile(ArrayList<ElectorBean> electorList, File fileToSave) throws FileNotFoundException, IOException, ParseException {

        if (!fileToSave.exists()) {
            FileOutputStream fi = new FileOutputStream(fileToSave);
            ObjectOutputStream oi = new ObjectOutputStream(fi);
            
            oi.writeObject(electorList);
            
            oi.close();
            fi.close();
        }
    }

    public static ArrayList<ElectorBean> getElectorsFromFile(ArrayList<ElectorBean> electorList, File fileToSave) throws FileNotFoundException, IOException, ClassNotFoundException{
        try {
            createFile(electorList, fileToSave);
            FileInputStream fi = new FileInputStream(fileToSave);
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
    
    public static void saveElectorsToFile(ArrayList<ElectorBean> electorList, File fileToSave) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
        try {
            FileOutputStream fi = new FileOutputStream(fileToSave);
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
  
    
    public static int searchElectorByName(ArrayList<ElectorBean> electorList, String text){
        
        for(ElectorBean elector : electorList){
            if(elector.getName().contains(text)){
                return electorList.indexOf(elector);
            }
        }  
        return 0;
    }
    
    public static int searchElectorByCC(ArrayList<ElectorBean> electorList, String text){
        
        for(ElectorBean elector : electorList){
            if(String.valueOf(elector.getCC()).contains(text)){
                return electorList.indexOf(elector);
            }
        }  
        return 0;
    }
    
    public static ImageIcon getRandomPhoto(char gender, int idade) throws IOException {
        String genderFinal = "male";
        if(gender == ('M') || gender == ('m')){
            genderFinal = "male";
        } else {
            genderFinal = "female";
        }
        
        
        byte[] urlSearch = MainUtils.url2Byte(new URL("https://fakeface.rest/face/json?gender="+genderFinal+"&minimum_age="+(idade-5)+"&maximum_age="+(idade+5)));
        System.out.println("https://fakeface.rest/face/json?gender="+genderFinal+"&minimum_age="+(idade-5)+"&maximum_age="+(idade+5));
        String getPhotoUrl = (getPhotoUrl = new String(urlSearch)).substring(getPhotoUrl.indexOf("https://"));
        getPhotoUrl = getPhotoUrl.substring(0, getPhotoUrl.indexOf(".jpg")) + ".jpg";
        byte[] finalPhotoUrl = MainUtils.url2Byte(new URL(getPhotoUrl));
        BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(finalPhotoUrl));
        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        return imageIcon;
    }

    
}

