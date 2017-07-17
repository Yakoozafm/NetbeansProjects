package java1git.teszt;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author yakooza
 */
public class Szamitogep extends Eszkoz{
    String leltartiszama;
    String memoria;
    String processzor;
    String videokartya;
    String oprendszer;
    
    Szamitogep(){};
    
    Szamitogep(String leltariszam, String marka, String tipus, SimpleStringProperty gyariszam,
               String oprendszer, String videokartya, String memoria){
        this.leltartiszama = leltariszam;
        this.marka = marka;
        this.tipus = tipus;
        this.gyariszam = gyariszam;
        this.oprendszer = oprendszer;
        this.videokartya = videokartya;
        this.memoria = memoria;        
    }
}
