package ss3_array.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        int a , b , i , j ;
        System.out.println("Tìm Số Nhỏ Nhất Trong Mảng");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Độ Dài Của Cột");
        a = Integer.parseInt(input.nextLine());
        b = a ;
        int[][] arr = new int[a][b] ;
        for(i = 0 ; i < a ; i++){
            for (j = 0 ; j <b ; j++){
                arr[i][j] = Integer.parseInt(input.nextLine()) ;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int k = 0; k < arr.length; k++) {
            System.out.println(Arrays.toString(arr[k]));
        }
        int sum = 0 ;
        for (int k = 0; k < a; k++) {
            for (int l = 0; l < b; l++) {
                if(k == l){
                    sum += arr[k][l];
                }
            }
        }
        System.out.println("Tổng Đường Chéo Là : " + sum);
    }
}
