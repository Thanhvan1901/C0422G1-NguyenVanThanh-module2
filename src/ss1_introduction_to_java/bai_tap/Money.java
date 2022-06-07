package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        System.out.println("Chuyển Đổi Tiền Tệ USD Sang VNĐ");
        double num , money ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số Tiền USD Cần Chuyển Đổi");
        num = scanner.nextDouble();
        money = num * 23000 ;
        System.out.println("Giá Trị Tiền Việt Là : " + money + " VNĐ");

    }
}
