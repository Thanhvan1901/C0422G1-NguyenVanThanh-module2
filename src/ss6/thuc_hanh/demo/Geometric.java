package ss6.thuc_hanh.demo;

import java.util.Scanner;

public class Geometric {
    private String color , filled ;
    Scanner input = new Scanner(System.in) ;
    public Geometric(){

    }

    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }
    public void display(){
        System.out.println("Nhập màu");
        String color = input.nextLine() ;
        System.out.println("Nhập Hình");
        String filled = input.nextLine();

    }

    @Override
    public String toString() {
        return "Geometric{" +
                "color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }
}
