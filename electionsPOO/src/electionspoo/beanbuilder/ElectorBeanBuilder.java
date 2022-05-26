/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.beanbuilder;

import electionspoo.beans.ElectorBean;
import electionspoo.utils.GenerateUtils;
import electionspoo.utils.enums.FirstNamesEnum;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author User
 */
public class ElectorBeanBuilder {
    
    
    public static ElectorBean buildRandomElectorBean(ArrayList<ElectorBean> electorList) throws ParseException{
       
        Random rd = new Random();
        StringBuilder nome = new StringBuilder();
  
        int id = GenerateUtils.getLastIDFromArrayList(electorList);
        
        //Generate first name
        FirstNamesEnum fne = GenerateUtils.getRandomFirstName(rd);
        nome.append(fne.toString()).append(" ").append(GenerateUtils.getRandomLastName(rd).toString());
        
        int cc = GenerateUtils.getRandom8DigitNumber(rd); //Generate CC
        
        char gender = fne.getGender(); //Get name's gender

        Date date = GenerateUtils.getRandomBirthDate(); //Generate random birth date

        int password = GenerateUtils.getRandom8DigitNumber(rd); //Generate random password(8 digits)
        
        ElectorBean electorBean = new ElectorBean(id, nome.toString(), cc, gender, date, String.valueOf(password));
        
        return electorBean;
    }
}