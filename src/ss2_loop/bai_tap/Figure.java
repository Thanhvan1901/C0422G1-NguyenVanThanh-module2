package ss2_loop.bai_tap;

import java.util.Scanner;

public class Figure {
    public static void main(String[] agrs) {
        System.out.println("Hiển Thị Các Hình");
        System.out.println("Chọn hình muốn hiển thị");
        System.out.println("1:Hình Chữ Nhật");
        System.out.println("2:Hình  tam giác vuông, có cạnh góc vuông ở botton-left");
        System.out.println("3:Hình tam giác vuông, có cạnh góc vuông ở top-left  ");
        System.out.println("4:Hình tam giác cân");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.print("Nhập Chiều rộng : ");
                int width = input.nextInt();
                System.out.print("Nhập Chiều dài : ");
                int hight = input.nextInt();
                for (int i = 0; i < hight; i++) {
                    System.out.println(" ");
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                }
                break ;
            case 2:
                System.out.print("Nhập Chiều dài : ");
                 hight = input.nextInt();
                for (int i = 1; i <= hight; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }
                break ;
            case 3:
                System.out.println("Nhập Chiều Dài");
                hight = input.nextInt();
                for(int i = hight ; i >= 1 ; i-- ){
                    for (int j = 1 ; j <= i ; j++){
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break ;
            case 4:
                System.out.println("Nhập Chiều Dài");
                hight = input.nextInt();
                for(int i = 1 ; i < hight ; i++){
                    for(int j = hight ; j > i ; j-- ){
                        System.out.print("   ");
                    }
                    for(int x = 0 ; x < 2 * i - 1 ; x++){
                        System.out.print(" * ");
                    }System.out.println("");
                }
                break ;
        }

    }
}
