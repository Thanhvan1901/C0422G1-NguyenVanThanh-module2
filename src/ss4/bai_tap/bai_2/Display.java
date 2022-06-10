package ss4.bai_tap.bai_2;

public class Display {
    public static void main(String[] args) {
        StopWatch date = new StopWatch();

        date.start();
        for (int i = 0; i < 100000000; i++) {
            for (int j = 0; j < 1000000000; j++) {
                i++;
            }

        }
        date.end();
        System.out.println(date.getElapsedTime());

    }
}
