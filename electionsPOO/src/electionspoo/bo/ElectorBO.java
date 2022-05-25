/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.bo;

import electionspoo.beans.ElectorBean;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author User
 */
public class ElectorBO {
    
    
    private static String electorFilePath="C:\\Users\\User\\OneDrive\\Documents\\Teste file\\object.txt";
    
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
}
