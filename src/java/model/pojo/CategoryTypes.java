package model.pojo;
// Generated Jul 14, 2015 10:47:49 AM by Hibernate Tools 4.3.1



import java.util.HashSet;
import java.util.Set;

/**
 * CategoryTypes generated by hbm2java
 */
public class CategoryTypes  implements java.io.Serializable {


     private int id;
     private String categoryTypeName;
     private Set menuses = new HashSet(0);

    public CategoryTypes() {
    }

	
    public CategoryTypes(int id) {
        this.id = id;
    }
    public CategoryTypes(int id, String categoryTypeName, Set menuses) {
       this.id = id;
       this.categoryTypeName = categoryTypeName;
       this.menuses = menuses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getCategoryTypeName() {
        return this.categoryTypeName;
    }
    
    public void setCategoryTypeName(String categoryTypeName) {
        this.categoryTypeName = categoryTypeName;
    }
    public Set getMenuses() {
        return this.menuses;
    }
    
    public void setMenuses(Set menuses) {
        this.menuses = menuses;
    }




}


