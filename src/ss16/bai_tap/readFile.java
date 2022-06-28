package ss16.bai_tap;

import java.io.*;

public class readFile {
    public static void copyfile(String source, String target){
        try {
            FileReader fr = new FileReader(source);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(target);
            BufferedWriter bw= new BufferedWriter(fw);
            String line = "";
            while ((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
