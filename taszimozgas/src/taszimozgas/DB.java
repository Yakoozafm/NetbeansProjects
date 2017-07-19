package taszimozgas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
    private final String user = "geppark";
    private final String password = "geppark";
    private final String url = "jdbc:postgresql://213.16.101.18/taszimozgas";
    Connection conn;
    Statement st;
    ResultSet rs;

    public DB() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Kapcsolat kiépült.");
        } catch (SQLException ex) {
        }
    }
    public void lezar() {
        try {
            conn.close();
        } catch (SQLException ex) {
        }
    }
    
    public ResultSet iranyok() {
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
        }

        
        try {
            rs = st.executeQuery("SELECT * FROM irany");
            
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
    }

    

}

