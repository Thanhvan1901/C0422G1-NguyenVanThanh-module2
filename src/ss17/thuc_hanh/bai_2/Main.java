package ss17.thuc_hanh.bai_2;

import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path , List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oss =new ObjectOutputStream(fos);
            oss.writeObject(students);
            oss.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Nguyễn Văn Thanh","Đà Nẵng"));
        students.add(new Student(2,"Võ Như Vinh ","Quảng Nam "));
        students.add(new Student(3,"Trịnh Minh Đức","Đà Nẵng"));
        writeToFile("src/ss17/thuc_hanh/bai_2/student.txt",students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }

    }
    public static List<Student> readDataFromFile (String path){
        List<Student> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
