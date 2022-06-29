package ss19.bai_tap.bai_2;

public class ValidatePhone {
    public static void main(String[] args) {
        String regexPhone = "^\\(84\\)\\-\\(0[0-9]{9}\\)$";
        String phone1 = "(84)-(0793193555)";
        String phone2 = "84-(0793193555)";
        String phone3 = "(09)-(0793193555)";
        String phone4 = "(84)-(079319355)";
        boolean check1 = phone1.matches(regexPhone);
        System.out.println(phone1 +":"+ check1);
        boolean check2 = phone2.matches(regexPhone);
        System.out.println(phone2 +":"+ check2);
        boolean check3 = phone3.matches(regexPhone);
        System.out.println(phone3 +":"+ check3);
        boolean check4 = phone4.matches(regexPhone);
        System.out.println(phone4 +":"+ check4);
    }
}
