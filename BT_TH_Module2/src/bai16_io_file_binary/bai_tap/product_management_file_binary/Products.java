package bai16_io_file_binary.bai_tap.product_management_file_binary;

import java.io.Serializable;

public class Products implements Serializable {
    private String id;
    private String nameProdct;
    private String brand;
    private float price;
    private String description;

    public Products() {
    }

    public Products(String id, String nameProdct, String brand, float price, String description) {
        this.id = id;
        this.nameProdct = nameProdct;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProdct() {
        return nameProdct;
    }

    public void setNameProdct(String nameProdct) {
        this.nameProdct = nameProdct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "id= " + id +
                ", nameProdct= '" + nameProdct + '\'' +
                ", brand= '" + brand + '\'' +
                ", price= " + price +
                ", description= '" + description + '\'';
    }
}
