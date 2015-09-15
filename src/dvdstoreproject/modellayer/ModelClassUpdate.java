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
public class ModelClassUpdate {
    private String sqlStatement;
    
    //public functions
    public void update(Customer customer){
        this.sqlStatement = "UPDATE APP.CUSTOMER SET "
                + "FIRSTNAME = " + customer.getFirstname() + ","
                + "LASTNAME = " + customer.getLastname() + ","
                + "PHONE = " + customer.getPhone() + ","
                + "EMAIL = " + customer.getEmail() + ","
                + "STREET = " + customer.getStreet() + ","
                + "SUBURB = " + customer.getSuburb() + ","
                + "CUSTOMERSTATE = " + customer.getCustomerState() + ","
                + "LOGINID = " + customer.getLoginID() + ","
                + "WHERE CUSTOMERID = " + customer.getCustomerID();
        
        updateExecution();
    }
    
    public void update(Login login){
        this.sqlStatement = "UPDATE APP.LOGIN SET "
                + "USERNAME = " + login.getUsername() + ","
                + "PASSWORD = " + login.getPassword() + ","
                + "TYPEOFROLE = " + login.getTypeOfRole() + ","
                + "WHERE LOGINID = " + login.getLoginID();
        
        updateExecution();
    }
    
    public void update(BuyItem buyitem){
        this.sqlStatement = "UPDATE APP.CUSTOMER SET "
                + "RECEIPTNBR = " + buyitem.getReceiptNbr() + ","
                + "DATEBUYITEM = " + buyitem.getDateBuyItem() + ","
                + "QUANTITY = " + buyitem.getQuantity() + ","
                + "PRICE = " + buyitem.getPrice() + ","
                + "DISCOUNT = " + buyitem.getDiscount() + ","
                + "FULLPRICE = " + buyitem.getFullPrice() + ","
                + "TOTALPAID = " + buyitem.getTotalPaid() + ","
                + "CUSTOMERID = " + buyitem.getCustomerID() + ","
                + "ITEMID = " + buyitem.getItemID() + ","
                + "WHERE BUYITEMID = " + buyitem.getBuyItemID();
        
        updateExecution();
    }
    
    public void update(RentItem rentitem){
        this.sqlStatement = "UPDATE APP.CUSTOMER SET "
                + "RECEIPTNBR = " + rentitem.getReceiptNbr() + ","
                + "DATERENT = " + rentitem.getDateRent() + ","
                + "QUANTITY = " + rentitem.getQuantity() + ","
                + "DATERETURN = " + rentitem.getDateReturn() + ","
                + "DISCOUNT = " + rentitem.getDiscount() + ","
                + "DAYOFRENT = " + rentitem.getDayOfRent() + ","
                + "STATUS = " + rentitem.getStatus() + ","
                + "CUSTOMERID = " + rentitem.getCustomerID() + ","
                + "ITEMID = " + rentitem.getItemID() + ","
                + "WHERE RENTITEMID = " + rentitem.getRentItemID();
        
        updateExecution();
    }
    
    public void update(ReturnItem returnitem){
        this.sqlStatement = "UPDATE APP.CUSTOMER SET "
                + "TOTALPAID = " + returnitem.getTotalPaid() + ","
                + "DATERETURNITEM = " + returnitem.getDateReturnItem() + ","
                + "PAIDFIRE = " + returnitem.getPaidFire() + ","
                + "DAYOFRENT = " + returnitem.getNbrOfDayLate() + ","
                + "ITEMID = " + returnitem.getRentItemID() + ","
                + "WHERE BUYITEMID = " + returnitem.getReturnID();
        
        updateExecution();
    }
    
    public void update(Item item){
        this.sqlStatement = "UPDATE APP.CUSTOMER SET "
                + "ITEMNAME = " + item.getItemName() + ","
                + "NBRITEM = " + item.getNbrItem() + ","
                + "PRICE = " + item.getPrice() + ","
                + "CATEGORY = " + item.getCategory() + ","
                + "IMAGE = " + item.getImage() + ","
                + "WHERE ITEMID = " + item.getItemID();
        
        updateExecution();
    }
    
    public void updateExecution(){
        ConnectDB cDB = new ConnectDB();
        
        try {
            Statement statement = cDB.getConnectDB().createStatement();
            statement.executeUpdate(this.sqlStatement);
            JOptionPane.showMessageDialog(null,"Update one row is successful");
        }
        catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    //Constructors
    public ModelClassUpdate(){
        this.sqlStatement = "";
    }

    public ModelClassUpdate(String sqlStatement) {
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