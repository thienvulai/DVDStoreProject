/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstoreproject.modellayer;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ModelClassView {
    private String sqlStatement;
    private ArrayList<Login> arrlistLogin ;
    private ArrayList<Customer> arrlistCustomer;
    private ArrayList<BuyItem> arrlistBuyItem;
    private ArrayList<Item> arrlistItem;
    private ArrayList<RentItem> arrlistRentItem;
    private ArrayList<ReturnItem> arrlistReturnItem;

    
    
    
    //constructor
    public ModelClassView() {
    }

    public ModelClassView(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        
    }
    
    // public functions
    public ArrayList<Login> viewLogin(){
        this.sqlStatement = "select * from APP.LOGIN";
        this.arrlistLogin = new ArrayList<>();
        ConnectDB cDB = new ConnectDB();
        Statement statement;
        ResultSet rs;
        
        try {
            statement = cDB.getConnectDB().createStatement();
            rs = statement.executeQuery(this.sqlStatement);
            
            if (rs!=null){
                while(rs.next()){
                    Login login = new Login();
                    login.setLoginID(rs.getLong("LOGINID"));
                    login.setUsername(rs.getString("USERNAME"));
                    login.setPassword(rs.getString("PASSWORD"));
                    login.setTypeOfRole(rs.getString("TYPEOFROLE"));
                    
                    this.arrlistLogin.add(login);
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"errors: "+e);
        }
        
        return arrlistLogin;
    }
    
    public ArrayList<Customer> viewCustomer(){
        this.sqlStatement = "select * from APP.CUSTOMER";
        this.arrlistCustomer = new ArrayList<>();
        ConnectDB cDB = new ConnectDB();
        Statement statement;
        ResultSet rs;
        
        try {
            statement = cDB.getConnectDB().createStatement();
            rs = statement.executeQuery(this.sqlStatement);
            
            if (rs!=null){
                while(rs.next()){
                    Customer customer = new Customer();
                    customer.setCustomerID(rs.getLong("CUSTOMERID"));
                    customer.setFirstname(rs.getString("FIRSTNAME"));
                    customer.setFirstname(rs.getString("LASTNAME"));
                    customer.setFirstname(rs.getString("PHONE"));
                    customer.setFirstname(rs.getString("EMAIL"));
                    customer.setFirstname(rs.getString("STREET"));
                    customer.setFirstname(rs.getString("SURBURB"));
                    customer.setFirstname(rs.getString("CUSTOMERSTATE"));
                    customer.setFirstname(rs.getString("LOGINID"));
                    this.arrlistCustomer.add(customer);
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"errors: "+e);
        }
        
        return arrlistCustomer;
    }
    
    public ArrayList<BuyItem> viewBuyItem(){
        this.sqlStatement = "select * from APP.BUYITEM";
        this.arrlistBuyItem = new ArrayList<>();
        ConnectDB cDB = new ConnectDB();
        Statement statement;
        ResultSet rs;
        
        try {
            statement = cDB.getConnectDB().createStatement();
            rs = statement.executeQuery(this.sqlStatement);
            
            if (rs!=null){
                while(rs.next()){
                    BuyItem buyitem = new BuyItem();
                    buyitem.setBuyItemID(rs.getLong("BUYITEMID"));
                    buyitem.setReceiptNbr(rs.getString("RECEIPTNBR"));
                    buyitem.setDateBuyItem(rs.getDate("DATEBUYITEM"));
                    buyitem.setQuantity(rs.getInt("QUANTITY"));
                    buyitem.setPrice(rs.getDouble("PRICE"));
                    buyitem.setDiscount(rs.getDouble("DISCOUNT"));
                    buyitem.setFullPrice(rs.getDouble("FULLPRICE"));
                    buyitem.setTotalPaid(rs.getDouble("TOTALPAID"));
                    buyitem.setCustomerID(rs.getLong("CUSTOMERID"));
                    buyitem.setItemID(rs.getLong("ITEMID"));
                    
                    arrlistBuyItem.add(buyitem);
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"errors: "+e);
        }  
        
        return arrlistBuyItem;
    }
    
    public ArrayList<Item> viewItem(){
        this.sqlStatement = "select * from APP.ITEM";
        if(!this.sqlStatement.equals("")){
            this.arrlistItem = new ArrayList<>();
            ConnectDB cDB = new ConnectDB();
            Statement statement;
            ResultSet rs;
        
            try {
                statement = cDB.getConnectDB().createStatement();
                rs = statement.executeQuery(this.sqlStatement);
                
                if (rs!=null){
                    while(rs.next()){
                        Item item = new Item();
                        item.setItemID(rs.getLong("ITEMID"));
                        item.setItemName(rs.getString("ITEMNAME"));
                        item.setNbrItem(rs.getInt("NBRITEM"));
                        item.setPrice(rs.getDouble("PRICE"));
                        item.setCategory(rs.getString("CATEGORY"));
                        item.setImage(rs.getBlob("IMAGE"));
                        
                        arrlistItem.add(item);
                    }
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"errors: "+e);
            }
        }      

        return arrlistItem;
    }
    
    public ArrayList<RentItem> viewRentItem(){
        this.sqlStatement = "select * from APP.RENTITEM";
        this.arrlistRentItem = new ArrayList<>();
            ConnectDB cDB = new ConnectDB();
            Statement statement;
            ResultSet rs;
        
            try {
                statement = cDB.getConnectDB().createStatement();
                rs = statement.executeQuery(this.sqlStatement);
                
                if (rs!=null){
                    while(rs.next()){
                        RentItem rentitem = new RentItem();
                        rentitem.setRentItemID(rs.getLong("RENTITEMID"));
                        rentitem.setReceiptNbr(rs.getString("RECEIPTNBR"));
                        rentitem.setDiscount(rs.getDouble("DISCOUNT"));
                        rentitem.setDateRent(rs.getDate("DATERENT"));
                        rentitem.setDateReturn(rs.getDate("DATERETURN"));
                        rentitem.setQuantity(rs.getInt("QUANTITY"));
                        rentitem.setDayOfRent(rs.getInt("DAYOFRENT"));
                        rentitem.setStatus(rs.getString("STATUS"));
                        rentitem.setCustomerID(rs.getLong("CUSTOMERID"));
                        rentitem.setItemID(rs.getLong("ITEMID"));
                        
                        arrlistRentItem.add(rentitem);
                    }
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"errors: "+e);
            }      

        return arrlistRentItem;
    }
    
    public ArrayList<ReturnItem> viewReturnItem(){
        this.sqlStatement = "select * from APP.RETURNITEM";
        
        this.arrlistReturnItem = new ArrayList<>();
        ConnectDB cDB = new ConnectDB();
        Statement statement;
        ResultSet rs;
        
        try {
            statement = cDB.getConnectDB().createStatement();
            rs = statement.executeQuery(this.sqlStatement);
            
            if (rs!=null){
                while(rs.next()){
                    ReturnItem returnitem = new ReturnItem();
                    returnitem.setReturnID(rs.getLong("RETURNITEMID"));
                    returnitem.setDateReturnItem(rs.getDate("DATERETURNITEM"));
                    returnitem.setNbrOfDayLate(rs.getInt("NBROFDAYLATE"));
                    returnitem.setTotalPaid(rs.getDouble("TOTALPAID"));
                    returnitem.setRentItemID(rs.getLong("RENTITEMID"));
                    arrlistReturnItem.add(returnitem);
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"errors: "+e);
        }
        return arrlistReturnItem;
    }
    
    public ArrayList<Item> searchItem(Long ID, String NameItem){
        sqlStatement = "select * from APP.ITEM WHERE ID = " + ID + " OR UPPER(ITEMNAME) LIKE UPPER('%" + NameItem + "%')";
        this.arrlistItem = new ArrayList<>();
        ConnectDB cDB = new ConnectDB();
        Statement statement;
        ResultSet rs;
        
        try {
            statement = cDB.getConnectDB().createStatement();
            rs = statement.executeQuery(this.sqlStatement);
            
            if (rs!=null){
                while(rs.next()){
                    if(ID==rs.getLong("ITEMID")){
                        Item item = new Item();
                        item.setItemID(rs.getLong("ITEMID"));
                        item.setItemName(rs.getString("ITEMNAME"));
                        item.setNbrItem(rs.getInt("NBRITEM"));
                        item.setPrice(rs.getDouble("PRICE"));
                        item.setCategory(rs.getString("CATEGORY"));
                        item.setImage(rs.getBlob("IMAGE"));
                        arrlistItem.add(item);
                    }
                    if(NameItem.equals(rs.getString("ITEMNAME"))){
                        Item item = new Item();
                        item.setItemID(rs.getLong("ITEMID"));
                        item.setItemName(rs.getString("ITEMNAME"));
                        item.setNbrItem(rs.getInt("NBRITEM"));
                        item.setPrice(rs.getDouble("PRICE"));
                        item.setCategory(rs.getString("CATEGORY"));
                        item.setImage(rs.getBlob("IMAGE"));
                        
                        arrlistItem.add(item);
                    }
                }
            }
        }
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"errors: "+e);
        } 
        
        return arrlistItem;
    }
    
    public Item searchItem(Long ID){
        sqlStatement = "select * from APP.ITEM WHERE ID = " + ID;
        this.arrlistItem = new ArrayList<>();
        ConnectDB cDB = new ConnectDB();
        Statement statement;
        ResultSet rs;
        
        try {
            statement = cDB.getConnectDB().createStatement();
            rs = statement.executeQuery(this.sqlStatement);
            
            if (rs!=null){
                while(rs.next()){
                    if(ID==rs.getLong("ITEMID")){
                        Item item = new Item();
                        item.setItemID(rs.getLong("ITEMID"));
                        item.setItemName(rs.getString("ITEMNAME"));
                        item.setNbrItem(rs.getInt("NBRITEM"));
                        item.setPrice(rs.getDouble("PRICE"));
                        item.setCategory(rs.getString("CATEGORY"));
                        item.setImage(rs.getBlob("IMAGE"));
                        return item;
                    }
                }
            }
        }
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"errors: "+e);
        } 
        
        return null;
    }
    
    //getters and setters    
    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public String getSqlStatement() {
        return sqlStatement;
    }        

    public ArrayList<Login> getArrlistLogin() {
        return arrlistLogin;
    }

    public void setArrlistLogin(ArrayList<Login> arrlistLogin) {
        this.arrlistLogin = arrlistLogin;
    }

    public ArrayList<Customer> getArrlistCustomer() {
        return arrlistCustomer;
    }

    public void setArrlistCustomer(ArrayList<Customer> arrlistCustomer) {
        this.arrlistCustomer = arrlistCustomer;
    }

    public ArrayList<BuyItem> getArrlistBuyItem() {
        return arrlistBuyItem;
    }

    public void setArrlistBuyItem(ArrayList<BuyItem> arrlistBuyItem) {
        this.arrlistBuyItem = arrlistBuyItem;
    }

    public ArrayList<Item> getArrlistItem() {
        return arrlistItem;
    }

    public void setArrlistItem(ArrayList<Item> arrlistItem) {
        this.arrlistItem = arrlistItem;
    }

    public ArrayList<RentItem> getArrlistRentItem() {
        return arrlistRentItem;
    }

    public void setArrlistRentItem(ArrayList<RentItem> arrlistRentItem) {
        this.arrlistRentItem = arrlistRentItem;
    }

    public ArrayList<ReturnItem> getArrlistReturnItem() {
        return arrlistReturnItem;
    }

    public void setArrlistReturnItem(ArrayList<ReturnItem> arrlistReturnItem) {
        this.arrlistReturnItem = arrlistReturnItem;
    }    
}