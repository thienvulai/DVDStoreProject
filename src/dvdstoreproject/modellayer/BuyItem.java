/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstoreproject.modellayer;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class BuyItem {
    /*
     * Attributes
     */
    private Long BuyItemID;
    private String ReceiptNbr;
    private Date DateBuyItem;
    private Integer Quantity;
    private Double Price;
    private Double Discount;
    private Double FullPrice;
    private Double TotalPaid;
    private Long CustomerID;
    private Long ItemID;
    
    /*
     * Getters and setters
     */
    public Long getBuyItemID() {
        return BuyItemID;
    }

    public void setBuyItemID(Long BuyItemID) {
        this.BuyItemID = BuyItemID;
    }

    public String getReceiptNbr() {
        return ReceiptNbr;
    }

    public void setReceiptNbr(String ReceiptNbr) {
        this.ReceiptNbr = ReceiptNbr;
    }

    public Date getDateBuyItem() {
        return DateBuyItem;
    }

    public void setDateBuyItem(Date DateBuyItem) {
        this.DateBuyItem = DateBuyItem;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public Double getDiscount() {
        return Discount;
    }

    public void setDiscount(Double Discount) {
        this.Discount = Discount;
    }

    public Double getFullPrice() {
        return FullPrice;
    }

    public void setFullPrice(Double FullPrice) {
        this.FullPrice = FullPrice;
    }

    public Double getTotalPaid() {
        return TotalPaid;
    }

    public void setTotalPaid(Double TotalPaid) {
        this.TotalPaid = TotalPaid;
    }

    public Long getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Long CustomerID) {
        this.CustomerID = CustomerID;
    }

    public Long getItemID() {
        return ItemID;
    }

    public void setItemID(Long ItemID) {
        this.ItemID = ItemID;
    }
    
    
    /*
     * constructors
     */
    public BuyItem(String ReceiptNbr, Date DateBuyItem, Integer Quantity, Double Price, Double Discount, Double FullPrice, Double TotalPaid, Long CustomerID, Long ItemID) {
        this.ReceiptNbr = ReceiptNbr;
        this.DateBuyItem = DateBuyItem;
        this.Quantity = Quantity;
        this.Price = Price;
        this.Discount = Discount;
        this.FullPrice = FullPrice;
        this.TotalPaid = TotalPaid;
        this.CustomerID = CustomerID;
        this.ItemID = ItemID;
    }
    
    public BuyItem(){        
    }    
}
