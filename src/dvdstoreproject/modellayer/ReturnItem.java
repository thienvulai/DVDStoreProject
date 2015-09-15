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
public class ReturnItem {
    /*
     * Attributes
     */    
    private Long ReturnID;
    private Date DateReturnItem;
    private Integer NbrOfDayLate;
    private Double PaidFire;
    private Double TotalPaid;
    private Long RentItemID;
    
    /*
     * Getters and setters
     */
    public Long getReturnID() {
        return ReturnID;
    }

    public void setReturnID(Long ReturnID) {
        this.ReturnID = ReturnID;
    }

    public Date getDateReturnItem() {
        return DateReturnItem;
    }

    public void setDateReturnItem(Date DateReturnItem) {
        this.DateReturnItem = DateReturnItem;
    }

    public Integer getNbrOfDayLate() {
        return NbrOfDayLate;
    }

    public void setNbrOfDayLate(Integer NbrOfDayLate) {
        this.NbrOfDayLate = NbrOfDayLate;
    }

    public Double getPaidFire() {
        return PaidFire;
    }

    public void setPaidFire(Double PaidFire) {
        this.PaidFire = PaidFire;
    }

    public Double getTotalPaid() {
        return TotalPaid;
    }

    public void setTotalPaid(Double TotalPaid) {
        this.TotalPaid = TotalPaid;
    }

    public Long getRentItemID() {
        return RentItemID;
    }

    public void setRentItemID(Long RentItemID) {
        this.RentItemID = RentItemID;
    }
    
    
    /*
     * constructors
     */
    public ReturnItem(Date DateReturnItem, Integer NbrOfDayLate, Double PaidFire, Double TotalPaid, Long RentItemID) {
        this.DateReturnItem = DateReturnItem;
        this.NbrOfDayLate = NbrOfDayLate;
        this.PaidFire = PaidFire;
        this.TotalPaid = TotalPaid;
        this.RentItemID = RentItemID;
    }
    
    public ReturnItem(){
        
    }
}
