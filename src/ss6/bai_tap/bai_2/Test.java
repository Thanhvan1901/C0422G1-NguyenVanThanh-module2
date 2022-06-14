package ss6.bai_tap.bai_2;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập x");
        float x = input.nextFloat();
        System.out.println("Nhập y");
        float y = input.nextFloat();
        System.out.println("Nhập z");
        float z = input.nextFloat();
        Point3D point3D1 = new Point3D(x, y, z);
        System.out.println(point3D1);
        System.out.println(Arrays.toString(point3D1.getXYZ()));
    }
}
