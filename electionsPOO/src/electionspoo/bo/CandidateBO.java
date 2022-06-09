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

    private static ArrayList<CandidateBean> candidateList;
    
    public static ArrayList<CandidateBean> getList(){
        return candidateList;
    }

    public static String getGUIListLine(CandidateBean candidateBean) {
        return String.format("%20s | %s ", candidateBean.getName(), candidateBean.getInitials());
    }

    public static void deleteCandidateFromList(ArrayList<CandidateBean> candidateList, int id) throws IOException, FileNotFoundException, ClassNotFoundException, ParseException {
        candidateList.remove(id);
    }

    public static int searchCandidateByName(ArrayList<CandidateBean> candidateList, String text) {

        for (CandidateBean candidate : candidateList) {
            if (candidate.getName().contains(text)) {
                return candidateList.indexOf(candidate);
            }
        }
        return 0;
    }

    public static int searchCandidateByInitials(ArrayList<CandidateBean> candidateList, String text) {

        for (CandidateBean candidate : candidateList) {
            if (candidate.getInitials().contains(text)) {
                return candidateList.indexOf(candidate);
            }
        }
        return 0;
    }

    //guarda a arraylist num ficheiro
    public static void save(String nomeFicheiro) throws Exception {
        ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(nomeFicheiro));
        file.writeObject(candidateList);
        file.close();
    }

    //le um ficheiro e passa os dados para a arraylist
    public static void load(String nomeFicheiro) throws Exception {
        if (new File(nomeFicheiro).exists()) {
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(nomeFicheiro));
            candidateList = (ArrayList<CandidateBean>) file.readObject();
            file.close();
        } else {
            candidateList = new ArrayList();
            candidateList.add(new CandidateBean());
        }
    }
}
