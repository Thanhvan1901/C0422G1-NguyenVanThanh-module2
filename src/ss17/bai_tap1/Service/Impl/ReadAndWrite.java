package ss17.bai_tap1.Service.Impl;

import ss17.bai_tap1.Model.ProductManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<ProductManagement> readDataFromFile(String path) {
        File file = new File(path);
        List<ProductManagement> products = new ArrayList<>();
        try {
            if (file.length()>0){
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                products = (List<ProductManagement>) ois.readObject();
                fis.close();
                ois.close();
            }else {
                System.err.println("File rỗng!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public static void writeToFile(String path, List<ProductManagement> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
