package ss5.thuc_hanh.bai1;

public class Student {
    private int roolno ;
    private String name ;
    private static String school = "DHDT" ;
    Student(int r , String n) {
        roolno = r ;
        name = n ;
    }
    static void chang(){
        school = "CODEGYM" ;
    }
    void display(){
        System.out.println(roolno + " " + name + " " + school);
    }

    public static void main(String[] args) {
        Student.chang();
        Student s1 = new Student(1,"Nguyễn Văn A") ;
        Student s2 = new Student(2,"Nguyễn Văn B") ;
        Student s3 = new Student(3,"Nguyễn Văn C") ;

        s1.display();
        s2.display();
        s3.display();
    }
}


