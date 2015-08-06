package model.pojo;
// Generated Jul 14, 2015 10:47:49 AM by Hibernate Tools 4.3.1



import java.util.HashSet;
import java.util.Set;

/**
 * Caterers generated by hbm2java
 */
public class Caterers  implements java.io.Serializable {


     private int id;
     private Accounts accounts;
     private Cities cities;
     private String catererName;
     private String catererPhoneNumber;
     private String catererEmail;
     private String catererAddress;
     private Set supplierInvoiceses = new HashSet(0);
     private Set workerTypeses = new HashSet(0);
     private Set customerInvoiceses = new HashSet(0);
     private Set menuses = new HashSet(0);

    public Caterers() {
    }

	
    public Caterers(int id) {
        this.id = id;
    }
    public Caterers(int id, Accounts accounts, Cities cities, String catererName, String catererPhoneNumber, String catererEmail, String catererAddress, Set supplierInvoiceses, Set workerTypeses, Set customerInvoiceses, Set menuses) {
       this.id = id;
       this.accounts = accounts;
       this.cities = cities;
       this.catererName = catererName;
       this.catererPhoneNumber = catererPhoneNumber;
       this.catererEmail = catererEmail;
       this.catererAddress = catererAddress;
       this.supplierInvoiceses = supplierInvoiceses;
       this.workerTypeses = workerTypeses;
       this.customerInvoiceses = customerInvoiceses;
       this.menuses = menuses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Accounts getAccounts() {
        return this.accounts;
    }
    
    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }
    public Cities getCities() {
        return this.cities;
    }
    
    public void setCities(Cities cities) {
        this.cities = cities;
    }
    public String getCatererName() {
        return this.catererName;
    }
    
    public void setCatererName(String catererName) {
        this.catererName = catererName;
    }
    public String getCatererPhoneNumber() {
        return this.catererPhoneNumber;
    }
    
    public void setCatererPhoneNumber(String catererPhoneNumber) {
        this.catererPhoneNumber = catererPhoneNumber;
    }
    public String getCatererEmail() {
        return this.catererEmail;
    }
    
    public void setCatererEmail(String catererEmail) {
        this.catererEmail = catererEmail;
    }
    public String getCatererAddress() {
        return this.catererAddress;
    }
    
    public void setCatererAddress(String catererAddress) {
        this.catererAddress = catererAddress;
    }
    public Set getSupplierInvoiceses() {
        return this.supplierInvoiceses;
    }
    
    public void setSupplierInvoiceses(Set supplierInvoiceses) {
        this.supplierInvoiceses = supplierInvoiceses;
    }
    public Set getWorkerTypeses() {
        return this.workerTypeses;
    }
    
    public void setWorkerTypeses(Set workerTypeses) {
        this.workerTypeses = workerTypeses;
    }
    public Set getCustomerInvoiceses() {
        return this.customerInvoiceses;
    }
    
    public void setCustomerInvoiceses(Set customerInvoiceses) {
        this.customerInvoiceses = customerInvoiceses;
    }
    public Set getMenuses() {
        return this.menuses;
    }
    
    public void setMenuses(Set menuses) {
        this.menuses = menuses;
    }




}

