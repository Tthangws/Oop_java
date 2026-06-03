package TuHoc;

import java.util.Scanner;

public class Hocjava {
    public static void main(String[] args) {
        //bt : tìm x,y khi biết tổng và hiệu của chúng
        //case test : tong = 14,hieu = 5 => x=9,y=5;
        //case 2 : tong = 8,hieu = 5 => x=6.5, y=1.5;

        double T,H,x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("moi nhap tong : ");
        T=sc.nextDouble();
        System.out.print("\nmoi nhap hieu : ");
        H=sc.nextDouble();
        y= (T-H)/2;
        x=H+y;
        System.out.println("vay x = "+x);
        System.out.println("    y = "+y);


    }
}
