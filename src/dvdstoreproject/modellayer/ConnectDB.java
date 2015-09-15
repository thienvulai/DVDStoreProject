/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstoreproject.modellayer;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ConnectDB {
    public Connection getConnectDB(){
        Connection c  = null;
        try {
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/ProjectDB");
            //JOptionPane.showMessageDialog(null,"Connection is successful");
            // do stuff
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
        return c;
    }
}