package ss5.thuc_hanh.bai2;

public class Car {
    private String name ;
    private String engine ;
    private static int numberOfCars ;
    public Car(String name , String engine){
        this.name = name ;
        this.engine = engine ;
        numberOfCars++ ;
    }
    public void display(){
        System.out.println(name + " " + engine);
    }

    public static void main(String[] args) {
        Car s1 = new Car("Mazda 3" ,"Skyactiv 3" ) ;
        System.out.println(Car.numberOfCars);
        s1.display();
        Car s2 = new Car("Mazda 6" ,"Skyactiv 6") ;
        System.out.println(Car.numberOfCars);
        s2.display();
    }
}
