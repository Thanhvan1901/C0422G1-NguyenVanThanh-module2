package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Transfer {
    public static void main(String[] args) {
        System.out.println("Ứng Dụng Đọc Số Thành Chữ");
        int num ;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.println("Số của bạn cần kiểm Tra Là : " + num);
        int numten = num % 10 ;
        int sodauhangchuc = num / 10 ;
        int sosauhangchuc = num % 10 ;
        int sodauhangtram = num /100 ;
        int sothuhaihangtram = (num / 10 ) %10 ;
        int sothubahangtram = (num%100)%10 ;
        if(0<=num && num<=10){
            switch (num){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                case 10:
                    System.out.print("Ten ");
                    break;
            }
        }else if( num<19){
            switch (numten){
                case 1:
                    System.out.print(" Eleven ");
                    break;
                case 2:
                    System.out.print(" Twelve ");
                    break;
                case 3:
                    System.out.print(" Thirteen ");
                    break;
                case 4:
                    System.out.print(" Fourteen ");
                    break;
                case 5:
                    System.out.print(" Fifteen ");
                    break;
                case 6:
                    System.out.print(" Sixteen ");
                    break;
                case 7:
                    System.out.print(" Seventeen ");
                    break;
                case 8:
                    System.out.print(" Eighteen ");
                    break;
                case 9:
                    System.out.print(" Nineteen ");
                    break;
            }
        }else if( num < 99 ){
            switch (sodauhangchuc){
                case 2:
                    System.out.print(" twenty ");
                    break;
                case 3:
                    System.out.print(" thirty ");
                    break;
                case 4:
                    System.out.print(" forty ");
                    break;
                case 5:
                    System.out.print(" fifty ");
                    break;
                case 6:
                    System.out.print(" sixty ");
                    break;
                case 7:
                    System.out.print(" seventy ");
                    break;
                case 8:
                    System.out.print(" eighty ");
                    break;
                case 9:
                    System.out.print(" ninety ");
                    break;
            }
            switch(sosauhangchuc){
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    System.out.print(" One ");
                    break;
                case 2:
                    System.out.print(" Two ");
                    break;
                case 3:
                    System.out.print(" Three ");
                    break;
                case 4:
                    System.out.print(" Four ");
                    break;
                case 5:
                    System.out.print(" Five ");
                    break;
                case 6:
                    System.out.print(" Six ");
                    break;
                case 7:
                    System.out.print(" Seven ");
                    break;
                case 8:
                    System.out.print(" Eight ");
                    break;
                case 9:
                    System.out.print(" Nine ");
                    break;
            }
        }else if(num <1000){
            switch (sodauhangtram){
                case 1:
                    System.out.print(" One hundred ");
                    break;
                case 2:
                    System.out.print(" Two hundred ");
                    break;
                case 3:
                    System.out.print(" Three hundred ");
                    break;
                case 4:
                    System.out.print(" Four hundred ");
                    break;
                case 5:
                    System.out.print(" Five hundred ");
                    break;
                case 6:
                    System.out.print(" Six hundred ");
                    break;
                case 7:
                    System.out.print(" Seven hundred ");
                    break;
                case 8:
                    System.out.print(" Eight hundred ");
                    break;
                case 9:
                    System.out.print(" Nine hundred ");
                    break;
            }
            switch (sothuhaihangtram){
                case 0:
                    System.out.print("and");
                    break;
                case 1:
                    System.out.print(" Eleven ");
                    break;
                case 2:
                    System.out.print(" Twelve ");
                    break;
                case 3:
                    System.out.print(" Thirteen ");
                    break;
                case 4:
                    System.out.print(" Fourteen ");
                    break;
                case 5:
                    System.out.print(" Fifteen ");
                    break;
                case 6:
                    System.out.print(" Sixteen ");
                    break;
                case 7:
                    System.out.print(" Seventeen ");
                    break;
                case 8:
                    System.out.print(" Eighteen ");
                    break;
                case 9:
                    System.out.print(" Nineteen ");
                    break;
            }
            switch (sothubahangtram){
                    case 0:
                        System.out.println(" ");
                        break;
                    case 1:
                        System.out.print(" One ");
                        break;
                    case 2:
                        System.out.print(" Two ");
                        break;
                    case 3:
                        System.out.print(" Three ");
                        break;
                    case 4:
                        System.out.print(" Four ");
                        break;
                    case 5:
                        System.out.print(" Five ");
                        break;
                    case 6:
                        System.out.print(" Six ");
                        break;
                    case 7:
                        System.out.print(" Seven ");
                        break;
                    case 8:
                        System.out.print(" Eight ");
                        break;
                    case 9:
                        System.out.print(" Nine ");
                        break;
                }
            }
        }
    }
