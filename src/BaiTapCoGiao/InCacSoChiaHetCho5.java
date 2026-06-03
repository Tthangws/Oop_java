package BaiTapCoGiao;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/27/2026
 */
public class InCacSoChiaHetCho5 {
    /*Viết chương trình hiển thị các số
    chia hết cho 5 trong phạm vi từ
    0 đến 20.

    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("cac so chia het cho 5 la : ");
        for(int i=0;i<=20;i++){
            //nếu i không chia hết cho 5 thì quay lại vòng lặp for

            if(i%5!=0){
                continue;
            }
            System.out.println(i);
        }
    }

}
