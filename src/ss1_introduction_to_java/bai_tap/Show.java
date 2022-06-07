package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Show {
    public static void main(String[] args) {
        System.out.println("Nhập tên của bạn");
        String name ;
        Scanner scanner = new Scanner(System.in) ;
        name = scanner.nextLine();
        System.out.println("Xin chào bạn " + name);
    }
}
