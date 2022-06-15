package ss7.bai_tap.bai_1;

import ss6.thuc_hanh.bai_1.TestRetangle;

public class Rectangle extends Shapes implements Resizeable {
    private double width = 1.0 ;
    private double length = 1.0 ;
    public Rectangle(){

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
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
    @Override
    public double getArea(){
        return this.width * this.length ;
    }
    @Override
    public double getPerimeter(){
        return 2 * (this.width + this.length) ;
    }
    @Override
    public void Resize(double percent) {
        length+=length*percent/100;
        width+=width*percent/100 ;
    }
}
