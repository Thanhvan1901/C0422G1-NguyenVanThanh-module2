package ss3_array.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Totalarray {
    public static void main(String[] agrs){
        int[] arr1 = new int[5] ;
        int[] arr2 = new int[5] ;
        Scanner input = new Scanner(System.in);
        int i,j;
        for(i = 0 ; i < arr1.length; i++){
            System.out.println("Nhập Phần Tử Vào Mảng 1 Có độ Dài Là 5 :");
            arr1[i] = input.nextInt();
        }System.out.println(Arrays.toString(arr1));
        for (j = 0 ; j < arr2.length ; j++){
            System.out.println("Nhập Phần Tử Vào Mảng 2 Có Độ Dài là 5 :");
            arr2[j] = input.nextInt();
        }System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[10] ;
        System.arraycopy(arr1,0,arr3,0,5);
        System.arraycopy(arr2,0,arr3,5,5);
        System.out.println(Arrays.toString(arr3));
    }
}
