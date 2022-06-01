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
  
    public static void createFile(ArrayList<CandidateBean> candidatesList, File fileToSave) throws FileNotFoundException, IOException, ParseException {

        if (!fileToSave.exists()) {
            FileOutputStream fi = new FileOutputStream(fileToSave);
            ObjectOutputStream oi = new ObjectOutputStream(fi);
            
            oi.writeObject(candidatesList);
            
            oi.close();
            fi.close();
        }
    }

    public static ArrayList<CandidateBean> getCandidatesFromFile(ArrayList<CandidateBean> candidatesList, File fileToSave) throws FileNotFoundException, IOException, ClassNotFoundException{
        try {
            createFile(candidatesList, fileToSave);
            FileInputStream fi = new FileInputStream(fileToSave);
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
    
    public static void saveCandidatesToFile(ArrayList<CandidateBean> candidatesList, File fileToSave) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
        try {
            FileOutputStream fi = new FileOutputStream(fileToSave);
            ObjectOutputStream oi = new ObjectOutputStream(fi);

            oi.writeObject(candidatesList);

            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error initializing stream");
        }
    }
    
    public static String getGUIListLine(CandidateBean candidateBean) {
        return String.format("%20s | %s ", candidateBean.getName(),candidateBean.getInitials());  
    }
    
    public static void deleteCandidateFromList(ArrayList<CandidateBean> candidateList, int id) throws IOException, FileNotFoundException, ClassNotFoundException, ParseException{
        candidateList.remove(id);
    }
    
     public static int searchCandidateByName(ArrayList<CandidateBean> candidateList, String text){
        
        for(CandidateBean candidate : candidateList){
            if(candidate.getName().contains(text)){
                return candidateList.indexOf(candidate);
            }
        }  
        return 0;
    }
    
    public static int searchCandidateByInitials(ArrayList<CandidateBean> candidateList, String text){
        
        for(CandidateBean candidate : candidateList){
            if(candidate.getInitials().contains(text)){
                return candidateList.indexOf(candidate);
            }
        }  
        return 0;
    }
    
}