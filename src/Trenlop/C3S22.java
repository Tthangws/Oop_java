package Trenlop;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/16/2026
 * TIME: 2:38 PM
 */
public class C3S22 {
    //thuoc tinh
    private double A ;
    private double B ;
    //constructer
    C3S22(double A,double B){
        this.A = A;
        this.B = B;
    }
    //phuong thuc
    //giai pt bac nhat
    public void giaiPT(){
        System.out.println("===== GIAI PT BAC NHAT AX + B = 0 =====");
        System.out.println("ket qua cua phuong trinh "+this.A+"X + "+this.B+" = 0 la : ");
        System.out.println("X = "+(-this.B/this.A));
    }

    public static void main(String[] args) {
        //khoi tao
        C3S22 cs = new C3S22(10,-20);
        cs.giaiPT();

    }
}
