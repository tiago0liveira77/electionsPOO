/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.bo;

import electionspoo.beans.CandidateBean;
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
public class CandidateBO {
    
    private static String candidatesFilePath = "candidates.txt";
    private static File candidatesFile = new File(candidatesFilePath);

  
    public static void createFile(ArrayList<CandidateBean> candidatesList) throws FileNotFoundException, IOException, ParseException {

        if (!candidatesFile.exists()) {
            FileOutputStream fi = new FileOutputStream(candidatesFile);
            ObjectOutputStream oi = new ObjectOutputStream(fi);
            
            oi.writeObject(candidatesList);
            
            oi.close();
            fi.close();
        }
    }

    public static ArrayList<CandidateBean> getCandidatesFromFile(ArrayList<CandidateBean> candidatesList) throws FileNotFoundException, IOException, ClassNotFoundException{
        try {
            createFile(candidatesList);
            FileInputStream fi = new FileInputStream(candidatesFile);
            ObjectInputStream oi = new ObjectInputStream(fi);
            
            candidatesList = (ArrayList<CandidateBean>) oi.readObject();
            
            oi.close();
            fi.close();
            
            return candidatesList;
        } catch (ParseException ex) {
            Logger.getLogger(ElectorBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return candidatesList;
    }
    
    public static void saveCandidatesToFile(ArrayList<CandidateBean> candidatesList) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
        try {
            FileOutputStream fi = new FileOutputStream(candidatesFile);
            ObjectOutputStream oi = new ObjectOutputStream(fi);

            oi.writeObject(candidatesList);

            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }
    
    public static String getGUIListLine(CandidateBean candidateBean) {
        return String.format("%20d | %c ", candidateBean.getName(),candidateBean.getInitials());  
    }
    
    public static void deleteElectorFromFile(ArrayList<ElectorBean> electorList, int id) throws IOException, FileNotFoundException, ClassNotFoundException, ParseException{
        electorList.remove(id);
    }
    
}
