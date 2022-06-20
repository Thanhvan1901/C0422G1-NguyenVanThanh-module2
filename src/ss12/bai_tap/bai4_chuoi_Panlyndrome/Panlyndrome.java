package ss12.bai_tap.bai4_chuoi_Panlyndrome;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Panlyndrome {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi bạn muốn kiểm tra:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }
        if (inputString.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");
    }
}
