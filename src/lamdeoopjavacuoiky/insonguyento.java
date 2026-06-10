package lamdeoopjavacuoiky;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 1:55 PM
 */
public class insonguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nguyen duong: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("phai nhap so nguyen duong! vui long nhap lai.");
            n = sc.nextInt();
        }

        boolean songuyento = true;

        if(n<=1){
            songuyento = false;
        } else{
            for(int i = 2; i*i<=n;i++){
                if(n%i==0){
                    songuyento = false;
                    break;
                }
            }
        }

        if(songuyento){
            System.out.println(n+" la so nguyen to !");
        } else{
            System.out.println(n+ " khong phai so nguyen to !");
        }
    }
}
