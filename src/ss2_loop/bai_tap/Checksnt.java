package ss2_loop.bai_tap;

import java.util.Scanner;

public class Checksnt {
    public static void main(String[] args) {
        System.out.println("Hiển Thị 20 Số Nguyên Tố Đầu Tiên");
        int prime = 2, count = 0, tmp;
        while (count < 20){
            tmp = 0;
            for (int i = 1; i <= prime; i++){
                if (prime % i == 0){
                    tmp++;
                }
            }if (tmp == 2){
                System.out.println(prime);
                count++;
            }
            prime++;
        }
    }
}
