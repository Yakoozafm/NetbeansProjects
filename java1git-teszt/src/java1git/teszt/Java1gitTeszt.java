/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1git.teszt;

import javafx.beans.property.SimpleStringProperty;


/**
 *
 * @author yakooza
 */
public class Java1gitTeszt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Eszkoz e1 = new Eszkoz("deel", "ef-123", new SimpleStringProperty("abcdef-123456"));
        System.out.println(e1.aktivalas);
        Szamitogep szg1 = new Szamitogep("3004001", "", "",new SimpleStringProperty("1111-1111"), "win10",
        "integrált", "1gb");
        System.out.println(szg1.aktivalas);
        System.out.println(szg1.gyariszam.getValue());
        System.out.println(szg1.memoria);
        
        
    }
    
}
