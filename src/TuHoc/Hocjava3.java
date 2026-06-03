package TuHoc;

import java.util.Scanner;

public class Hocjava3 {
    public static void main(String[] args) {
        /*Đề bài: Nhập vào một số nguyên n (từ 2 đến 9). Hãy in ra bảng cửu chương của số đó.
         */
        //khao bao 1 so kieu int và kiem tra chan le
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap 1 so bat ky : ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("so vua nhap la so chan !");
        }
        else
            System.out.println("so vua nhap la so le !");

        for(int i=0;i<a;i++){
            System.out.println(a+" * "+i+" = "+(a*i));
        }


    }
}
