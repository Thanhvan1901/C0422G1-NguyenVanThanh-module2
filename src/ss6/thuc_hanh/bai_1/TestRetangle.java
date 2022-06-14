package ss6.thuc_hanh.bai_1;

import java.util.Scanner;

public class TestRetangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Scanner inpunt = new Scanner(System.in) ;
        System.out.println("Nhập màu");
        String x = inpunt.nextLine() ;
        System.out.println("Nhập Chiều Rộng Hình Chữ Nhật");
        double w = Double.parseDouble(inpunt.nextLine()) ;
        System.out.println("Nhập Chiều Dài Hình Chữ Nhật");
        double l = Double.parseDouble(inpunt.nextLine());
        Rectangle rectangle1 = new Rectangle(w,l,x,true) ;
        System.out.println(rectangle1);
    }
}
