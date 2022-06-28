package ss16.Thuc_hanh.bai_2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static ss16.Thuc_hanh.bai_2.ReadAndWriteFile.findMax;

public class Test {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> num = readAndWriteFile.readFile("src/ss16/Thuc_hanh/bai_2/numbers.txt");
        int maxValue = findMax(num);
        readAndWriteFile.writeFile("src/ss16/Thuc_hanh/bai_2/result.txt", maxValue);
    }
}
