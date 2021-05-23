package model;

public abstract class Services {
    public String nameServices;
    public float useArea;
    public int rentalCosts;
    public int maxQuantity;
    public String rentalType;
    public String id;
    public String addNameServices;
    public String unit;
    public float price;

    public Services() {
    }

    public Services(String nameServices, float useArea, int rentalCosts, int maxQuantity, String rentalType, String id) {
        this.nameServices = nameServices;
        this.useArea = useArea;
        this.rentalCosts = rentalCosts;
        this.maxQuantity = maxQuantity;
        this.rentalType = rentalType;
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public float getUseArea() {
        return useArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public String getId() {
        return id;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public void setUseArea(float useArea) {
        this.useArea = useArea;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddNameServices() {
        return addNameServices;
    }

    public void setAddNameServices(String addNameServices) {
        this.addNameServices = addNameServices;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    abstract void showInfor();

}
