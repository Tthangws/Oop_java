package lamdeoopjavacuoiky;
import java.util.Scanner;
/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 1:12 PM
 */
public class nhapsonguyenduong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tongchan=0;
        while(true){
            System.out.print("Nhap so nguyen duong: ");
            int n = sc.nextInt();
            if(n<=0){
                break;
            }
            if(n%2 == 0){
                tongchan += n;
            }
        }
        System.out.println("tong chan: "+tongchan);

    }
}
