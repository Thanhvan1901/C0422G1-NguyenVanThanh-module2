package ss4.thuchanh.bai_1;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        double wight , hight ;
        System.out.println("Chu vi và diện tích hình chữ nhật");
        Scanner input = new Scanner(System.in) ;
        System.out.println("Nhập wight");
         wight = Integer.parseInt(input.nextLine()) ;
        System.out.println("Nhập hight");
         hight = Integer.parseInt(input.nextLine()) ;
         Rectangle rectangle = new Rectangle(wight , hight) ;
        System.out.println("Area của hình chữ nhật là : " + rectangle.getArea());
        System.out.println("Perimeter của hình chữ nhật là : " + rectangle.getPerimeter());
        System.out.println(rectangle.getDisplay());
    }
}
