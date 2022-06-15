package ss7.bai_tap.bai_1;

public class Test {
    public static void main(String[] args) {
        double p = Math.floor(Math.random() * 100 + 1);
        Shapes[] array = new Shapes[3];
        array[0] = new Circle(1.0);
        array[1] = new Rectangle(1.0,2.0);
        array[2] = new Square(1.0);

        for (Shapes s:array) {
            System.out.println("old Area = " + s.getArea());
            if (s instanceof Circle){
                Circle cr = (Circle) s;
                cr.Resize(p);
                System.out.println("new ARea of Circle = " + cr.getArea());
            }if (s instanceof Rectangle){
                ((Rectangle) s).Resize(p);
                System.out.println("new area of Rectangle ="+s.getArea());
            }if (s instanceof Square){
                Square sq = (Square) s;
                sq.Resize(p);
                System.out.println("new area of Square = " + sq.getArea());
                sq.howToColor();
            }
        }
    }
}
