package ss17.bai_tap1.Service.Impl;

import ss17.bai_tap1.Model.ProductManagement;
import ss17.bai_tap1.Service.Service;

import java.util.List;
import java.util.Scanner;

public class ServiceImpl implements Service {
   List<ProductManagement> produceList = ReadAndWrite.readDataFromFile("src/ss17/bai_tap/Service/Impl/produce.txt");
    Scanner input = new Scanner(System.in);
    @Override
    public void addProduc() {
        int code = 0 ;
        double price = 0 ;
        try {
            System.out.println("Nhập Mã Sản Phẩm");
         code = Integer.parseInt(input.nextLine());
        }catch (Exception e){
            System.out.println("Nhập sai định dạng");
            return;
        }
        System.out.println("Nhập tên sản phẩm");
        String name = input.nextLine();
        System.out.println("Hãng sản phẩm ");
        String producName = input.nextLine();
        try {
            System.out.println("Nhập giá của sản phẩm ");
            price = Double.parseDouble(input.nextLine());
        }catch (Exception e){
            System.out.println("Nhập Sai Định dạng");
            return;
        }
        System.out.println("Nhập các mô tả của sản phẩm");
        String describe = input.nextLine();
        ProductManagement product = new ProductManagement(code ,name,producName,price,describe);
        produceList.add(product);
        ReadAndWrite.writeToFile("src/s17_io_binary_file_va_serialization/bai_tap/Services/impl/Product1.txt", produceList);
        displayProduc();
    }

    @Override
    public void displayProduc() {
        for (ProductManagement s: produceList) {
            System.out.println(s);
        }
    }

    @Override
    public void searchProduc() {
        System.out.println("Nhập mã sản phẩm cần tìm kiếm");
        int code = Integer.parseInt(input.nextLine());
        for (int i = 0; i < produceList.size(); i++) {
            if(code == produceList.get(i).getCode()){
                System.out.println(produceList.get(i));
            }
        }
    }
}
