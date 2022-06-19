package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Body {
    public static void main(String[] args) {
        System.out.println("Tính Chỉ Số Của Cơ Thể");
        double weight , heigth , bmi ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Nhập Cân Nhập");
        weight = scanner.nextDouble();
        System.out.println("Nhập Chiều Cao");
        heigth = scanner.nextDouble();
        bmi = weight * Math.pow(heigth,2) ;
        System.out.println("BMI của Bạn Là : " + bmi);
        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi < 25){
            System.out.println("Normal");
        }else if(bmi <30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
