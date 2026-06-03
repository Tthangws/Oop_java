package HeThongDangNhap;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/10/2026
 * TIME: 2:17 PM
 */
public class Main {
    public static void main(String[] args) {
        AuthService as = new AuthService();
        try {
            System.out.println("He thong dang xu ly !");
            as.login("Nguyen Trong Thang","Tthang123");
            System.out.println("Moi thu da hoan thanh !");
        }
        catch(WeakPasswordException e){
            System.out.println("Dang ky khong thanh cong ! \n"+e.getMessage());
        }
    }
}
