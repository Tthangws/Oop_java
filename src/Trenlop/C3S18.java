package Trenlop;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/16/2026
 * TIME: 2:26 PM
 */
public class C3S18 {
    //thuoc tinh
    private int a;
    //constructer
    C3S18(int a){
        this.a = a;
    }
    //thuoc tinh
    //kiem tra so nguyen to
    public void numbercheck(){
        for(int i = 2; i < a;i++){
            if(this.a % i == 0){
                System.out.println("Khong phai so nguyen to !");
                return;
            }
        }
        System.out.println("La so nguyen to !");
    }

    //main
    public static void main(String[] args) {
        //khoi tao
        C3S18 cs = new C3S18(5);
        cs.numbercheck();
    }
}
