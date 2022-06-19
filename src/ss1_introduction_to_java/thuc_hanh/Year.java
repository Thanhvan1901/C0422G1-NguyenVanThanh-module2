package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        System.out.println("Nhập Năm Cần Kiểm Tra");
        Scanner scanner = new Scanner(System.in) ;
        int year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
    }

