package demo.Controller;

import demo.Service.Impl.CarService;
import demo.Service.Impl.MotoService;
import demo.Service.Impl.TruckService;

import java.util.Scanner;

public class DisplayController {
    public static void displayMainMenu() {
        CarService carService = new CarService();
        TruckService truckService = new TruckService();
        MotoService motoService = new MotoService();
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("1.Xe Oto \n 2.Xe tải \n 3.xe máy ");
            num = Integer.parseInt(input.nextLine());
            switch (num){
                case 1:
                    do {
                        System.out.println("Menu xe oto");
                        System.out.println("1.Thêm \n" +
                                "2.Hiện \n" +
                                "3.Sửa \n" +
                                "4.Xóa \n" +
                                "0. xóa");
                        System.out.println("Chọn chức năng");
                        num = Integer.parseInt(input.nextLine());
                        switch (num) {
                            case 1:
                                carService.add();
                                break;
                            case 2:
                                carService.display();
                                break;
                            case 3:
                                carService.del();
                                break;
                            case 4:
                                carService.search();
                                break;
                        }
                    } while (num != 0);
                case 2:
                    do {
                    System.out.println("Menu xe máy");
                    System.out.println("1.Thêm \n" +
                            "2.Hiện \n" +
                            "3.Sửa \n" +
                            "4.Xóa \n" +
                            "0. xóa");
                    System.out.println("Chọn chức năng");
                    num = Integer.parseInt(input.nextLine());
                    switch (num) {
                        case 1:
                            motoService.add();
                            break;
                        case 2:
                            motoService.display();
                            break;
                        case 3:
                            motoService.del();
                            break;
                        case 4:
                            motoService.search();
                            break;
                    }
                } while (num != 0);
                case 3:
                    do {
                        System.out.println("Menu tải");
                        System.out.println("1.Thêm \n" +
                                "2.Hiện \n" +
                                "3.Sửa \n" +
                                "4.Xóa \n" +
                                "0. xóa");
                        System.out.println("Chọn chức năng");
                        num = Integer.parseInt(input.nextLine());
                        switch (num) {
                            case 1:
                                truckService.add();
                                break;
                            case 2:
                                truckService.display();
                                break;
                            case 3:
                                truckService.del();
                                break;
                            case 4:
                                truckService.search();
                                break;
                        }
                    } while (num != 0);
            }

        }while (num < 4 && num > 0);

    }
}
