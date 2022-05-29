/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.utils;

import electionspoo.beans.ElectorBean;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author User
 */
public class MainUtils {
    
    static SimpleDateFormat sdf = new SimpleDateFormat();
    
    public static ArrayList<ElectorBean> orderArrayListByCC(ArrayList<ElectorBean> electorList){
        Collections.sort(electorList);
        return electorList;
    }
    
    public static int getPersonsAge(String birthDate) throws ParseException{
        /*GregorianCalendar DateOfBirth = new GregorianCalendar();
        GregorianCalendar currentDate = new GregorianCalendar();
        gc.setTime(sdf.parse(birthDate));
        currentDate.set
        gc.*/
        
        return 0;
    }
    
}
