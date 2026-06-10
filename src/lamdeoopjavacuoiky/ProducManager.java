package lamdeoopjavacuoiky;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 3:38 PM
 */
public class ProducManager implements IProductManager{
    Scanner sc = new Scanner(System.in);
    @Override
    public void addNewProduct(ArrayList<DiscountedProduct> productlist) {
        DiscountedProduct dp = new DiscountedProduct();
        dp.inputData();
        productlist.add(dp);
        System.out.println("Da them thanh cong !");
    }

    @Override
    public void displayProducts(ArrayList<DiscountedProduct> productlist) {
        for(DiscountedProduct i : productlist){
            i.displayData();
        }
    }

    @Override
    public void updateProductById(ArrayList<DiscountedProduct> productlist, String Id) {
        for(DiscountedProduct i : productlist){
            if(i.getId().equals(Id)){
                System.out.print("cap nhat ten moi: ");
                String newName = sc.nextLine();
                i.setProductName(newName);
                break;
            } else{
                System.out.println("khong tim thay san pham co id: "+Id);
                break;
            }
        }
    }

    @Override
    public void RemoveProductBYId(ArrayList<DiscountedProduct> productlist, String Id) {
        for(DiscountedProduct i : productlist) {
            if (i.getId().equals(Id)) {
                productlist.remove(i);
                System.out.println("da xoa thanh cong !");
                break;
            } else {
                System.out.println("khong tim thay san pham co id: " + Id);
                break;
            }
        }
    }
}
