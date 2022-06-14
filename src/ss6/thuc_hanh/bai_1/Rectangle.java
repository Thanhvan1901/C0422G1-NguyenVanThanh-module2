package ss6.thuc_hanh.bai_1;

public class Rectangle extends Shape {
    private double width = 1.0 ;
    private double length = 1.0 ;
    public Rectangle(){

    }
    public Rectangle(double width , double length , String color , boolean filled){
        super(color , filled);
        this.width = width ;
        this.length = length ;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.width * this.length ;
    }
    public double getPerimeter(){
        return 2 * (this.width + this.length) ;
    }
    @Override
    public String toString(){
        return "hình chữ nhât có width = "
                + getWidth()
                + "length : "
                + getLength()
                + " Diện tích ="
                + getArea()
                + "chu vi"
                + getPerimeter()
                + super.toString() ;
    }
}
