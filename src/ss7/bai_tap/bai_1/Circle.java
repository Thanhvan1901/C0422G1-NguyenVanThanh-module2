package ss7.bai_tap.bai_1;

public class Circle extends Shapes implements Resizeable {
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * 3.14;
    }
    @Override
    public double getPerimeter() {
        return 2 * this.radius * 3.14;
    }
    public void resize(double percent) {
        radius+=radius*percent/100;
    }
}
