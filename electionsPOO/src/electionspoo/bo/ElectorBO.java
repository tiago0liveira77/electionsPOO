/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.bo;

import electionspoo.beans.ElectorBean;
import electionspoo.utils.enums.FirstNamesEnum;
import electionspoo.utils.enums.LastNamesEnum;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author User
 */
public class ElectorBO {
    
    
    private static String electorFilePath="C:\\Users\\Tiago\\OneDrive\\Documentos\\Teste file\\object.txt";
    
    private static int maxCCNumber = 99999999;
    private static int minCCNumber = 1000000;
    
    public static void saveElectorOnFile(ElectorBean electorBean) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(electorFilePath);
                
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(electorBean);

    }
    
    public static void getElectorFromFile() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        FileInputStream fileIn = new FileInputStream(electorFilePath);
        
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        ElectorBean electorBean = (ElectorBean) objectIn.readObject();
        
        electorBean.printElector();
        System.out.println("Nome : " + electorBean.getName());
        objectIn.close();
        
    }
    
    public static FirstNamesEnum getRandomFirstName(Random rd){
        return FirstNamesEnum.values()[rd.nextInt(5)];
    }
    
     public static LastNamesEnum getRandomLastName(Random rd){
        return LastNamesEnum.values()[rd.nextInt(5)];
    }
     
    public static int getRandom8DigitNumber(Random rd){  
        return randBetween(minCCNumber, maxCCNumber);
    }
    
    public static GregorianCalendar getRandomBirthDate(GregorianCalendar gc){
       
       int year = randBetween(1900, 2010);

       gc.set(gc.YEAR, year);

       int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

       gc.set(gc.DAY_OF_YEAR, dayOfYear);

       return gc;
    }
    
    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}
