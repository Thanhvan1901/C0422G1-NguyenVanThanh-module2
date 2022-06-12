package ss4.bai_tap.bai_3;

public class Fan {
    final int SLOW = 1 ;
    final int MEDIUM = 2 ;
    final int FAST  = 3 ;
    private int speed ;
    private double radius ;
    private boolean on ;
    private String color ;

    public Fan() {
        radius = 5 ;
        color = "blue" ;
        speed = SLOW ;
        on = false ;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void fans(){
        if(!isOn()){
            System.out.println("Tắt" + getRadius() + getColor());
        }else {
            System.out.println("Bật " + getRadius() + getColor() + getSpeed());
        }
    }

    public static void main(String[] args) {
        Fan fan = new Fan() ;
        fan.fans();
        Fan fan2 = new Fan();
        fan2.setOn(true);
        fan2.setSpeed(fan2.FAST);
        fan2.setRadius(10);
        fan2.setColor("yellow");
        fan2.fans();
    }
}