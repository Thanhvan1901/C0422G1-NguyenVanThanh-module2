package ss3_array.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Maxinarray2d {
    public static void main(String[] args) {
        int a , b , i ,j ;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Độ Dài Của Cột :");
        a = Integer.parseInt(input.nextLine());
        System.out.println("Nhập Độ Dài Của Hàng");
        b = Integer.parseInt(input.nextLine());
        int[][] arr = new int[a][b] ;
        for (i = 0 ; i < a ; i++){
            for (j = 0; j < b ; j++) {
                arr[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        for (int k = 0; k <arr.length ; k++) {
            System.out.println(Arrays.toString(arr[k]));
        }
        int max = arr[0][0];
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                if(max < arr[k][l]){
                    max = arr[k][l] ;
                }
            }
        }
        System.out.println(max);
    }
}
