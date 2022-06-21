package ss12_map.bai_tap.bai_1_QuanLiSanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Scanner in = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();


    public static void add(){ // thêm
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID");
        int id = Integer.parseInt(input.nextLine()) ;

        System.out.println("Nhập tên sản phẩm");
        String name = input.nextLine();

        System.out.println("Nhà sản xuất");
        String production = input.nextLine();

        System.out.println("Nhập Năm sản xuất");
        int year = Integer.parseInt(input.nextLine());
        System.out.println("nhập giá sp:");
        int price = Integer.parseInt(input.nextLine());

        products.add(new Product(id, name, production, year,price));

    }
    public static void edit(){
        System.out.println("Nhập id sản phẩm cần sửa");
        int id = Integer.parseInt(in.nextLine());
        boolean flg = true;
        for (int i = 0; i < products.size(); i++) {
            if(id == products.get(i).getId()){
                flg = false;
                System.out.println("Nhập tên sản phẩm");
                String name = in.nextLine();
                products.get(i).setName(name);

                System.out.println("Nhập nhà sản xuất");
                String production = in.nextLine();
                products.get(i).setProductinon(production);

                System.out.println("Nhập năm sản xuất");
                int year = Integer.parseInt(in.nextLine());
                products.get(i).setYearproduc(year);

                System.out.println("nhập giá sp:");
                int price = Integer.parseInt(in.nextLine());
                products.get(i).setPrice(price);
            }
        }
        if(flg){
            System.out.println("ID này không có hihi");
        }
    }
    public static void del(){
        System.out.println("nhập id sản phẩm cân xóa:");
        int id = Integer.parseInt(in.nextLine());
        boolean flg = true;
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()){
                flg = false;
                products.remove(products.get(i));
            }
        }
        if(flg){
            System.out.println("id này chưa tồn tại!!!");
        }
    }
    public static void display(){
        for(Product s: products){
            System.out.println(s);
        }
    }
    public static void find(){
        System.out.println("nhập tên muốn tìm:");
        String name = in.nextLine();
        boolean flg = true;
        for (int i = 0; i < products.size(); i++) {
            if (name.equals(products.get(i).getName())){
                System.out.println(products.get(i));
                flg = false;
            }
        }
        if (flg){
            System.out.println("tên sản phẩm không tồn tại!");
        }
    }
    public static void sortProduct(){
        Collections.sort(products);
        display();
    }
    public static void sortDecrease(){
        Decrease decrease = new Decrease();
        Collections.sort(products,decrease);
        display();
    }

}
