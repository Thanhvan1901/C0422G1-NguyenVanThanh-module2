package ss3_array.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Deletearray {
    public static void main(String[] agrs) {
        int[] arr = new int[10] ;
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;
        arr[6] = 6;
        arr[7] = 7;
        arr[8] = 8;
        arr[9] = 9;
        System.out.println("Mảng Ban Đầu Là : " + Arrays.toString(arr));
        System.out.println("Nhập số cần xóa");
        Scanner input = new Scanner(System.in) ;
        int num = input.nextInt() , i , j ;
        boolean flag = true ;
        for(i = 0 ; i < arr.length ; i++){
            if(num == arr[i]){
                flag = false ;
                for(j = i ; j < arr.length-1; j++){
                    arr[j] = arr[j+1];
                }System.out.println(Arrays.toString(arr));
            }
        }if(flag){
            System.out.println("Số Bạn Nhập Không Có");
        }
    }
}
