package ss8.Thuc_hanh.bai_1;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0 ;
        boolean isBuzz = number % 5 == 0 ;
        if(isBuzz && isFizz){
            return "FizzBuzz";
        }
        if(isBuzz){
            return "Buzz";
        }
        if(isFizz)
            return "Fizz";

        return number + "";

    }
}
