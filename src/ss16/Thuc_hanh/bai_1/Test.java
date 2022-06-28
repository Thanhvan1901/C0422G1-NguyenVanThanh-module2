package ss16.Thuc_hanh.bai_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file");
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFilerText(path);
    }
}
