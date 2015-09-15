/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstoreproject;

import dvdstoreproject.modellayer.Login;
import dvdstoreproject.modellayer.ModelClassView;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DVDStoreProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MainDVDStore mDVDStore = new MainDVDStore();
        //mDVDStore.setVisible(true);
        /*InsertModelClass ic = new InsertModelClass("INSERT INTO APP.LOGIN (USERNAME, PASSWORD, TYPEOFROLE) "
                + "VALUES ('peter', '123 data from database in jtable in java456', 'customer')");
        ic.insertExecution();
        
        UpdateModelClass uc = new UpdateModelClass("UPDATE APP.LOGIN SET \"USERNAME\" = 'Peter' WHERE LOGINID = 1");
        uc.updateExecution();
        
        DeleteModelClass dc = new DeleteModelClass("DELETE FROM LOGIN WHERE LOGINID = 2");
        dc.deleteExecution();*/
        
        ModelClassView vc = new ModelClassView("SELECT * FROM LOGIN");
        ArrayList<Login> arrlistLogin = vc.viewLogin();
    }
}