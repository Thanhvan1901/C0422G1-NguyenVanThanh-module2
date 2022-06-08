package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class Interest {
    public static void main(String[] agrs){
        double money ;
        int month ;
        double interets ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Nhập tiền bạn gởi");
        money = scanner.nextDouble() ;
        System.out.println("nhập tháng bạn gởi");
        month = scanner.nextInt();
        System.out.println("nhập lãi xuất");
        interets = scanner.nextDouble();
        double totalinterets = 0 ;
        for(int i = 0 ; i < month ;i++){
            totalinterets += money * (interets / 100) / 12 * month ;
        }
        System.out.println("Total of interest: " + totalinterets);
    }
}
