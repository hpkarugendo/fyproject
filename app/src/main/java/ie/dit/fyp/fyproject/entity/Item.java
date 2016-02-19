package ie.dit.fyp.fyproject.entity;

import java.io.Serializable;

/**
 * Created by Black on 05/02/2016.
 */
public class Item implements Serializable{
    private int id, quantity;
    private String name, cat, subCat, subSubCat;
    private double price;
    private boolean kid, veg, hot, glass, bottle, pint;

    public Item() {
        this.id = 0;
        this.name = "";
        this.cat = "";
        this.subCat = "";
        this.subSubCat = "";
        this.quantity = 1000;
        this.price = 0.00;
        this.kid = false;
        this.veg = false;
        this.glass = false;
        this.bottle = false;
        this.pint = false;
        this.hot = false;
    }

    public String getSubSubCat() {
        return subSubCat;
    }

    public void setSubSubCat(String subSubCat) {
        this.subSubCat = subSubCat;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getSubCat() {
        return subCat;
    }

    public void setSubCat(String subCat) {
        this.subCat = subCat;
    }

    public boolean isKid() {
        return kid;
    }

    public void setKid(boolean kid) {
        this.kid = kid;
    }

    public boolean isVeg() {
        return veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public boolean isGlass() {
        return glass;
    }

    public void setGlass(boolean glass) {
        this.glass = glass;
    }

    public boolean isBottle() {
        return bottle;
    }

    public void setBottle(boolean bottle) {
        this.bottle = bottle;
    }

    public boolean isPint() {
        return pint;
    }

    public void setPint(boolean pint) {
        this.pint = pint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
