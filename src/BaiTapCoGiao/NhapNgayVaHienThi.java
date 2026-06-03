package BaiTapCoGiao;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/26/2026
 */
public class NhapNgayVaHienThi {
    /*Viết chương trình nhập vào một số
    ngày và hiển thị tương ứng trong
    tuần lễ
     */
    public static void main(String[] args) {
        System.out.println("nhap vao 1 so bat ky tu 0 toi 6 : ");
        Scanner sc=new Scanner(System.in);
        int ngay=sc.nextInt();
        switch(ngay){
            case 0:
                System.out.println("chu nhat");
                break;
            case 1:
                System.out.println("thu 2");
                break;
            case 2:
                System.out.println("thu 3");
                break;
            case 3:
                System.out.println("thu 4");
                break;
            case 4:
                System.out.println("thu 5");
                break;
            case 5:
                System.out.println("thu 6");
                break;
            case 6:
                System.out.println("thu 7");
                break;
            default:
                System.out.println("so ngay trong tuan sai");
        }
    }
}
