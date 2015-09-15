/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstoreproject.modellayer;

import java.sql.Blob;

/**
 *
 * @author Admin
 */
public class Item {
    /*
     * Attributes
     */
    private Long ItemID;
    private String ItemName;
    private Integer NbrItem;
    private Double Price;
    private String Category;
    private Blob Image;
    
    
    /*
     * Getters and setters
     */

    public Long getItemID() {
        return ItemID;
    }

    public void setItemID(Long ItemID) {
        this.ItemID = ItemID;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public Integer getNbrItem() {
        return NbrItem;
    }

    public void setNbrItem(Integer NbrItem) {
        this.NbrItem = NbrItem;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public Blob getImage() {
        return Image;
    }

    public void setImage(Blob Image) {
        this.Image = Image;
    }
    
    
    /*
     * constructors
     */
    public Item(String ItemName, Integer NbrItem, Double Price, String Category, Blob Image) {
        this.ItemName = ItemName;
        this.NbrItem = NbrItem;
        this.Price = Price;
        this.Category = Category;
        this.Image = Image;
    }
    
    public Item(){
        
    }
}
