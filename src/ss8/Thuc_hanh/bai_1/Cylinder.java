package ss8.Thuc_hanh.bai_1;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI  * radius;
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
}
