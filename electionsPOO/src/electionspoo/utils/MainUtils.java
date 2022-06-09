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
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 *
 * @author User
 */
public class MainUtils {

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static DefaultListModel<String> listaGUIElector = new DefaultListModel<>();
    public static DefaultListModel<String> listaGUICandidate = new DefaultListModel<>();
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
    

    public static byte[] imageFromURLToByteArray(URL url) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] photo = new byte[4096];
            InputStream inputStream = url.openStream();
            int i;
            while ((i = inputStream.read(photo)) > 0) {
                byteArrayOutputStream.write(photo, 0, i);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

}
