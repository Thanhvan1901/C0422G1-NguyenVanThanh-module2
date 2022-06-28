package ss17.bai_tap1.Model;

import java.io.Serializable;

public class ProductManagement implements Serializable {
    private int code ;
    private String name ;
    private String producName;
    private  double price ;
    private  String describe ;

    public ProductManagement()  {
    }

    public ProductManagement(int code, String name, String producName, double price, String describe) {
        this.code = code;
        this.name = name;
        this.producName = producName;
        this.price = price;
        this.describe = describe;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducName() {
        return producName;
    }

    public void setProducName(String producName) {
        this.producName = producName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "ProductManagement" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", producName='" + producName + '\'' +
                ", price=" + price +
                ", describe='" + describe + '\'';
    }
}
