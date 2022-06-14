package ss5.bai_tap.bai_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Classes student = new Classes();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String name = input.nextLine();
        System.out.println("Nhập Lớp Của Bạn");
        String classes = input.nextLine();
        student.setName(name);
        student.setClasses(classes);
    }
}
