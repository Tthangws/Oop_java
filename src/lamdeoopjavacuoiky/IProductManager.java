package lamdeoopjavacuoiky;

import java.util.ArrayList;

public interface IProductManager {
    void addNewProduct(ArrayList<DiscountedProduct> productlist);
    void displayProducts(ArrayList<DiscountedProduct> productlist);
    void updateProductById(ArrayList<DiscountedProduct> productlist,String Id);
    void RemoveProductBYId(ArrayList<DiscountedProduct> productlist, String Id);
}
