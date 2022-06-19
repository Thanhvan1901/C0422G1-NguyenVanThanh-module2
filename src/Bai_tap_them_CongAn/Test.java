package Bai_tap_them_CongAn;

import java.util.ArrayList;

import Bai_tap_them_CongAn.Vehicle;
import Bai_tap_them_CongAn.Car;
import Bai_tap_them_CongAn.Truck;
import Bai_tap_them_CongAn.Motorcycle;

import java.util.ArrayList;
import java.util.Scanner;

class Manage {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Car> car = new ArrayList<>();
        ArrayList<Truck> truck = new ArrayList<>();
        ArrayList<Motorcycle> motorcycle = new ArrayList<>();
        int num , select;

        vehicles.add(new Car("9999", "Honda", 2022, "join", 4, "sport car"));
        vehicles.add(new Truck("0000", "Huyn Dai", 2020, "jenny", 9));
        vehicles.add(new Motorcycle("70741", "yamaha", 2015, "son", 150));
        System.out.println("1: Thêm ");
        System.out.println("2: Tìm Kiếm ");
        System.out.println("3: Hiện ");
        System.out.println("4: Xóa ");
        System.out.println("Nhập số để chọn ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        select = input.nextInt();
        switch (num){
            case 1 :
                System.out.println("Chọn Phương Tiền Cần Thêm ");
                System.out.println("1: Xe máy ");
                System.out.println("2: Xe tải ");
                System.out.println("3: oto ");
                switch (select){ // Thêm phương tiện
                    case 1:
                        car.add(new Car());
                    case 2 :
                        truck.add(new Truck());
                    case 3 :
                        motorcycle.add(new Motorcycle());
                }
            case 2 :

        }
    }
}
