package ss2_loop.bai_tap;

public class Showsnt {
    public static void main(String[] args) {
        System.out.println("Hiển Thị Các Số Nguyên Tố Nhỏ Hơn 100");
        int number = 2 ;
        int count = 0 ;
        int i;
        while (number < 100){
            for (i = 2 ; i < number ; i++){
                if (number % i == 0){
                    count++ ;
                    break;
                }
            }
            if (count == 0){
                System.out.println(number);

            }
            number++ ;
            count = 0 ;
        }
    }
}
