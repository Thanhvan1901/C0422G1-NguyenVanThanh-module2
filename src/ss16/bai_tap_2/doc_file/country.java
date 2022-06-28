package ss16.bai_tap_2.doc_file;

public class country {
    private int id;
    private String code;
    private String name;

    public country(int parseInt, String s, String s1) {
    }

    public void Nation() {
    }

    public void Nation(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToCSV(){
        return getId() +","+getCode()+","+getName();
    }
}
