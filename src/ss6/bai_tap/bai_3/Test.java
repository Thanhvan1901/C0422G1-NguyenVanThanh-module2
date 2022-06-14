package ss6.bai_tap.bai_3;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(3,5,1,6);

        System.out.println("trc khi move " + moveablePoint);

        moveablePoint.move();

        System.out.println("sau khi move " + moveablePoint);
    }

}
