package ss12_map.bai_tap.bai_1_QuanLiSanPham;

public class Product implements Comparable<Product> {
    private int id ;
    private String name ;
    private String productinon ;
    private int yearproduc ;
    private int price;

    public Product() {
    }

    public Product(int id, String name, String productinon, int yearproduc, int price) {
        this.id = id;
        this.name = name;
        this.productinon = productinon;
        this.yearproduc = yearproduc;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductinon() {
        return productinon;
    }

    public void setProductinon(String productinon) {
        this.productinon = productinon;
    }

    public int getYearproduc() {
        return yearproduc;
    }

    public void setYearproduc(int yearproduc) {
        this.yearproduc = yearproduc;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productinon='" + productinon + '\'' +
                ", yearproduc='" + yearproduc + '\'' +
                ", price=" + price+
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice() - o.getPrice();
    }
}
