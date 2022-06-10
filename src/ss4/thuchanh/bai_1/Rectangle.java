package ss4.thuchanh.bai_1;

public class Rectangle {
    double hight, wight;

    public Rectangle() {
    }

    public Rectangle(double wight, double hight) {
        this.wight = wight;
        this.hight = hight;
    }

    public double getArea() {
        return this.hight * this.wight;
    }

    public double getPerimeter() {
        return (this.wight + this.wight) * 2;
    }

    public String getDisplay() {
        return "Rectangle : wight = " + wight + " ; hight = " + hight + "";
    }
}
