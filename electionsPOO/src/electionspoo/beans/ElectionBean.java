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
    ArrayList<ElectorBean> eleitores = new ArrayList<ElectorBean>();
    ArrayList<CandidateBean> candidatos = new ArrayList<CandidateBean>();
    private Date startDate;
    private Date endDate;
}
