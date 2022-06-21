package ss12.bai_tap.bai_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi vào mảng ");
        String n = input.nextLine();
        for (int i = 0; i < n.length(); i++) {
            stringStack.push(n.charAt(i) + "");
        }
        System.out.println(stringStack);
        for (int z = stringStack.size() ; z > 0; z--) {
            System.out.println(stringStack.pop());
        }
    }

}
