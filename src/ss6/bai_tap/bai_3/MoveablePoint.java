package ss6.bai_tap.bai_3;

public class MoveablePoint extends Point{
    protected float xSpeed = 0.0f ;
    protected float ySpeed = 0.0f ;

    //contructor ko tham số
    public MoveablePoint() {
    }

    //contructor có 2 tham của lớp con
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //contructor full tham số
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed ,float ySpeed){
        this.xSpeed = xSpeed ;
        this.ySpeed = ySpeed ;
    }
    public float[] getSpeed(){
        float[] arr = {xSpeed , ySpeed} ;
        return arr ;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    public MoveablePoint move(){
        setX(super.getX() + xSpeed);
        setY(super.getY() + ySpeed);
        return this ;
    }
}
