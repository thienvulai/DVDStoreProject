/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstoreproject.presenterlayer;
import dvdstoreproject.modellayer.BuyItem;
import dvdstoreproject.modellayer.Customer;
import dvdstoreproject.modellayer.Item;
import dvdstoreproject.modellayer.Login;
import dvdstoreproject.modellayer.RentItem;
import dvdstoreproject.modellayer.ReturnItem;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface IPresenter {
    void insertCustomer(Customer customer);
    void insertLogin(Login login);
    void insertRentItem(RentItem rentitem);
    void insertReturnItem(ReturnItem returnitem);
    void insertBuyItem(BuyItem buyitem, Item item);
    void insertItem(Item item);
    
    //Update functions
    void updateCustomer(Customer customer);
    void updateLogin(Login login);
    void updateRentItem(RentItem rentitem);
    void updateReturnItem(ReturnItem returnitem);
    void updateBuyItem(BuyItem buyitem);
    void updateItem(Item item);
    
    //Delete functions
    void deleteCustomer(Long ID);
    void deleteLogin(Long ID);
    void deleteRentItem(Long ID);
    void deleteReturnItem(Long ID);
    void deleteBuyItem(Long ID);
    void deleteItem(Long ID);
    
    //View functions
    ArrayList<Customer> viewCustomer();
    ArrayList<Login> viewLogin();
    ArrayList<RentItem> viewRentItem();
    ArrayList<ReturnItem> viewReturnItem();
    ArrayList<BuyItem> viewBuyItem();
    ArrayList<Item> viewItem();
    
    //Search function
    ArrayList<Item> searchItem(Long ID,String NameItem);
    Item searchItem (Long ID);
}