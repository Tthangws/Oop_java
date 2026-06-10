package lamdeoopjavacuoiky;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 3:31 PM
 */
public class DiscountedProduct extends Product{
    private double discountedProduct;

    @Override
    public void inputData(){
        super.inputData();
        System.out.print("Nhap giam gia san pham: ");
        discountedProduct = sc.nextDouble();
    }

    @Override
    public void displayData(){
        super.displayData();
        System.out.println("Giam gia: "+discountedProduct);
    }
}
