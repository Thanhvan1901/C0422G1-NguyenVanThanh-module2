package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class Checksnt {
    public static void main(String[] args){
        System.out.println("Kiểm Tra Số Nguyên Tố");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int num = scanner.nextInt();
        if(num <2){
            System.out.println("Không Phải Là Số Nguyên Tố !") ;
        }else {
            int i = 2 ;
            boolean flag = true ;
            while(i <= Math.sqrt(num)){
                if(num % i == 0){
                    flag = false ;
                    break ;
                } i++ ;
            }if(flag){
                System.out.println(num + "Là số nguyên tố nhá ");
            }else {
                System.out.println(num + " Không phải là số nguyên tố");
            }
        }
    }
}
