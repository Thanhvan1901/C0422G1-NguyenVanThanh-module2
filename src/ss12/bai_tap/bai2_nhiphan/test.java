package ss12.bai_tap.bai2_nhiphan;

import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập Số nguyên dương");
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        while (num > 0){
            int x = num % 2 ;
            stack.push(x);
            num = num / 2 ;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }
}
