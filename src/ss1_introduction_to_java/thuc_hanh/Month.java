package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Nhập Tháng Cần Kiểm Tra");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("Tháng " + month + " Có 28 hoặc 29 ngày .");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " Có 31 Ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng" + month + " Có 30 ngày");
                break;
        }
    }
}
