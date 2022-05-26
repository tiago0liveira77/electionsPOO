/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.bo;

import electionspoo.beans.ElectorBean;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Tiago
 */
public class ElectorBOOliveira {

    private static String electorFilePath = "electors.txt";
    private static File electorsFile = new File(electorFilePath);

    public static void createFile() throws FileNotFoundException, IOException, ParseException {
        if (!electorsFile.exists()) {
            FileOutputStream f = new FileOutputStream(electorsFile);
            ObjectOutputStream o = new ObjectOutputStream(f);

            SimpleDateFormat formatter1 = new SimpleDateFormat("dd/mm/yyyy");
            Date birth = formatter1.parse("06/06/2001");

            ArrayList<ElectorBean> lista2 = new ArrayList();
            lista2.add(new ElectorBean("Nome", 12345678, 'M', birth, "123"));

            o.writeObject(lista2);

            o.close();
            f.close();
        }
    }

    public static void saveToFile(ElectorBean elector) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
        if (!electorsFile.exists()) {
            //System.out.println("FICHEIRO NAO EXISTE");
            createFile();
        } else {

            try {
                FileInputStream fi = new FileInputStream(electorsFile);
                ObjectInputStream oi = new ObjectInputStream(fi);

                // Read objects
                //Person pr1 = (Person) oi.readObject();
                //Person pr2 = (Person) oi.readObject();
                ArrayList<ElectorBean> lista2 = (ArrayList<ElectorBean>) oi.readObject();

                lista2.add(elector);

                oi.close();
                fi.close();

                FileOutputStream f = new FileOutputStream(electorsFile);
                ObjectOutputStream o = new ObjectOutputStream(f);

                o.writeObject(lista2);

                for (int i = 0; i < lista2.size(); i++) {
                    System.out.println(lista2.get(i));
                }

                o.close();
                f.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public static ArrayList<ElectorBean> readFile() throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
        if (!electorsFile.exists()) {
            //System.out.println("FICHEIRO NAO EXISTE");
            createFile();
        } else {

            try {
                FileInputStream fi = new FileInputStream(electorsFile);
                ObjectInputStream oi = new ObjectInputStream(fi);

                // Read objects
                //Person pr1 = (Person) oi.readObject();
                //Person pr2 = (Person) oi.readObject();
                ArrayList<ElectorBean> lista2 = (ArrayList<ElectorBean>) oi.readObject();

                oi.close();
                fi.close();
                
                return lista2;
    

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        ArrayList<ElectorBean> listaERRO = new ArrayList();
        System.out.println("listaERRO");
        return listaERRO;
    }
}
