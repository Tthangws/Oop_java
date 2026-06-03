package TuHoc;

import java.util.Scanner;

public class Hocjava4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*viet chuong trinh nhap 2 so nguyen duong va in ra dong thoi tong, hieu, tich, thuong 2 so

         */
        System.out.println("nhap so nguyen thu nhat : ");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("nhap so nguyen thu hai : ");
        int b=sc.nextInt();
        if(a<=0||b<=0){
            System.out.println("so vua nhap co so khong phai so nguyen duong !");
            return;
        }
        System.out.println(a+" + "+b+" = "+(a+b) );
        System.out.println(a+" - "+b+" = "+(a-b) );
        System.out.println(a+" * "+b+" = "+(a*b) );
        if(b!=0) {
            System.out.println(a+" / "+b+" = " + (double) (a / b));
        }
        else System.out.println("khong co phep chia vi khong the chia cho so 0 !");
        if(a>b){
            System.out.println("so "+a+" lon hon "+b);
        }
        else
            System.out.println("so "+a+" be hon "+b);
    }
}
