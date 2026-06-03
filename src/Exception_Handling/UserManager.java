package Exception_Handling;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/10/2026
 * TIME: 1:46 PM
 */
public class UserManager {
    //phai co chu " throws InvalidAgeException " o duoi cua ham
    public void register(String name, int age) throws InvalidAgeException{
        if((age < 18) || (age > 100)){
            // nem ra cai loi
            throw new InvalidAgeException("Tuoi khong hop le de dang ky !");
        }
        System.out.println("Dang ky thanh cong tai khoan !");
    }
}
