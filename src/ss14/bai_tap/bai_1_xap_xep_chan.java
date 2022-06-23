package ss14.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bai_1_xap_xep_chan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng");
        int m = Integer.parseInt(scanner.nextLine());
        int array[] = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("nhập phần tử thứ " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        insertionSort(array);
    }

    private static void insertionSort(int[]arr){
        int x;
        int pos;
        for (int i = 1; i < arr.length ; i++) {
            x = arr[i];
            pos =i;
            while (0<pos && x<arr[pos - 1]){
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = x;
            System.out.println("Lần thứ" +i +": "+ Arrays.toString(arr));
        }
    }
}
