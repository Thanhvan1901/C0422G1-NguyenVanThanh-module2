package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        System.out.println("Giải Phương Trình Bậc Nhất !") ;
        System.out.println(" Nhập Giá Trị a ; b;c Vào Biểu thức a*x+b=c");
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("a =");
        double a = scanner.nextDouble() ;
        System.out.println("b =");
        double b = scanner.nextDouble();
        System.out.println("c =");
        double c = scanner.nextDouble();
        if (a != 0 ){
            double answer = (c- b)/a ;
            System.out.println(answer);
        }else if (b == c){
            System.out.println("kết quả là x = 0 ");
        }else {
            System.out.println("vô Nghiệm");
        }
    }
}
