/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.beans;

import electionspoo.beans.candidate.CandidateList;
import electionspoo.beans.elector.ElectorList;
import java.util.Date;

/**
 *
 * @author User
 */
public class ElectionBean {
    private String name;
    private ElectorList electorList;
    private CandidateList candidateList;
    private Date startDate;
    private Date endDate;
    
    
    public ElectionBean(){
        this.name = null;
        this.electorList = null;
        this.candidateList = null;
        this.startDate = null;
        this.endDate = null;
    }
    
    public ElectionBean(String name, ElectorList eleitores, CandidateList candidatos, Date startDate, Date endDate){
        this.name = name;
        this.electorList = eleitores;
        this.candidateList = candidatos;
        this.startDate = startDate;
        this.endDate = endDate;
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
    
        public ElectorList getElectorList() {
        return electorList;
    }

    public void setElectorList(ElectorList electorList) {
        this.electorList = electorList;
    }

    public CandidateList getCandidateList() {
        return candidateList;
    }

    public void setCandidateList(CandidateList candidateList) {
        this.candidateList = candidateList;
    }
}
