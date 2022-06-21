package ss12_map.bai_tap.bai_1_QuanLiSanPham;

import java.util.Scanner;

public class TestMvc {
    public static void main(String[] args) {
        int num ;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1.Thêm sản phẩm.\n" +
                    "2.Sửa thông tin sản phẩm theo id.\n" +
                    "3.Xoá sản phẩm theo id.\n" +
                    "4.Hiển thị danh sách sản phẩm.\n" +
                    "5.Tìm kiếm sản phẩm theo tên.\n" +
                    "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá.");
            System.out.println("Chon Chức Năng");

            num = Integer.parseInt(input.nextLine());
            switch (num){
                case 1 :
                    ProductManager.add();
                    break;
                case 2 :
                    ProductManager.edit();
                    break;
                case 3 :
                    ProductManager.del();
                    break;
                case 4 :
                    ProductManager.display();
                    break;
                case 5 :
                    ProductManager.find();
                    break;
                case 6 :
                    System.out.println("1.giá tăng dần.\n2.Giá giảm dần");
                    int in = Integer.parseInt(input.nextLine());
                    if(in == 1){
                        ProductManager.sortProduct();
                    }else if(in == 2){
                        ProductManager.sortDecrease();
                    }else {
                        break;
                    }
                    break;
                default: break;
            }
        }while (num <= 6);
    }
}
