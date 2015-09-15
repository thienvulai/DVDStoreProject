/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstoreproject.presenterlayer;

import dvdstoreproject.modellayer.BuyItem;
import dvdstoreproject.modellayer.Customer;
import dvdstoreproject.modellayer.Item;
import dvdstoreproject.modellayer.Login;
import dvdstoreproject.modellayer.ModelClassDelete;
import dvdstoreproject.modellayer.ModelClassInsert;
import dvdstoreproject.modellayer.ModelClassUpdate;
import dvdstoreproject.modellayer.ModelClassView;
import dvdstoreproject.modellayer.RentItem;
import dvdstoreproject.modellayer.ReturnItem;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MyPresenter implements IPresenter{
    
    //Insert
    @Override
    public void insertCustomer(Customer customer){
        //Call function insert new Customer from Model layer        
        new ModelClassInsert().insert(customer);
    }

    @Override
    public void insertLogin(Login login) {
        //Call function insert Login from Model layer
        new ModelClassInsert().insert(login);
    }

    @Override
    public void insertRentItem(RentItem rentitem) {
        //set Status of rentitem
        rentitem.setStatus("RENT");        
        //Call function insert rent item from Model layer
        new ModelClassInsert().insert(rentitem);
    }

    @Override
    public void insertReturnItem(ReturnItem returnitem) {
        new ModelClassInsert().insert(returnitem);
    }

    @Override
    public void insertBuyItem(BuyItem buyitem,Item item) {        
        //Calculate full Price and Total paid
        buyitem.setPrice(searchItem(buyitem.getItemID()).getPrice());
        buyitem.setFullPrice(buyitem.getQuantity() * buyitem.getPrice());
        buyitem.setTotalPaid((buyitem.getQuantity() - buyitem.getPrice()) - buyitem.getDiscount());
        
        new ModelClassInsert().insert(buyitem);
        
        item.setNbrItem(item.getNbrItem() - buyitem.getQuantity());
        updateItem(item);
    }

    @Override
    public void insertItem(Item item) {
        new ModelClassInsert().insert(item);
    }

    //Update
    @Override
    public void updateCustomer(Customer customer) {
        new ModelClassUpdate().update(customer);
    }

    @Override
    public void updateLogin(Login login) {
        new ModelClassUpdate().update(login);
    }

    @Override
    public void updateRentItem(RentItem rentitem) {
        new ModelClassUpdate().update(rentitem);
    }

    @Override
    public void updateReturnItem(ReturnItem returnitem) {
        new ModelClassUpdate().update(returnitem);
    }

    @Override
    public void updateBuyItem(BuyItem buyitem) {
        new ModelClassUpdate().update(buyitem);
    }

    @Override
    public void updateItem(Item item) {
        new ModelClassUpdate().update(item);
    }

    //Delete
    @Override
    public void deleteCustomer(Long ID) {
        new ModelClassDelete().deleteCustomer(ID);
    }

    @Override
    public void deleteLogin(Long ID) {
        new ModelClassDelete().deleteLogin(ID);
    }

    @Override
    public void deleteRentItem(Long ID) {
        new ModelClassDelete().deleteRentItem(ID);
    }

    @Override
    public void deleteReturnItem(Long ID) {
        new ModelClassDelete().deleteReturnItem(ID);
    }

    @Override
    public void deleteBuyItem(Long ID) {
        new ModelClassDelete().deleteBuyItem(ID);
    }

    @Override
    public void deleteItem(Long ID) {
        new ModelClassDelete().deleteItem(ID);
        
    }

    //View
    @Override
    public ArrayList<Customer> viewCustomer() {
        return new ModelClassView().viewCustomer();
    }

    @Override
    public ArrayList<Login> viewLogin() {      
        return new ModelClassView().viewLogin();
    }

    @Override
    public ArrayList<RentItem> viewRentItem() {
        return new ModelClassView().viewRentItem();
    }

    @Override
    public ArrayList<ReturnItem> viewReturnItem() {
        return new ModelClassView().viewReturnItem();
    }

    @Override
    public ArrayList<BuyItem> viewBuyItem() {
        return new ModelClassView().viewBuyItem();
    }

    @Override
    public ArrayList<Item> viewItem() {
        return new ModelClassView().viewItem();
    }

    @Override
    public ArrayList<Item> searchItem(Long ID, String NameItem) {
        return new ModelClassView().searchItem(ID,NameItem);
    }

    @Override
    public Item searchItem(Long ID) {       
        return new ModelClassView().searchItem(ID);
    }
}