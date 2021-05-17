package bai11_java_collection_framework.bai_tap.su_dung_arraylít_likedlist;

import java.util.Comparator;

public class SortProductByPriceDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice()>o2.getPrice()){
            return -1;
        }
        return 1;
    }
}
