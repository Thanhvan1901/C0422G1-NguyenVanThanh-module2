package ss3_array.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Pusharr {
    public static void main(String[] args) {
        int[] arr = new int[10] ;
        arr[0] = 1 ;
        arr[1] = 2 ;
        arr[2] = 3 ;
        arr[3] = 4 ;
        System.out.println(Arrays.toString(arr));
        int a , num , i , j ;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Số Cần Thêm Vào Mảng :");
        num = input.nextInt();
        System.out.println("Nhập Vào Vị Trí Cần Thêm Vào Mảng");
        a = input.nextInt();
        for (i = 0 ; i < arr.length ; i++){
            if(a == i){
                for(j = arr.length-1 ; j > i ; j--){
                    arr[j] = arr[j-1] ;
                }arr[i] = num ;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
