/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.beans;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class ElectionBean {
    private String name;
    private ArrayList<ElectorBean> eleitores = new ArrayList<ElectorBean>();
    private ArrayList<CandidateBean> candidatos = new ArrayList<CandidateBean>();
    private Date startDate;
    private Date endDate;
    
    public ElectionBean(){
        this.name = null;
        this.eleitores = null;
        this.candidatos = null;
        this.startDate = null;
        this.endDate = null;
    }
    
    public ElectionBean(String name, ArrayList<ElectorBean> eleitores, ArrayList<CandidateBean> candidatos, Date startDate, Date endDate){
        this.name = name;
        this.eleitores = eleitores;
        this.candidatos = candidatos;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public ArrayList<ElectorBean> getEleitores() {
        return eleitores;
    }

    public void setEleitores(ArrayList<ElectorBean> eleitores) {
        this.eleitores = eleitores;
    }

    public ArrayList<CandidateBean> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<CandidateBean> candidatos) {
        this.candidatos = candidatos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    
}
