package Exception_Handling;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/10/2026
 * TIME: 1:56 PM
 */
public class Main {
    public static void main(String[] args) {
        UserManager manager = new UserManager();
        try {
            System.out.println("He thong dang xu ly dang ky !");
            manager.register("Thang",14);
            System.out.println("Moi thu tuc da xong !");
        }
        catch (InvalidAgeException e){
            // Lưới an toàn chụp được lỗi!
            // Thay vì app bị crash đỏ lòm, mình chủ động lấy "hồ sơ" (e) ra để in thông báo êm ái
            System.out.println("Oops, khong the dang ky. ly do : "+e.getMessage());
        }
        System.out.println("Chương trình vẫn tiếp tục chạy các việc khác bình thường...");
    }
}
