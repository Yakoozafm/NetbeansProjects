package java1git.teszt;

import java.sql.Date;
import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author yakooza
 */
public class Eszkoz {
    int id;
    Boolean aktiv = true;
    Boolean selejtezheto = true;
    SimpleStringProperty gyariszam;
    String marka;
    String tipus;
    Date aktivalas;
    Date selejtjav;
    Date selejtezve;
    Eszkoz(){this.aktivalas= Date.valueOf(LocalDate.now());};
    Eszkoz(String marka, String tipus, SimpleStringProperty gyariszam){
        this.marka=marka;
        this.tipus=tipus;
        this.gyariszam=gyariszam;
        this.aktivalas= Date.valueOf(LocalDate.now());
    }
    void torol(int id){
        this.aktiv = false;
    }
}
