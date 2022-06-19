package ss7.thuc_hanh.bai_2;

public class ComparableCircle extends Circle implements IComparable<ComparableCircle>{
    public ComparableCircle(){

    }
    public ComparableCircle( double radius){
        super(radius);
    }
    public ComparableCircle(double radius , String color ){
        super(radius, color);
    }

    @Override
    public void compareTo() {


    }
}
