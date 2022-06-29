package ss19.bai_tap.bai_1;

public class classText {
    public static void main(String[] args) {
        String regexClass = "^[C|A|P][0-9]{4}[G|H|I|K|L|M]$";
        String class1 = "C0422G";
        String class2 = "CDB2281";
        String class3 = "C034g1";
        boolean check1 = class1.matches(regexClass);
        System.out.println(class1+ ":" + check1);
        boolean check2 = class2.matches(regexClass);
        System.out.println(class2+ ":" + check2);
        boolean check3 = class3.matches(regexClass);
        System.out.println(class3+ ":" + check3);
    }
}
