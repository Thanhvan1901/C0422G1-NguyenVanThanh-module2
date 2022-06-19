package ss7.thuc_hanh.bai_2;

public abstract class Circle{
    private double radius ;
    private String color ;
    public Circle (){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(this.radius,2) * 3.14 ;
    }
    public double getPerimeter(){
        return 2 * this.radius * 3.14 ;
    }
    @Override
    public String toString(){
        return "hình tròn có màu "
                + color
                +"Hình Tròn Có Bán Kính"
                + radius
                + " - Diện tích là : "
                + getArea()
                + " - Chu vi là : "
                +getPerimeter() ;
    }
}
