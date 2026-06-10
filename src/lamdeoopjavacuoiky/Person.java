package lamdeoopjavacuoiky;

import java.util.Scanner;/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 1:17 PM
 */

public class Person {
    private String Id;
    private String FullName;
    private String YearOfBirth;

    public void InputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        Id = sc.nextLine();
        System.out.println("nhap ten: ");
        FullName = sc.nextLine();
        System.out.println("nhap nam sinh: ");
        YearOfBirth = sc.nextLine();
    }
    public String getId(){
        return Id;
    }
    public void setFullName(String newName){
        this.FullName = newName;
    }

    public void DisplayData(){
        System.out.println("id: "+Id+" || ho va ten: "+FullName+" || nam sinh: "+YearOfBirth);
    }
}
