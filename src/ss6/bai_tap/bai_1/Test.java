package ss6.bai_tap.bai_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Nhập bán kính của hình tròn");
        Scanner input = new Scanner(System.in) ;
        double r = Double.parseDouble(input.nextLine());
        System.out.println("Nhập màu ");
        String x = input.nextLine();
        System.out.println("Nhập Chiều Cao");
        double h = Double.parseDouble(input.nextLine());
        Cylinder cylinder = new Cylinder(h,r,x);
        System.out.println(cylinder);

    }
}
