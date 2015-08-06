package model.pojo;
// Generated Jul 14, 2015 10:47:49 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * SubMenus generated by hbm2java
 */
public class SubMenus  implements java.io.Serializable {


     private int id;
     private Menus menus;
     private String subMenuName;
     private Integer numberOfFood;
     private Set foodses = new HashSet(0);

    public SubMenus() {
    }

	
    public SubMenus(int id) {
        this.id = id;
    }
    public SubMenus(int id, Menus menus, String subMenuName, Integer numberOfFood, Set foodses) {
       this.id = id;
       this.menus = menus;
       this.subMenuName = subMenuName;
       this.numberOfFood = numberOfFood;
       this.foodses = foodses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Menus getMenus() {
        return this.menus;
    }
    
    public void setMenus(Menus menus) {
        this.menus = menus;
    }
    public String getSubMenuName() {
        return this.subMenuName;
    }
    
    public void setSubMenuName(String subMenuName) {
        this.subMenuName = subMenuName;
    }
    public Integer getNumberOfFood() {
        return this.numberOfFood;
    }
    
    public void setNumberOfFood(Integer numberOfFood) {
        this.numberOfFood = numberOfFood;
    }
    public Set getFoodses() {
        return this.foodses;
    }
    
    public void setFoodses(Set foodses) {
        this.foodses = foodses;
    }




}

