/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstoreproject.modellayer;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ModelClassDelete {
    private String sqlStatement; 
    
    //public functions
    public void deleteCustomer(Long ID){
        sqlStatement = "DELETE FROM APP.CUSTOMER WHERE CUSTOMERID = " + ID;
        deleteExecution();
    }
    
    public void deleteLogin(Long ID){
        sqlStatement = "DELETE FROM APP.LOGIN WHERE LOGINID = " + ID;
        deleteExecution();
    }
    
    public void deleteRentItem(Long ID){
        sqlStatement = "DELETE FROM APP.RENTITEM WHERE RENTITEMID = " + ID;
        deleteExecution();
    }
    
    public void deleteReturnItem(Long ID) {
        sqlStatement = "DELETE FROM APP.RETURNITEM WHERE RETURNITEMID = " + ID;
        deleteExecution();
    }
    
    public void deleteBuyItem(Long ID) {
        sqlStatement = "DELETE FROM APP.BUYITEM WHERE BUYITEMID = " + ID;
        deleteExecution();
    }
    
    public void deleteItem(Long ID) {
        sqlStatement = "DELETE FROM APP.ITEM WHERE ITEMID = " + ID;
        deleteExecution();
    }
    
    public void deleteExecution(){
        ConnectDB cDB = new ConnectDB();
        
        try {
            Statement statement = cDB.getConnectDB().createStatement();
            statement.executeUpdate(this.sqlStatement);
            JOptionPane.showMessageDialog(null,"Delete one row is successful");
        }
        
        catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    //Constructors
    public ModelClassDelete(){
        this.sqlStatement = "";
    }

    public ModelClassDelete(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }
    
    //getters and setters
    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public String getSqlStatement() {
        return sqlStatement;
    }
}