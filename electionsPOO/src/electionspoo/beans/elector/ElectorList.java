/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electionspoo.beans.elector;

import electionspoo.beanbuilder.ElectorBeanBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class ElectorList{

    //arraylist com os eleitores lidos do ficheiro + os que estão em memória
    private static ArrayList<ElectorBean> electorList;
    
    //retorna a arraylist
    public static ArrayList<ElectorBean> getList(){
        return electorList;
    }
    
    //Ordena a arraylist de eleitores por CC
    public static void orderArrayListByCC() {
        Collections.sort(electorList);
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
        //verifica genero
        String genderFinal = "male";
        if (gender == ('M') || gender == ('m')) {
            genderFinal = "male";
        } else {
            genderFinal = "female";
        }

        //abrir stream para o url da API
        InputStream in = URI.create("https://fakeface.rest/face/json?gender=" + genderFinal + "&minimum_age=" + (idade - 5) + "&maximum_age=" + (idade + 5)).toURL().openStream();
        
        //Ler o JSON da API
        byte[] bytes = new byte[in.available()];
        in.read(bytes);
        String json = new String(bytes);
        
        //extrair o url da imagem: Começa por "https://" e acaba em .jpg
        String url = json.substring(json.indexOf("https://"), json.lastIndexOf(".jpg") + 4);
        
        //converte o url em ImageIcon 
        ImageIcon imageIcon = new ImageIcon(new URL(url));
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
            save(nomeFicheiro);
        }
    }
    
    

}
