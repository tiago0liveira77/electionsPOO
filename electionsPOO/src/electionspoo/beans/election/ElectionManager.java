/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.beans.election;


import electionspoo.beans.candidate.CandidateList;
import electionspoo.beans.elector.ElectorList;
import electionspoo.utils.interfaces.FileManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author User
 */
public class ElectionManager implements FileManager, Serializable{
    
    private static ElectionBean election;
    
    public static ElectionBean getElection(){
        return election;
    }
    
    public static void updateBeanLists(){
        election.setCandidateList(CandidateList.getList());
        election.setElectorList(ElectorList.getList());
    }
    
    @Override
    public void save(String nomeFicheiro) throws Exception {
        try (ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(nomeFicheiro))) {
            file.writeObject(election);
        }
    }

    @Override
    public void load(String nomeFicheiro) throws Exception {
        if (new File(nomeFicheiro).exists()) {
            try (ObjectInputStream file = new ObjectInputStream(new FileInputStream(nomeFicheiro))) {
                election = (ElectionBean) file.readObject();
                CandidateList.setList(election.getCandidateList());
                ElectorList.setList(election.getElectorList());
            }
        } else {
            election = new ElectionBean();
            save(nomeFicheiro);
        }
    }
    
    
}