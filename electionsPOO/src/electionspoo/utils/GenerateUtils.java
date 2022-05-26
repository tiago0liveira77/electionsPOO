/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.utils;

import electionspoo.beans.ElectorBean;
import electionspoo.utils.enums.FirstNamesEnum;
import electionspoo.utils.enums.LastNamesEnum;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author User
 */
public class GenerateUtils {
       
    
    private static int maxCCNumber = 99999999;
    private static int minCCNumber = 1000000;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    
    public static FirstNamesEnum getRandomFirstName(Random rd){
        return FirstNamesEnum.values()[rd.nextInt(50)];
    }
    
     public static LastNamesEnum getRandomLastName(Random rd){
        return LastNamesEnum.values()[rd.nextInt(25)];
    }
     
    public static int getRandom8DigitNumber(Random rd){  
        return randBetween(minCCNumber, maxCCNumber);
    }
    
    public static Date getRandomBirthDate() throws ParseException{
 
       int year = randBetween(1980, 2005);
       int month = randBetween(1,12);
       int dayOfMonth = randBetween(1,31);
       
       String dateString = dayOfMonth + "/" + month + "/" + year;

       return sdf.parse(dateString);

    }
    
    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

    public static int getLastIDFromArrayList(ArrayList<ElectorBean> electorList){
        if(electorList.size()>0)
            return electorList.get(electorList.size()-1).getID() + 1;
        return 1;
    }
}
