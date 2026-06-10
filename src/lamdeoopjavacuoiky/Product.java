package lamdeoopjavacuoiky;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 3:22 PM
 */
public class Product {
    Scanner sc = new Scanner(System.in);
    private String Id;
    private String productName;
    private double price;

     public void inputData(){
         System.out.print("Nhap id: ");
         Id = sc.nextLine();
         System.out.print("Nhap ten san pham: ");
         productName = sc.nextLine();
         System.out.println("Nhap gia: ");
         price = sc.nextDouble();
     }

     public String getId(){
         return Id;
     }

     public void setProductName(String name){
         this.productName = name;
     }

     public void displayData(){
         System.out.println("ID: "+Id+" || Ten san pham: "+productName+" || Gia: "+price);
     }
}
