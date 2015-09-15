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
public class RentItem {
    /*
     * Attributes
     */
    private Long RentItemID;
    private String ReceiptNbr;
    private Double Discount;
    private Date DateRent;
    private Date DateReturn;
    private Integer Quantity;
    private Integer DayOfRent;
    private String Status;
    private Long CustomerID;
    private Long ItemID;
    
    
    /*
     * Getters and setters
     */
    public Long getRentItemID() {
        return RentItemID;
    }

    public void setRentItemID(Long RentItemID) {
        this.RentItemID = RentItemID;
    }

    public String getReceiptNbr() {
        return ReceiptNbr;
    }

    public void setReceiptNbr(String ReceiptNbr) {
        this.ReceiptNbr = ReceiptNbr;
    }

    public Double getDiscount() {
        return Discount;
    }

    public void setDiscount(Double Discount) {
        this.Discount = Discount;
    }

    public Date getDateRent() {
        return DateRent;
    }

    public void setDateRent(Date DateRent) {
        this.DateRent = DateRent;
    }

    public Date getDateReturn() {
        return DateReturn;
    }

    public void setDateReturn(Date DateReturn) {
        this.DateReturn = DateReturn;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    public Integer getDayOfRent() {
        return DayOfRent;
    }

    public void setDayOfRent(Integer DayOfRent) {
        this.DayOfRent = DayOfRent;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
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

    public RentItem(String ReceiptNbr, Double Discount, Date DateRent, Date DateReturn, Integer Quantity, Integer DayOfRent, String Status, Long CustomerID, Long ItemID) {
        this.ReceiptNbr = ReceiptNbr;
        this.Discount = Discount;
        this.DateRent = DateRent;
        this.DateReturn = DateReturn;
        this.Quantity = Quantity;
        this.DayOfRent = DayOfRent;
        this.Status = Status;
        this.CustomerID = CustomerID;
        this.ItemID = ItemID;
    }
    
    public RentItem(){ 
        
    }
    
}
