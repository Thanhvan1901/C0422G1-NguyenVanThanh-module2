package ss16.Thuc_hanh.bai_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile  (String filePath){
        List<Integer> num = new ArrayList<>();
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine() )!= null ){
                num.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e ){
            System.out.println("File không tồn tại hoặc bị lỗi");
        }
        return num;
    }
    public void writeFile(String filePath , int max){
        try {
            FileWriter fileWriter = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhấ là : " + max);
            bufferedWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> num ) {
        int max = num.get(0);
        for (int i = 0; i < num.size(); i++) {
            if (max < num.get(i)) {
                max = num.get(i);
            }
        }
        return max;
    }
}
