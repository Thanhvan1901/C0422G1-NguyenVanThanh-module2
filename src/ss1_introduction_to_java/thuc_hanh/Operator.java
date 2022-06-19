package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float weight ;
        float height ;
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter weight");
        weight = scanner.nextFloat() ;

        System.out.println("Enter height");
        height = scanner.nextFloat();
        float area =  weight * height ;

        System.out.println(" Result là : " + area);
    }
}
