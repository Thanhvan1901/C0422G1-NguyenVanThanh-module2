package ss13.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần kiểm tra");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (max.size() < list.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character s : max) {
            System.out.println(s);
        }
    }
}
