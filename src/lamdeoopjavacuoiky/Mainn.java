package lamdeoopjavacuoiky;

import java.util.ArrayList;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 3:46 PM
 */
public class Mainn {
    public static void main(String[] args) {
        ArrayList<DiscountedProduct> mainlist = new ArrayList<>();
        ProducManager pm = new ProducManager();

        //them san pham
        pm.addNewProduct(mainlist);
        pm.addNewProduct(mainlist);
        pm.addNewProduct(mainlist);

        //hien thi san pham
        pm.displayProducts(mainlist);

        //update san pham
        pm.updateProductById(mainlist,"A12");
        pm.updateProductById(mainlist,"P34");

        //xoa san pham
        pm.RemoveProductBYId(mainlist,"A12");
        pm.RemoveProductBYId(mainlist,"D34");

    }
}
