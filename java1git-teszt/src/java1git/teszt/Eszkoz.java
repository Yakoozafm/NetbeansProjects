package java1git.teszt;

//import java.sql.Date;
import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
/**
 *
 * @author yakooza
 */
public class Eszkoz {
    private IntegerProperty Id;
    private BooleanProperty Aktiv;
    private IntegerProperty Megnevezes;
    private SimpleStringProperty St_Megnevezes;
    private SimpleStringProperty Leltariszam;
    private SimpleStringProperty Gyariszam;
    private SimpleStringProperty Marka;
    private SimpleStringProperty Tipus;
    private SimpleStringProperty Processzor;
    private SimpleStringProperty Memoria;
    private IntegerProperty Oprendszer;
    private SimpleStringProperty St_Oprendszer;
    private IntegerProperty Technologia;
    private SimpleStringProperty St_Technologia;
    private BooleanProperty Mobil;
    private BooleanProperty Selejtezheto;
    private ObjectProperty<LocalDate> Seljav;
    private SimpleStringProperty Selindok;
    private ObjectProperty<LocalDate> Aktivalva;
    private IntegerProperty Forras;
    private SimpleStringProperty St_Forras;
    private ObjectProperty<LocalDate> SelejtMinDatum;
    
    
    Eszkoz(){
//        this.Aktivalva.set(LocalDate.now());
    }
    
    Eszkoz(String marka, String tipus, String gyariszam){
        this.Marka = new SimpleStringProperty(marka);
        this.Tipus = new SimpleStringProperty(tipus);
        this.Gyariszam = new SimpleStringProperty(gyariszam);
        this.Aktivalva = new SimpleObjectProperty(LocalDate.now());
    }
    LocalDate leker(){
        return this.Aktivalva.get();
    }
    
    void torol(int id){
        this.Aktiv.set(false);
    }
}
