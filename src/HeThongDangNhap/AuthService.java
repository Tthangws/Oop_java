package HeThongDangNhap;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/10/2026
 * TIME: 2:10 PM
 */
public class AuthService {
    public void login(String username, String password) throws WeakPasswordException{
        if( password.length() < 6){
            throw new WeakPasswordException("MAt khau qua ngan, phai co it nhat 6 ky tu !");
        }
        System.out.println("Mat khau hop le. Chao mung : "+username+"\n dang nhap thanh cong !");
    }
}
