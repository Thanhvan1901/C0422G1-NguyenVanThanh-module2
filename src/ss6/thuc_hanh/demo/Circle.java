package ss6.thuc_hanh.demo;

public class Circle extends Geometric{
    private double radius ;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, String filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2) * 3.14 ;
    }
    public  double getPerimeter(){
        return 2 * radius * 3.14 ;
    }
    public double getDiameter(){
        return 2 * radius ;
    }
    public void display(){
        super.display();
        System.out.println("Nhập bán kính");
        double radius = Integer.parseInt(input.nextLine()) ;
    }
    public String toString(){
       return super.toString() + " , Bán kính : " + this.radius + " , Diện Tích : " + getArea() + ", Chu Vi : " + getPerimeter() + " , Đường kính : " + getDiameter();
    }
}
