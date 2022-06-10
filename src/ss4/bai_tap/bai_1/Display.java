package ss4.bai_tap.bai_1;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        System.out.println("Tính Căn Bậc Hai");
        int a , b ,c ;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Nhập a");
        a = Integer.parseInt(input.nextLine());
        System.out.println("Nhập b");
        b = Integer.parseInt(input.nextLine());
        System.out.println("Nhập c");
        c = Integer.parseInt(input.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation( a , b , c) ;
        System.out.println("Delta = "+quadraticEquation.getDiscriminant());
        if(quadraticEquation.getDiscriminant() > 0){
            System.out.println("Chương Trình Có 2 Nghiệm Phân Biệt: ");
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.println("Chương Trình Có 1 Nghiệm Kẹp :");
            System.out.println("x1 = x2 = " + quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
