package BaiTapCoGiao;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/26/2026
 */
public class DiemChuSo {
    /*Viết chương trình nhập điểm số
    và in ra điểm chữ tương ứng. VD:
    Điểm < 4:
    DEMO
    F;
    5.0 > Điểm >=4:
    D;
    5.5 > Điểm  >= 5:   D+
    6.5 > Điểm >= 5.5: C
    7.0 > Điểm >=6.5:  C+….
     */
    public static void main(String[] args) {
        double diem=9.5;
        if(diem<4){
            System.out.println("diem F");
        } else if(diem>=4&&diem<5){
            System.out.println("diem D");
        } else if(diem>=5&&diem<5.5){
            System.out.println("diem D+");
        } else if(diem>=5.5&&diem<6.5){
            System.out.println("diem C");
        } else if(diem>=6.5&&diem<7){
            System.out.println("diem C+");
        } else if(diem>=7&&diem<8){
            System.out.println("diem B");
        } else if(diem>=8&&diem<8.5){
            System.out.println("diem B+");
        } else if(diem>=8.5&&diem<9){
            System.out.println("diem A");
        } else if(diem>=9&&diem<=10){
            System.out.println("diem A+");
        }
    }
}
