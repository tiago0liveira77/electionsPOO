/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.bo;

import electionspoo.beanbuilder.ElectorBeanBuilder;
import electionspoo.beans.ElectorBean;
import electionspoo.utils.MainUtils;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class ElectorBO{

    //arraylist com os eleitores lidos do ficheiro + os que estão em memória
    private static ArrayList<ElectorBean> electorList;
    
    //retorna a arraylist
    public static ArrayList<ElectorBean> getList(){
        return electorList;
    }

    //formata eleitor para mostrar JList
    public static String getGUIListLine(ElectorBean electorBean) {
        return String.format("%08d | %c | %s | %-20s", electorBean.getCC(), electorBean.getGender(), electorBean.getBirthDate(), electorBean.getName());
    }

    //apaga um eleitor da arraylist dado o seu index
    public static void deleteElectorFromList(ArrayList<ElectorBean> electorList, int id) throws IOException, FileNotFoundException, ClassNotFoundException, ParseException {
        electorList.remove(id);
    }

    //procura um eleitor pelo nome na arraylist
    public static int searchElectorByName(ArrayList<ElectorBean> electorList, String text) {

        for (ElectorBean elector : electorList) {
            if (elector.getName().contains(text)) {
                return electorList.indexOf(elector);
            }
        }
        return 0;
    }

    //procura um eleitor pelo CC na arraylist
    public static int searchElectorByCC(ArrayList<ElectorBean> electorList, String text) {

        for (ElectorBean elector : electorList) {
            if (String.valueOf(elector.getCC()).contains(text)) {
                return electorList.indexOf(elector);
            }
        }
        return 0;
    }

    //funcao que obtem uma foto de 1 pessoa random de acordo com o genero e intervalo de idade
    public static ImageIcon getRandomPhoto(char gender, int idade) throws IOException {
        String genderFinal = "male";
        if (gender == ('M') || gender == ('m')) {
            genderFinal = "male";
        } else {
            genderFinal = "female";
        }

        byte[] urlSearch = MainUtils.imageFromURLToByteArray(new URL("https://fakeface.rest/face/json?gender=" + genderFinal + "&minimum_age=" + (idade - 5) + "&maximum_age=" + (idade + 5)));
        System.out.println("https://fakeface.rest/face/json?gender=" + genderFinal + "&minimum_age=" + (idade - 5) + "&maximum_age=" + (idade + 5));
        String getPhotoUrl = (getPhotoUrl = new String(urlSearch)).substring(getPhotoUrl.indexOf("https://"));
        getPhotoUrl = getPhotoUrl.substring(0, getPhotoUrl.indexOf(".jpg")) + ".jpg";
        byte[] finalPhotoUrl = MainUtils.imageFromURLToByteArray(new URL(getPhotoUrl));
        BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(finalPhotoUrl));
        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        return imageIcon;
    }

    //guarda a arraylist num ficheiro
    public static void save(String nomeFicheiro) throws Exception {
        ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(nomeFicheiro));
        file.writeObject(electorList);
        file.close();
    }

    //le um ficheiro e passa os dados para a arraylist
    public static void load(String nomeFicheiro) throws Exception {
        if (new File(nomeFicheiro).exists()) {
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(nomeFicheiro));
            electorList = (ArrayList<ElectorBean>) file.readObject();
            file.close();
        } else {
            electorList = new ArrayList();
            electorList.add(ElectorBeanBuilder.buildRandomElectorBean());
        }
    }
    
    

}
