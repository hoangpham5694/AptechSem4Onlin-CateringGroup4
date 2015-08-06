package model.pojo;
// Generated Jul 14, 2015 10:47:49 AM by Hibernate Tools 4.3.1

/**
 * SupplierChildInvoices generated by hbm2java
 */
public class SupplierChildInvoices  implements java.io.Serializable {


     private int id;
     private SupplierInvoices supplierInvoices;
     private String materialName;
     private Integer quantity;
     private Double materialPricePerUnit;

    public SupplierChildInvoices() {
    }

	
    public SupplierChildInvoices(int id) {
        this.id = id;
    }
    public SupplierChildInvoices(int id, SupplierInvoices supplierInvoices, String materialName, Integer quantity, Double materialPricePerUnit) {
       this.id = id;
       this.supplierInvoices = supplierInvoices;
       this.materialName = materialName;
       this.quantity = quantity;
       this.materialPricePerUnit = materialPricePerUnit;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public SupplierInvoices getSupplierInvoices() {
        return this.supplierInvoices;
    }
    
    public void setSupplierInvoices(SupplierInvoices supplierInvoices) {
        this.supplierInvoices = supplierInvoices;
    }
    public String getMaterialName() {
        return this.materialName;
    }
    
    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getMaterialPricePerUnit() {
        return this.materialPricePerUnit;
    }
    
    public void setMaterialPricePerUnit(Double materialPricePerUnit) {
        this.materialPricePerUnit = materialPricePerUnit;
    }




}


