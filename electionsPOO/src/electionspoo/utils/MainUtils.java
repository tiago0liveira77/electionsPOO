/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.utils;

import electionspoo.beans.ElectorBean;
import java.awt.Image;
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
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class MainUtils {

    //formatter usado para datas no tipo "dd/MM/yyyy" para LocalDate
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //ListModel para JList Eleitores
    public static DefaultListModel<String> listaGUIElector = new DefaultListModel<>();
    //ListModel para JList Candidatos
    public static DefaultListModel<String> listaGUICandidate = new DefaultListModel<>();
    

    //calcula a idade
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

    //verifica uma string
    public static boolean isNullOrEmpty(String text) {
        return text.isEmpty() || text.isBlank();
    }
    
    //redimenciona um ImageIcon 
    public static ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        //imagem do icone
        Image img = icon.getImage();
        //redimensionar a imagem
        img = img.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        //retornar um novo icone
        return new ImageIcon(img);
    }

    //Obtem uma imagem apartir de URL e converte-a para byteArray
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
