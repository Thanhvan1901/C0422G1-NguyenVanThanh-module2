package ss17.bai_tap1.Controller;

import ss17.bai_tap1.Service.Impl.ServiceImpl;

import java.util.Scanner;

public class Display {
    public static void displayProduc(){
        ServiceImpl serviceProduc = new ServiceImpl();
        Scanner input = new Scanner(System.in);
        int num = 0  ;
        while (true){
            System.out.println("Menu \n"+
                    "1.Thêm Sản Phẩm \n" +
                    "2.Hiển Thị \n" +
                    "3.Tìm Kiếm");
           try {
               System.out.println("Chọn Chức Năng");
               num = Integer.parseInt(input.nextLine());
           }catch (Exception e){
               System.out.println("Nhập sai định dạng");
           }
            switch (num){
                case 1:
                    serviceProduc.addProduc();
                    break;
                case 2:
                    serviceProduc.displayProduc();
                    break;
                case 3:
                    serviceProduc.searchProduc();
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại nhá bạn iê");
            }
        }
    }
}
