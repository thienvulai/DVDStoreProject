/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdstoreproject.modellayer;

/**
 *
 * @author Admin
 */
public class Login {
    /*
     * Attributes
     */
    private Long LoginID;
    private String Username;
    private String Password;
    private String TypeOfRole;
    
    
    /*
     * Getters and setters
     */    
    public Long getLoginID() {
        return LoginID;
    }

    public void setLoginID(Long LoginID) {
        this.LoginID = LoginID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getTypeOfRole() {
        return TypeOfRole;
    }

    public void setTypeOfRole(String TypeOfRole) {
        this.TypeOfRole = TypeOfRole;
    }
    
     
    /*
     * constructors
     */    
    public Login(String Username, String Password, String TypeOfRole) {
        this.Username = Username;
        this.Password = Password;
        this.TypeOfRole = TypeOfRole;
    }    
    
    public Login(){
        
    } 
}
