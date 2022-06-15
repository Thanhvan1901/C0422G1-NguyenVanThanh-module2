package ss7.bai_tap.bai_1;

import ss7.bai_tap.bai_2.Colorable;

public class Square extends Rectangle implements Colorable {
    public Square(){

    }

    public Square(double side) {
        super(side,side);
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
