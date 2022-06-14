package ss5.bai_tap.bai_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle() ;
        System.out.println("Bán Kính Của Hình Tròn là : " + circle.getRadius());
        System.out.println("Diện Tích Của Hình Tròn Là :" + circle.getArea());
        System.out.println("Nhập Bán Kính Hình Tròn");
        Scanner input = new Scanner(System.in);
        double x = Integer.parseInt(input.nextLine()) ;
        Circle circle1 = new Circle(x) ;
        System.out.println("bán Kính hình tròn là " + circle1.getRadius());
        System.out.println("diện tích hình tròn là :" + circle1.getArea());
    }
}
