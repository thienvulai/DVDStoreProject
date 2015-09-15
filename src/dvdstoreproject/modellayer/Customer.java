/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstoreproject.modellayer;

/**
 *
 * @author Admin
 */
public class Customer {  
    
    /*
     * Attributes
     */
    private Long CustomerID;
    private String Firstname;
    private String Lastname;
    private String Phone;
    private String Email;
    private String Street;
    private String Suburb;
    private String CustomerState;
    private Long LoginID;
    
    
    /*
     * Getters and setters
     */ 
    public Long getCustomerID() {
        return CustomerID;
    }
    
    public void setCustomerID(Long CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getSuburb() {
        return Suburb;
    }

    public void setSuburb(String Suburb) {
        this.Suburb = Suburb;
    }

    public String getCustomerState() {
        return CustomerState;
    }

    public void setCustomerState(String CustomerState) {
        this.CustomerState = CustomerState;
    }

    public Long getLoginID() {
        return LoginID;
    }

    public void setLoginID(Long LoginID) {
        this.LoginID = LoginID;
    } 

    
    /*
     * constructors
     */     
    public Customer(String Firstname, String Lastname, String Phone, String Email, String Street, String Suburb, String CustomerState, Long LoginID) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Phone = Phone;
        this.Email = Email;
        this.Street = Street;
        this.Suburb = Suburb;
        this.CustomerState = CustomerState;
        this.LoginID = LoginID;
    }   
    
    public Customer(){
        
    }
}