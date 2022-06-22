package ss13.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class Tim_chuoi_tang_dan {
    public static void main(String[] args) {
        System.out.println("Nhập Chuỗi ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++) {
                if(string.charAt(j)>list.getLast()){
                    list.add(string.charAt(j));
                }
            }

            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character s: max) {
            System.out.println(s);
        }
        System.out.println();
    }
}
