package ss5.bai_tap.bai_1;

public class Circle {
    private static double radius = 1.0 ;
    private String color = "red" ;
    public  Circle(){
    }
    public  Circle(double radius){
        this.radius = radius ;
    }
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = radius *2 * 3.14 ;
        return area ;
    }

}