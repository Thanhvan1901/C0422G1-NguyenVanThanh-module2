package ss16.bai_tap_2.doc_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<country> readNationFileCSV(String pathFile){
        List<country> nationList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line="";
        String[]array = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!=null){
                array = line.split(",");
                country nation = new country(Integer.parseInt(array[0]),array[1],array[2]);
                nationList.add(nation);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return nationList;
    }

    public static void main(String[] args) {
        List<country> nationList = readNationFileCSV("src/ss16/bai_tap_2/doc_file/quoc_gia.txt");
        for (int i = 0; i < nationList.size(); i++) {
            System.out.println(nationList.get(i).getName());
        }
    }
}
