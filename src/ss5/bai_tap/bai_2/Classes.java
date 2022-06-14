package ss5.bai_tap.bai_2;

public class Classes {
    private String name = "John" ;
    private String classes = "C02" ;
    public Classes(){

    }
    public Classes(String name , String classes){
        this.name = name ;
        this.classes = classes ;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void setClasses(String classes) {
        this.classes = classes;
        System.out.println(classes);
    }
}
