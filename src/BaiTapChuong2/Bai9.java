package BaiTapChuong2;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/2/2026
 * TIME: 5:39 PM
 */
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi bat ky : ");
        String chuoi=sc.nextLine();

        int countThuong=0;
        int countHoa=0;
        int countSo=0;
        for(int i =0;i<chuoi.length();i++){
            if('a' <= chuoi.charAt(i) && chuoi.charAt(i) <= 'z'){
                countThuong++;
            }
            if('A' <= chuoi.charAt(i) && chuoi.charAt(i) <= 'Z'){
                countHoa++;
            }
            if('0' <= chuoi.charAt(i) && chuoi.charAt(i) <= '9'){
                countSo++;
            }
        }
        System.out.println("So ky tu thuong trong chuoi = "+countThuong);
        System.out.println("So ky tu hoa trong chuoi = "+countHoa);
        System.out.println("So ky tu so trong chuoi = "+countSo);
    }
}
