package ss6.thuc_hanh.bai_1;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle() ;
        System.out.println(circle);
        Scanner input = new Scanner(System.in) ;
        System.out.println("Nhập bán kính hình tròn");
        double r = Double.parseDouble(input.nextLine());
        System.out.println("Nhập Màu");
        String x = input.nextLine();

        Circle circle1 = new Circle(r, x ,false ) ;
        System.out.println(circle1);
    }
}
