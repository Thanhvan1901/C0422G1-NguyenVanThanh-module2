package ss12_map.bai_tap.bai_1_QuanLiSanPham;

import java.util.Comparator;
import java.util.List;

public class Decrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
