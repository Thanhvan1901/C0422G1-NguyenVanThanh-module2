package ss12.bai_tap.bai_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Độ Dài Của Mảng");
        int num = input.nextInt();
        int [] arr = new int[num] ;
        System.out.println("Nhập số vào mảng");
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int z = 0; z < arr.length; z++) {
            integerStack.push(arr[z]);
        }
        for (int i = integerStack.size(); i > 0; i--) {
            System.out.println(integerStack.pop());
        }

    }
}
