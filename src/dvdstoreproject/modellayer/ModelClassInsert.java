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
public class ModelClassInsert {
    //Attributes
    private String sqlStatement;
    
    
    //public functions
    public void insert(Customer customer){
        sqlStatement = "INSERT INTO APP.CUSTOMER "
                + "(FIRSTNAME, LASTNAME, PHONE, EMAIL, STREET, SUBURB, CUSTOMERSTATE, LOGINID)"
                + " VALUES(" + customer.getFirstname() + ","
                + customer.getLastname() + ","
                + customer.getPhone() + ","
                + customer.getEmail() + ","
                + customer.getStreet() + ","
                + customer.getSuburb() + ","
                + customer.getCustomerState() + ","
                + customer.getLoginID() + ")";
        
        insertExecution();
    }
    
    public void insert(Login login){
        sqlStatement = "INSERT INTO APP.LOGIN "
                + "(USERNAME, PASSWORD, TYPEOFROLE)"
                + login.getUsername() + ","
                + login.getPassword() + ","
                + login.getTypeOfRole() + ")";
        
        insertExecution();
    }
    
    public void insert(RentItem rentitem){
        sqlStatement = "INSERT INTO APP.RENTITEM "
                + "(RECEIPTNBR, DISCOUNT, DATERENT, DATERETURN, QUANTITY, DAYOFRENT, STATUS, CUSTOMERID,ITEMID)"
                + rentitem.getReceiptNbr() + ","
                + rentitem.getDiscount() + ","
                + rentitem.getDateRent() + ","
                + rentitem.getDateReturn() + ","
                + rentitem.getQuantity() + ","
                + rentitem.getDayOfRent() + ","
                + rentitem.getStatus() + ","
                + rentitem.getCustomerID() + ","
                + rentitem.getItemID() + ")";
        
        insertExecution();
    }
    
    public void insert(ReturnItem returnitem){
        sqlStatement = "INSERT INTO APP.RETURNITEM "
                + "(DATERETURNITEM, NBROFDAYLATE, PAIDFIRE, TOTALPAID, RENTITEMID) VALUES ("
                + "'" + returnitem.getDateReturnItem() + "',"
                + returnitem.getNbrOfDayLate() + ", "
                + returnitem.getPaidFire() + ", "
                + returnitem.getTotalPaid() + ", "
                + returnitem.getRentItemID() + ")";
        
        insertExecution();
    }
    
    public void insert(BuyItem buyitem){
        sqlStatement = "INSERT INTO APP.RENTITEM "
                + "(RECEIPTNBR, DATEBUYITEM, QUANTITY, PRICE, DISCOUNT, FULLPRICE, TOTALPAID, CUSTOMERID, ITEMID) VALUES ("
                + "'" + buyitem.getReceiptNbr() + "', "
                + "'" + buyitem.getDateBuyItem() + "', "
                + buyitem.getQuantity() + ", "
                + buyitem.getPrice() + ", "
                + buyitem.getDiscount() + ", "
                + buyitem.getFullPrice() + ", "
                + buyitem.getTotalPaid() + ")";
        
        insertExecution();
    }
    
    public void insert(Item item){
        sqlStatement = "INSERT INTO APP.ITEM (ITEMNAME, NBRITEM, PRICE, CATEGORY, IMAGE) VALUES ("
                + "'" + item.getItemName()+ "',"
                + item.getNbrItem() + ","
                + item.getPrice() + ","
                + "'" + item.getCategory() + "',"
                + "'" + item.getImage() + "'"
                + ")";
        
        insertExecution();
    }
    
    /*public boolean insertExecution(String sqlStatement){
        if(!sqlStatement.equals("")){
            ConnectDB cDB = new ConnectDB();
        
            try {
                Statement statement = cDB.getConnectDB().createStatement();
                statement.executeUpdate(sqlStatement);
                JOptionPane.showMessageDialog(null,"insert one row is successful");
            }
            catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null,e);
                return false;
            }
        }      

        return true;
    }*/
    
    public void insertExecution(){
            ConnectDB cDB = new ConnectDB();
        
            try {
                Statement statement = cDB.getConnectDB().createStatement();
                statement.executeUpdate(this.sqlStatement);
                JOptionPane.showMessageDialog(null,"insert one row is successful");
            }
            catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null,e);
            }
    }
    
    //Constructors
    public ModelClassInsert(){
    }

    public ModelClassInsert(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    //setters and getters
    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public String getSqlStatement() {
        return sqlStatement;
    } 
}