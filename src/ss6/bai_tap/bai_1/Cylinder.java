package ss6.bai_tap.bai_1;

public class Cylinder extends Circle{
    private double length ;
    public Cylinder(){

    }
    public Cylinder(double length , double radius , String color){
        super(radius , color);
        this.length = length ;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getVolume(){
        return super.getArea() * this.length ;
    }

    @Override
    public String toString() {
        return super.toString()
                +"Cylinder{" +
                "length=" + length +
                '}'
                + " thể tích của hình trụ = "
                + getVolume() ;
    }
}
