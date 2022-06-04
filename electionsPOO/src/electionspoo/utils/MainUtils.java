/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.utils;

import electionspoo.beans.ElectorBean;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
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

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static ArrayList<ElectorBean> orderArrayListByCC(ArrayList<ElectorBean> electorList) {
        Collections.sort(electorList);
        return electorList;
    }

    public static int getPersonAge(String date) {
        LocalDate birthDate = LocalDate.parse(date, formatter);
        LocalDate curDate = LocalDate.now();
        //calculates the amount of time between two dates and returns the years  
        if ((birthDate != null) && (curDate != null)) {
            return Period.between(birthDate, curDate).getYears();
        } else {
            return 0;
        }
    }

    public static boolean isNullOrEmpty(String text) {
        return text.isEmpty() || text.isBlank();
    }

    public static byte[] url2Byte(URL url) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] arrayOfByte = new byte[4096];
            InputStream inputStream = url.openStream();
            int i;
            while ((i = inputStream.read(arrayOfByte)) > 0) {
                byteArrayOutputStream.write(arrayOfByte, 0, i);
            }
        } catch (IOException iOException2) {
            IOException iOException1;
            (iOException1 = null).printStackTrace();
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

}
