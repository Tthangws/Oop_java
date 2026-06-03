package Trenlop;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/16/2026
 * TIME: 2:13 PM
 */
public class Chuong3Slide14 {
    //thuoc tinh
    private int A;
    private int B;
    // constructer
    Chuong3Slide14(int A,int B){
        this.A = A;
        this.B = B;
    }

    //phuong thuc
    public int tong(){
        return (this.A + this.B);
    }

    public static void main(String[] args) {
        Chuong3Slide14 cs = new Chuong3Slide14(55,9);
        System.out.println("Tong 2 so la : "+cs.tong());
    }

}
