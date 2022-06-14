package ss6.thuc_hanh.bai_1;

public class Circle extends Shape{
    private double radius = 1.0 ;
    public Circle(){

    }
    public Circle(double radius , String color , boolean filled){
        super(color , filled);
        this.radius = radius ;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2) * 3.14 ;
    }
    public double getPerimeter(){
        return 2 * this.radius * 3.14 ;
    }
    @Override
    public String toString(){
        return super.toString() + "Bán Kính + = " + radius
                + " ; diện tích của hình tròn là : " + getArea()
                + "chu vi của hình tròn là : " + getPerimeter() ;
    }

}
